package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/User/post")
	public User postUser(@RequestBody User user) {
		return userService.post(user);
	}
	
	@GetMapping("/User/get")
	public List<User> getAllMovies(){
		return userService.getAll();
	}
	
	
	@PutMapping("/User/put")
	public void putUser(@RequestBody User user){
		userService.setUserInfo(user);
	}
	
	@DeleteMapping("/User/delete")
	public void deleteUser(@RequestBody User user) {
		userService.deleteById(user);
	}
	
	@DeleteMapping("/User/delete/{id}")
	public void deleteUserbyId(@PathVariable("id") long id) {
		userService.deleteUserById(id);
	}
}
