package com.lendo.assesment.service;

import com.lendo.assesment.dto.PostDto;

import java.util.List;

public interface PostService {

  List<PostDto> getAllPosts();

  List<PostDto> getPostsByUserId(Long userId);

  // Add methods for other functionalities (optional)
}
