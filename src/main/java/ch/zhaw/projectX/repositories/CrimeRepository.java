package ch.zhaw.projectX.repositories;

import ch.zhaw.projectX.entities.Crime;

public interface CrimeRepository extends MainRepository<Crime>{
	
	/*
	@Query
	("SELECT * FROM crime WHERE crime.crime_name = ?1 OR crime.crime_weapon = ?1;")
	List<Crime>findAllCrimesWithNameOrWeapon(String InputNameorWeapon);
	*/
}
