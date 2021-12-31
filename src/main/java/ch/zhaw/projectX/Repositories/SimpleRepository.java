package ch.zhaw.projectX.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.Entities.Simple;

public interface SimpleRepository extends JpaRepository<Simple, Integer>{

}
