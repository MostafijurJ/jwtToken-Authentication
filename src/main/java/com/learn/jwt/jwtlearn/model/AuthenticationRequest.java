package com.learn.jwt.jwtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Responsibility:
 *
 * @Author : Mostafijur Rahman
 * @Since : 12/20/2020
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
  private String userName;
  private String password;
}
