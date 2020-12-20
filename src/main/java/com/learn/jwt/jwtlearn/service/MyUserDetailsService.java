package com.learn.jwt.jwtlearn.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Responsibility:
 *
 * @Author : Mostafijur Rahman
 * @Since : 12/20/2020
 **/

@Service
public class MyUserDetailsService implements UserDetailsService {
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return new User("user", "pass", new ArrayList<>());
  }
}
