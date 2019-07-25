package com.service;

import com.model.SectionEntity;
import com.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    private SectionRepository repository;

    @Override
    public List<SectionEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void createCourse(SectionEntity sectionEntity) {
        repository.save(sectionEntity);
    }

    @Override
    public void deleteSectionById(Long id) {
        repository.deleteById(id);
    }
}
