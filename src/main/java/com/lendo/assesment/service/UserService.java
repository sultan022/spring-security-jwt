package com.lendo.assesment.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lendo.assesment.dto.UserDto;

import java.util.List;

public interface UserService {

  List<UserDto> getAllUsers();

  // Add methods for filtering users (optional for this project)
}
