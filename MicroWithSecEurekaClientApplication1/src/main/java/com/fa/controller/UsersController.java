/**
 * 
 */
package com.fa.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fa.dto.Users;
import com.fa.service.UsersService;

/**
 * @author testing
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("greetings-api")
public class UsersController {

	protected Logger logger = Logger.getLogger(UsersController.class.getName());

	@Autowired
	UsersService usersService;

//	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@RequestMapping("/getAllUsers")
	public List<Users> getAllUsers(HttpServletRequest request) {
		
//		System.out.println("::"+auth.getPrincipal());
		
		logger.info("Users-microservice all() invoked");
		List<Users> usersList = usersService.getAllUserInfo();
		logger.info("Users-microservice all() found: " + usersList.size());
		return usersList;
	}

	@RequestMapping("/users/{id}")
	public Users byId(@PathVariable("id") String id) {
		logger.info("Users-microservice byId() invoked: " + id);
		Users user = usersService.getUser(id);
		logger.info("Users-microservice byId() found: " + user);
		return user;
	}
}
