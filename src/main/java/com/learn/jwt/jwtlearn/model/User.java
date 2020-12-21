package com.learn.jwt.jwtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Responsibility:
 *
 * @Author : Mostafijur Rahman
 * @Since : 12/21/2020
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private  String userName;
  private String userEmail;
  private String userPassword;
}
