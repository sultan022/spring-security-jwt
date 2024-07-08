package com.lendo.assesment.service;

import com.lendo.assesment.dto.CommentDto;

import java.util.List;

public interface CommentService {

  List<CommentDto> getAllComments();

  List<CommentDto> getCommentsByPostId(Long postId);

  // Add methods for other functionalities (optional)
}
