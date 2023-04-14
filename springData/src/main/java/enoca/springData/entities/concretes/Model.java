package enoca.springData.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="models")
@Data
@AllArgsConstructor
@Entity
public class Model {
 
	@Id // primary key alanı olduğu bildiriliyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)//pk'yı otomatik artırmak için
    @Column(name="id")
	private int id;
    @Column(name="name")
	private String name;
    
    @ManyToOne
    @JoinColumn(name = "brand_id")
	private Brand brand;
}
