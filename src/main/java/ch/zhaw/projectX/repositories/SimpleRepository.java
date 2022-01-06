package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.entities.Simple;

public interface SimpleRepository extends JpaRepository<Simple, Integer>{

}
