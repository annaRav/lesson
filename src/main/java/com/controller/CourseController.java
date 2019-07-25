package com.controller;

import com.controller.dto.Course;
import com.service.CourseService;
import com.transformer.CourseTransformer;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseTransformer transformer;
    @Autowired
    private CourseService service;


    @GetMapping
    public List<Course> getCourses() {
        return transformer.buildCourses(service.findAll());
    }

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        service.createCourse(transformer.buildEntity(course));
    }

    @DeleteMapping(path = "/{id}")
    public void deleteCourse(@PathVariable(name = "id") Long id) {
        service.deleteCourseById(id);
    }
}
