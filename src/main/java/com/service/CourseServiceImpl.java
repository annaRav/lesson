package com.service;

import com.model.CourseEntity;
import com.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository repository;

    @Override
    public List<CourseEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void createCourse(CourseEntity courseEntity) {
        repository.save(courseEntity);
    }

    @Override
    public void deleteCourseById(Long id) {
        repository.deleteById(id);
    }
}
