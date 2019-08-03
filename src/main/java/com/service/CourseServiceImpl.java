package com.service;

import com.controller.dto.SpecificationRequest;
import com.model.CourseEntity;
import com.repository.CourseRepository;
import com.service.specification.CommonSpecificationBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.transformer.SpecificationTransformer.buildCriteria;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository repository;
    @Autowired
    private CommonSpecificationBuilder<CourseEntity> specificationBuilder;

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

    @Override
    public List<CourseEntity> findAll(SpecificationRequest request) {
        Specification<CourseEntity> specification =
                specificationBuilder.build(buildCriteria(request));
        return repository.findAll(specification);
    }
}
