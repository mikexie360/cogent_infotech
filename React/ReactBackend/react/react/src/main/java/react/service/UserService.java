package react.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import react.entity.*;
import react.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public List<User> getAllUsers() {
		return (List)userRepo.findAll();
	}

	public void updateUser(User user) {
		userRepo.save(user);
	}
	
	public void updateUserById(int id, String firstname, String lastname, String email) {
		User temp = userRepo.findById(id).get();
		temp.setFirstName(firstname);
		temp.setLastName(lastname);
		temp.setEmail(email);
		userRepo.save(temp);
	}
	
	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}
	
}
