package com.transformer;

import com.controller.dto.Lesson;
import com.model.LessonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LessonTransformer {
    @Autowired
    private SectionTransformer sectionTransformer;
    @Autowired
    private CommentTransformer commentTransformer;

    public List<Lesson> buildLessons(List<LessonEntity> entities) {
        return entities.stream().map(this::buildLesson).collect(Collectors.toList());
    }

    public Lesson  buildLesson(LessonEntity lessonEntity) {
        Lesson lesson = new Lesson();
        return lesson.setName(lessonEntity.getName())
                .setContent(lessonEntity.getContent())
                .setComments(commentTransformer.buildComments(lessonEntity.getComments()));
    }

    public LessonEntity buildEntity(Lesson lesson) {
        LessonEntity entity = new LessonEntity();
        return entity.setName(lesson.getName())
                .setContent(lesson.getContent())
                .setSection(sectionTransformer.buildEntity(lesson.getSection()));
    }
}
