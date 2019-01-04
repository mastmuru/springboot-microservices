/**
 * 
 */
package com.fa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.fa.dto.Users;
import com.fa.service.UsersService;


/**
 * @author testing
 *
 */
@Service
public class UsersServiceImpl implements UsersService {

	protected Logger logger = Logger.getLogger(UsersServiceImpl.class.getName());

	private Map<String, Users> usersByNumber = new HashMap<String, Users>();

	public UsersServiceImpl() {
		Users user = new Users("1000", "NAndhu", "test@123");
		usersByNumber.put("1000", user);
		user = new Users("1001", "Praveen", "test@123");
		usersByNumber.put("1001", user);
		user = new Users("1002", "Yvaraj", "test@123");
		usersByNumber.put("1002", user);
		logger.info("Created UsersServiceImpl");
	}


	@Override
	public List<Users> getAllUserInfo() {
		// TODO Auto-generated method stub
		return new ArrayList<Users>(usersByNumber.values());
	}

	@Override
	public Users getUser(String userId) {
		return  usersByNumber.get(userId);
	}

}
