package com.lendo.assesment.controller;

import com.lendo.assesment.dto.UserDto;
import com.lendo.assesment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public List<UserDto> getAllUsers() {
    return userService.getAllUsers();
  }
}
