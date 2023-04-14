package enoca.springData.dataAccess.abstracts;




import org.springframework.data.jpa.repository.JpaRepository;

import enoca.springData.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	                                                 //hangi nesneden ve onun pk alanı
	
	
	

}
