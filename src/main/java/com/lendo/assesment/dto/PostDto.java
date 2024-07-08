package com.lendo.assesment.dto;

import lombok.Data;

@Data
public class PostDto {

  private Long id;
  private Long userId;
  private String title;
  private String body;

}
