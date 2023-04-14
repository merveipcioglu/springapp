package enoca.springData.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.springData.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model,Integer> {

	void save(org.springframework.ui.Model model);

	

}
