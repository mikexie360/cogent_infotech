package cogent.infotech.com.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//	@Modifying
//	@Query("Update user u set u.name = :name, u.age = :age , salary = :salary where u.id = :id;")
//	public void setUserInfoById(String name, int age, double salary, long id);
}
