package com.lendo.assesment.service.impl;

import com.lendo.assesment.dto.UserDto;
import com.lendo.assesment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<UserDto> getAllUsers() {
    String url = "https://gorest.co.in/public/v2/users";
    ResponseEntity<UserDto[]> response = restTemplate.getForEntity(url, UserDto[].class);
    return Arrays.asList(response.getBody());
  }

  // Implement methods for filtering users (optional for this project)
}
