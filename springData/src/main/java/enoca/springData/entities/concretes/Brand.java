package enoca.springData.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="brands")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Brand {
	@Id // primary key alanı olduğu bildiriliyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)//pk'yı otomatik artırmak için
    @Column(name="id")
	private int id;
    @Column(name="name")
	private String name;
    
    
    
    
	@OneToMany(mappedBy = "brand")
	List<Model> models; //tablolar arasındaki bağlandı kuruldu
	
	


	
	
	
	
	

	
	
}
