package com.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Lesson {
    private String name;
    private String content;
    private List<Comment> comments = new ArrayList<>();
    private Section section;
}
