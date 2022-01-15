package ch.zhaw.projectX.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import ch.zhaw.projectX.entities.Crime;

public interface CrimeRepository extends MainRepository<Crime>{
	
	/*
	@Query
	("SELECT * FROM crime WHERE crime.crime_name = ?1 OR crime.crime_weapon = ?1;")
	List<Crime>findAllCrimesWithNameOrWeapon(String InputNameorWeapon);
	*/
}
