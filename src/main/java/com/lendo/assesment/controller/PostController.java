package com.lendo.assesment.controller;

import com.lendo.assesment.dto.PostDto;
import com.lendo.assesment.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  private PostService postService;

  @GetMapping
  public List<PostDto> getAllPosts() {
    return postService.getAllPosts();
  }

  @GetMapping("/{userId}")
  public List<PostDto> getPostsByUserId(@PathVariable Long userId) {
    return postService.getPostsByUserId(userId);
  }

  // Add methods for other functionalities (optional)
}
