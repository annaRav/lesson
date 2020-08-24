package com.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Course {
    private Long id;
    private Long createdDate;
    private String name;
    private Integer cost;
    private List<Section> sections = new ArrayList<>();
}
