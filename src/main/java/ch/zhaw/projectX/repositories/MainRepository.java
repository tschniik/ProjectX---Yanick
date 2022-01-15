package ch.zhaw.projectX.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean 
public interface MainRepository<T> extends JpaRepository<T, Long> {

}
