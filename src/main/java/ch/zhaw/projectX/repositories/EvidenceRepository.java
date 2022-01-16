package ch.zhaw.projectX.repositories;

import org.springframework.data.repository.NoRepositoryBean;
import ch.zhaw.projectX.entities.Evidence;

@NoRepositoryBean //Annotation to exclude repository interfaces from being picked up and thus in consequence getting an instance being created. This Repository doesn't need its own methods (CRUD) 
public interface EvidenceRepository<T extends Evidence> extends MainRepository<Evidence>{

/*	@Query
	("SELECT * FROM evidence WHERE evidence.evidence_name = ?1;")
	List<Evidence> findAllEvidencesWithName(String name);
	*/
	
}

