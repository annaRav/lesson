package com.service;

import com.model.CourseEntity;

import java.util.List;

public interface CourseService {
    List<CourseEntity> findAll();
    void createCourse(CourseEntity courseEntity);
    void deleteCourseById(Long id);
}
