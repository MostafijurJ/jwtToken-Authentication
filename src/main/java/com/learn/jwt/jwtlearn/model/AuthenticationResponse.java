package com.learn.jwt.jwtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Responsibility:
 *
 * @Author : Mostafijur Rahman
 * @Since : 12/20/2020
 **/

@AllArgsConstructor
@Getter
@Setter
public class AuthenticationResponse {
  private String jwtToken;
}
