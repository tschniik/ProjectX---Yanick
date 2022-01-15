package ch.zhaw.projectX.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX.entities.Investigation;

public interface InvestigationRepository<T> extends MainRepository<Investigation>{ 

/*	@Query
	("SELECT * FROM investigation WHERE investigation.crime_commissioner =?1 OR investigation.police_department = ?1;")
	List<Investigation> findAllInvestigationsWithCommissionerOrPD(String CommissionerOrPD);
	*/
}
