/**
 * 
 */
package com.fa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fa.entity.User;

/**
 * @author testing
 *
 */
@Repository
public interface UserDaoRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}