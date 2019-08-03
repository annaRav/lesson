package com.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Section {
    private String name;
    private Long courseId;
    private List<Lesson> lessons = new ArrayList<>();
}
