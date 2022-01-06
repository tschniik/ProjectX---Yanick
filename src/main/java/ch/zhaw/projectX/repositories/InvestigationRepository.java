package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.entities.Investigation;

public interface InvestigationRepository extends JpaRepository<Investigation, Integer>{

}
