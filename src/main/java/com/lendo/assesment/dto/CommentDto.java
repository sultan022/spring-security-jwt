package com.lendo.assesment.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CommentDto {

  private Long id;
  private Long postId;
  private String name;
  private String email;
  private String body;

}
