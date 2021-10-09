package com.jwt.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.model.CustomUserDetails;
import com.jwt.model.User;
import com.jwt.repo.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = this.userRepository.findByUsername(userName);

		if (user == null) {
			throw new UsernameNotFoundException("user not found!!");
		} else {
			return new CustomUserDetails(user);
		}

		/*
		 * if (userName.equals("rakesh")) { return new User("rakesh", "rakesh123", new
		 * ArrayList<>()); } else { throw new
		 * UsernameNotFoundException("user not found!!"); }
		 */

	}

}
