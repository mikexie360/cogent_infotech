package cogent.infotech.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.service.*;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;

	@Override
	public User post(User user) {
		// TODO Auto-generated method stub
		User u = new User(user.getName(),user.getAge(),user.getSalary());
		return userRepo.save(u);
	}
	public User add(String name, int age, double salary) {
		User user = new User(name, age, salary);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

//	@Override
//	public void setUserInfoById(String name, int age, double salary, long id) {
//		// TODO Auto-generated method stub
//		userRepo.setUserInfoById(name, age, salary, id);
//	}
	
	@Override
	public void setUserInfo(User user) {
		// TODO Auto-generated method stub
		User temp = userRepo.getById(user.getId());
		temp.setName(user.getName());
		temp.setAge(user.getAge());
		temp.setSalary(user.getSalary());
		userRepo.save(user);
	}

	@Override
	public void deleteById(User user) {
		// TODO Auto-generated method stub
		userRepo.deleteById(user.getId());
	}


	@Override
	public void deleteUserById(long id) {
		userRepo.deleteById(id);
	}

}
