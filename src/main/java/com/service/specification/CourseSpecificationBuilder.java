package com.service.specification;

import com.model.CourseEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Root;

@Component
public class CourseSpecificationBuilder<R> extends CommonSpecificationBuilder<R> {

    @Override
    public Specification<R> build(SpecificationCriteria criteria) {
        return Specification.where(super.build(criteria));
    }

}

