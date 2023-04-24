package enoca.springData.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import enoca.springData.business.abstracts.ModelService;
import enoca.springData.business.request.CreateModelRequest;
import enoca.springData.business.request.UpdateModelRequest;
import enoca.springData.business.responses.GetAllBrandsResponse;
import enoca.springData.business.responses.GetAllModelResponse;
import enoca.springData.dataAccess.abstracts.ModelRepository;
import enoca.springData.entities.concretes.Brand;
import enoca.springData.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ModelManager implements ModelService{
	
	private ModelRepository modelRepository;

	@Override
	public List<GetAllModelResponse> getAll() {
		
		List<enoca.springData.entities.concretes.Model> models = modelRepository.findAll();
		List<GetAllModelResponse> modelResponse = new ArrayList<GetAllModelResponse>();
		
		for ( enoca.springData.entities.concretes.Model model : models) {
			GetAllModelResponse responseItem = new GetAllModelResponse();
			responseItem.setId(model.getId());
			responseItem.setName(model.getName());
			modelResponse.add(responseItem);
			
		}
		return modelResponse;
	}



	@Override
	public void add(CreateModelRequest createModelRequest) {
		
		 /*Model model = new Model();
		 ((CreateModelRequest) model).setName(createModelRequest.getName());
		 ((CreateModelRequest) model).setBrand_id(createModelRequest.getBrand_id());
		 
		 this.modelRepository.save( model);*/
		 
		
	}
	
	@Override
	public void update(UpdateModelRequest updateModelRequest) {
		
		/*Model model = new Model();
		((UpdateModelRequest) model).setName((updateModelRequest).getName());
		
		
		
		this.modelRepository.save(model);*/
		
		
	}
	@Override
	public void delete(int id) {
		this.modelRepository.deleteById(id);
		
	}

	
	
  

}
