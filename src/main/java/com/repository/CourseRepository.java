package com.repository;

import com.model.CourseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<CourseEntity, Long> {
    List<CourseEntity> findAll();
}
