package ch.zhaw.projectX.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.Entities.Investigation;

public interface InvestigationRepository extends JpaRepository<Investigation, Integer>{

}
