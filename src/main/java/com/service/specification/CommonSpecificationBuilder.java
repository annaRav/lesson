package com.service.specification;

import com.model.BaseEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.ObjectUtils;

import javax.persistence.criteria.Root;

public abstract class CommonSpecificationBuilder<T> {
    private static final String NAME_KEY = "name";

    public Specification<T> build(SpecificationCriteria criteria) {
        return Specification.where(buildName(criteria.getName()));
    }

    protected Specification<T> buildName(String name) {
        return ObjectUtils.isEmpty(name)
                ? null
                : ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get(NAME_KEY), name + "%"));
    }
}
