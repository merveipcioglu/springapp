package enoca.springData.business.abstracts;



import java.util.List;

import enoca.springData.business.request.CreateBrandRequest;
import enoca.springData.business.request.UpdateBrandRequest;
import enoca.springData.business.responses.GetAllBrandsResponse;
import enoca.springData.entities.concretes.Brand;

public interface BrandService {
  
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
    








}
