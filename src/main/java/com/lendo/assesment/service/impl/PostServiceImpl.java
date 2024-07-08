package com.lendo.assesment.service.impl;

import com.lendo.assesment.dto.PostDto;
import com.lendo.assesment.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<PostDto> getAllPosts() {
    String url = "https://gorest.co.in/public/v2/posts";
    ResponseEntity<PostDto[]> response = restTemplate.getForEntity(url, PostDto[].class);
    return Arrays.asList(response.getBody());
  }

  @Override
  public List<PostDto> getPostsByUserId(Long userId) {
    String url = "https://gorest.co.in/public/v2/posts?user=" + userId;
    ResponseEntity<PostDto[]> response = restTemplate.getForEntity(url, PostDto[].class);
    return Arrays.asList(response.getBody());
  }

  // Add methods for other functionalities (optional)
}
