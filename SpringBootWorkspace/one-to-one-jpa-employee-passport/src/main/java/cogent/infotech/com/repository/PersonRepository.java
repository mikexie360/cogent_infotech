package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.*;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
