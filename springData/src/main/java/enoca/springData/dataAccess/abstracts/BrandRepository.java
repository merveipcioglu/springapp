package enoca.springData.dataAccess.abstracts;




import org.springframework.data.jpa.repository.JpaRepository;

import enoca.springData.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	                                                 //hangi nesne(brands table ın) ve onun primary key  alanının tipi
	
	
	boolean existByName(String name);

}
