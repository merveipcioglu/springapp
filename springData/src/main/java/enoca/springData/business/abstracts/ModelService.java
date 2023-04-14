package enoca.springData.business.abstracts;

import java.util.List;

import enoca.springData.business.request.CreateModelRequest;
import enoca.springData.business.request.UpdateBrandRequest;
import enoca.springData.business.request.UpdateModelRequest;
import enoca.springData.business.responses.GetAllModelResponse;

public interface ModelService {
 
	List<GetAllModelResponse> getAll();
	void add(CreateModelRequest createModelRequest);
	void update(UpdateModelRequest updateModelRequest);
	 void delete(int id);
}
