package com.programsji.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.programsji.bo.Role;
import com.programsji.bo.User;

@Repository
public class UserDao {
	public UserDetails getUserDetailByUserName(String username) {
		User user = new User("John Nathan", "john", "test", true, true, true,
				true);
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		role.setName("ROLE_USER");
		roles.add(role);
		user.setAuthorities(roles);
		return user;
	}
}