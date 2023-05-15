package react.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import react.assessment.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	

}
