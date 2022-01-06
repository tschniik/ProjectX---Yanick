package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.projectX.entities.Complex;

public interface ComplexRepository extends JpaRepository<Complex, Integer>{

}
