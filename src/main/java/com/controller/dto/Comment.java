package com.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Comment {
    private Long authorId;
    private String content;
    private Lesson lesson;
}
