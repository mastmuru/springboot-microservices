/**
 * 
 */
package com.fa.service;

import java.util.List;

import com.fa.dto.Users;


/**
 * @author testing
 *
 */
public interface UsersService {
	List<Users> getAllUserInfo();

	Users getUser(String userId);
}
