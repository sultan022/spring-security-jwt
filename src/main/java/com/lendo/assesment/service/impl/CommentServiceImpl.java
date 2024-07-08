package com.lendo.assesment.service.impl;

import com.lendo.assesment.dto.CommentDto;
import com.lendo.assesment.dto.UserDto;
import com.lendo.assesment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<CommentDto> getAllComments() {
    String url = "https://gorest.co.in/public/v2/comments";
    ResponseEntity<CommentDto[]> response = restTemplate.getForEntity(url, CommentDto[].class);
    return Arrays.asList(response.getBody());
  }

  @Override
  public List<CommentDto> getCommentsByPostId(Long postId) {
    String url = "https://gorest.co.in/public/v2/comments?post=" + postId;
    ResponseEntity<CommentDto[]> response = restTemplate.getForEntity(url, CommentDto[].class);
    return Arrays.asList(response.getBody());
  }

  // Add methods for other functionalities (optional)
}
