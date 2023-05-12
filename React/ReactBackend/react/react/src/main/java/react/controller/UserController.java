package react.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import react.entity.User;
import react.service.UserService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the DoConnect Application !!";
    }
	@PostMapping("/adduser")
	public void addUser(@Validated @RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@PutMapping("/updateuser")
	public void updateUser(@Validated @RequestBody User user) {
		userService.updateUser(user);
	}
	@PutMapping("/updateuser/{id}/{firstname}/{lastname}/{email}")
	public void updateUserById(
								@Validated @PathVariable("id") int id,
								@Validated @PathVariable("firstname") String firstname,
								@Validated @PathVariable("lastname") String lastname,
								@Validated @PathVariable("email") String email
			
								) {
		userService.updateUserById(id, firstname, lastname, email);
	}
	
	

	@DeleteMapping("/deleteuser/{id}")
	public void deleteUserById(@Validated @PathVariable("id") int id) {
		userService.deleteUserById(id);
	}
}