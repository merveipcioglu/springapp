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
import enoca.springData.business.abstracts.ModelService;
import enoca.springData.business.request.CreateBrandRequest;
import enoca.springData.business.request.CreateModelRequest;
import enoca.springData.business.request.UpdateBrandRequest;
import enoca.springData.business.request.UpdateModelRequest;
import enoca.springData.business.responses.GetAllBrandsResponse;
import enoca.springData.business.responses.GetAllModelResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsControllers {
	
	private ModelService modelService;
	
	@GetMapping("")
	public List<GetAllModelResponse> getAll(){
		 
		return modelService.getAll();
			
		
	}
	
	@PostMapping("")
	public void add(CreateModelRequest createModelRequest) {
		this.modelService.add(createModelRequest);
		
	}
	
	@PutMapping
	public void add(UpdateModelRequest updateModelRequest) {
		this.modelService.update(updateModelRequest);
		
	}
	
	@DeleteMapping("/{id")
	public void delete(@PathVariable int id) {
		this.modelService.delete(id);
	}

}
