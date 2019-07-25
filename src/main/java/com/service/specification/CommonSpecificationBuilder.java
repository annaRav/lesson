package com.service.specification;

import com.model.BaseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Root;

@Component
public class CommonSpecificationBuilder<T extends BaseEntity> {
    private Root<T> root;

    public CommonSpecificationBuilder(Root root) {
        this.root = root;
    }
}
