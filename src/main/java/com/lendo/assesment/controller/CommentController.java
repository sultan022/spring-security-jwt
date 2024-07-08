package com.lendo.assesment.controller;

import com.lendo.assesment.dto.CommentDto;
import com.lendo.assesment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/comments")
public class CommentController {

  @Autowired
  private CommentService commentService;

  @GetMapping
  public List<CommentDto> getAllComments() {
    return commentService.getAllComments();
  }

  @GetMapping("/{postId}")
  public List<CommentDto> getCommentsByPostId(@PathVariable Long postId) {
    return commentService.getCommentsByPostId(postId);
  }

}
