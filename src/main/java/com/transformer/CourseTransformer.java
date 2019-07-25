package com.transformer;

import com.controller.dto.Course;
import com.model.CourseEntity;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseTransformer {
    @Autowired
    private CourseService courseService;
    @Autowired
    private SectionTransformer transformer;

    public List<Course> buildCourses(List<CourseEntity> entities) {
        return entities.stream().map(this::buildCourse).collect(Collectors.toList());
    }

    public Course buildCourse(CourseEntity courseEntity) {
        Course course = new Course();
        return course.setName(courseEntity.getName())
                .setCost(courseEntity.getCost())
                .setSections(transformer.buildSections(courseEntity.getSections()));
    }

    public CourseEntity buildEntity(Course course) {
        CourseEntity entity = new CourseEntity();
        return entity.setCost(course.getCost())
                .setName(course.getName())
                .setSections(transformer.buildEntites(course.getSections()));
    }
}
