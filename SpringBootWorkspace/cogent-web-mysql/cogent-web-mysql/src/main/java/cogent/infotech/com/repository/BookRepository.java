package cogent.infotech.com.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import cogent.infotech.com.entity.*;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{

}
