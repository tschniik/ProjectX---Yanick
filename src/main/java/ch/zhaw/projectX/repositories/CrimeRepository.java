package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.entities.Crime;

public interface CrimeRepository extends JpaRepository<Crime, Integer>{

	
	
}
