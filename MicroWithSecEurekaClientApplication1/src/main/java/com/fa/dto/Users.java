/**
 * 
 */
package com.fa.dto;

import java.io.Serializable;

/**
 * @author testing
 *
 */
public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String userId;
	private String username;
	private String userRole;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Users(String userId, String username, String userRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", userRole=" + userRole + "]";
	}
	
	
	

}
