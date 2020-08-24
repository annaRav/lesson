package com.service;

import com.controller.dto.SpecificationRequest;
import com.model.CourseEntity;

import java.util.List;

public interface CourseService {
    List<CourseEntity> findAll();
    void createCourse(CourseEntity courseEntity);
    void deleteCourseById(Long id);
    CourseEntity findById(Long id);
    List<CourseEntity> findAll(SpecificationRequest specificationRequest);
}
