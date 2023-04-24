package enoca.springData.business.rules;

import org.springframework.stereotype.Service;

import enoca.springData.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class BrandBusinessRules {
	
	private BrandRepository brandRepository;
	
	public void checkIfBrandName(String name) {
		
		if(this.brandRepository.existByName(name)) {
			
			throw new RuntimeException("Brand name already exist");
			
		}
		
	}

}
