package com.transformer;

import com.controller.dto.Section;
import com.model.SectionEntity;
import com.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SectionTransformer {
    @Autowired
    private SectionService sectionService;
    @Autowired
    private LessonTransformer lessonTransformer;
    @Autowired
    private CourseTransformer courseTransformer;

    public List<Section> buildSections(List<SectionEntity> entities) {
        return entities.stream().map(this::buildSection).collect(Collectors.toList());
    }

    public Section buildSection(SectionEntity sectionEntity) {
        Section section = new Section();
        return section.setName(sectionEntity.getName())
                .setCourseId(sectionEntity.getCourse().getId())
                .setLessons(lessonTransformer.buildLessons(sectionEntity.getLessons()));
    }

    public List<SectionEntity> buildEntites(List<Section> sections) {
        return sections.stream().map(this::buildEntity).collect(Collectors.toList());
    }

    public SectionEntity buildEntity(Section section) {
        SectionEntity entity = new SectionEntity();
        entity.setName(section.getName());
        return entity;
    }
}
