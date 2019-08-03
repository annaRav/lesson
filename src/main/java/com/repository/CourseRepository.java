package com.repository;

import com.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseEntity, Long>
        , JpaSpecificationExecutor<CourseEntity> {
    List<CourseEntity> findAll();
}
