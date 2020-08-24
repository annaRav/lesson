package com.repository;

import com.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<CourseEntity, Long>
        , JpaSpecificationExecutor<CourseEntity> {
    List<CourseEntity> findAll();
    Optional<CourseEntity> findById(Long id);
}
