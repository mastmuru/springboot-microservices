/**
 * 
 */
package com.fa.service;

import java.util.List;

import com.fa.entity.User;
import com.fa.response.dto.UserDto;

/**
 * @author testing
 *
 */
public interface UserService {
	User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
