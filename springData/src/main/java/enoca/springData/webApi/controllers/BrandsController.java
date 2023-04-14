package enoca.springData.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enoca.springData.business.abstracts.BrandService;
import enoca.springData.business.request.CreateBrandRequest;
import enoca.springData.business.request.UpdateBrandRequest;
import enoca.springData.business.responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    
	private BrandService brandService;
	
	
	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll(){
		 
		return brandService.getAll();
			
		
	}
	
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
		
	}
	
	@PutMapping("/update")
	public void add(UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}
}
