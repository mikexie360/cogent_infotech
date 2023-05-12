package react.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import react.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
}
