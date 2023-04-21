package cogent.infotech.com.service;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.User;

public interface UserService {
	public User post(User user);
	public User add(String name, int age, double salary);
	public List<User> getAll();
//	@Modifying
//	@Query("Update user u set u.name = :name, u.age = :age , salary = :salary where u.id = :id;")
//	public void setUserInfoById(String name, int age, double salary, long id);
	public void setUserInfo(User user);
	public void deleteById(User user);
	public void deleteUserById(long id);

	
}
