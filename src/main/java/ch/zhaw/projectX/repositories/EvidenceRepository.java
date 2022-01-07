package ch.zhaw.projectX.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX.entities.Evidence;

public interface EvidenceRepository extends MainRepository<Evidence>{

	@Query
	("SELECT * FROM evidence WHERE evidence.evidence_name = ?1;")
	List<Evidence> findAllEvidencesWithName(String name);
	
}

