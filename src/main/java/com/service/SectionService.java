package com.service;

import com.model.SectionEntity;

import java.util.List;

public interface SectionService {
    List<SectionEntity> findAll();
    void createCourse(SectionEntity sectionEntity);
    void deleteSectionById(Long id);
}
