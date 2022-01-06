package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.entities.Evidence;

public interface EvidenceRepository extends JpaRepository<Evidence, Integer>{

}

// Fehlt noch zweiter Teil