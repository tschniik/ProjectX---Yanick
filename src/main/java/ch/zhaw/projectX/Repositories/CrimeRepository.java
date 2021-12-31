package ch.zhaw.projectX.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.Entities.Crime;

public interface CrimeRepository extends JpaRepository<Crime, Integer>{

}
