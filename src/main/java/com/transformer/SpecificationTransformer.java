package com.transformer;

import com.controller.dto.SpecificationRequest;
import com.service.specification.SpecificationCriteria;

public class SpecificationTransformer {
    public static SpecificationCriteria buildCriteria(SpecificationRequest request) {
        return SpecificationCriteria.builder()
                .name(request.getName())
                .build();
    }
}
