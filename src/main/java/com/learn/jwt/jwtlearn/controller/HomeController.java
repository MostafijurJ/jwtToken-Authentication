package com.learn.jwt.jwtlearn.controller;

import com.learn.jwt.jwtlearn.model.AuthenticationRequest;
import com.learn.jwt.jwtlearn.model.AuthenticationResponse;
import com.learn.jwt.jwtlearn.service.MyUserDetailsService;
import com.learn.jwt.jwtlearn.util.JwtUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Responsibility:
 *
 * @Author : Mostafijur Rahman
 * @Since : 12/20/2020
 **/
@RestController
public class HomeController {

  @Autowired
  private AuthenticationManager authenticationManager;
  @Autowired
  private MyUserDetailsService userDetailsService;
  @Autowired
  private JwtUtill jwtUtill;


  @GetMapping("/hi")
  public String sayHi(){
    return "Welcome to learning Jwt-token";
  }

  @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest){
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
          authenticationRequest.getUserName(),authenticationRequest.getPassword())
      );
      final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());

      final String jwtToken = jwtUtill.generateToken(userDetails);

      return ResponseEntity.ok(new AuthenticationResponse(jwtToken));
    }
}
