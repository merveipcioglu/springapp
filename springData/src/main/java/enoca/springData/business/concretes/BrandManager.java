package enoca.springData.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import enoca.springData.business.abstracts.BrandService;
import enoca.springData.business.request.CreateBrandRequest;
import enoca.springData.business.request.UpdateBrandRequest;
import enoca.springData.business.responses.GetAllBrandsResponse;
import enoca.springData.dataAccess.abstracts.BrandRepository;
import enoca.springData.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;
	
//marka ile ilgili işlemleri yapabilmem için bana brandrepository vermelisin
	


	public List<GetAllBrandsResponse> getAll(){
		
		List<Brand> brands = brandRepository.findAll();//veri tabanından gelecek olan veriler
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();//döndüreceğim veri
		
		for(Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
		    responseItem.setName(brand.getName());			
			brandsResponse.add(responseItem);
		}
		return brandsResponse;
		

	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());		
		
		this.brandRepository.save(brand);
	}


	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = new Brand();
		brand.setName(updateBrandRequest.getName());
		brand.setId(updateBrandRequest.getId());
		
		this.brandRepository.save(brand);
		
		
	}


	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}
}
