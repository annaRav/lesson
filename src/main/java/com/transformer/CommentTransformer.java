package com.transformer;

import com.controller.dto.Comment;
import com.model.CommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommentTransformer {
    @Autowired
    private LessonTransformer transformer;

    public List<Comment> buildComments(List<CommentEntity> entities) {
        return entities.stream().map(this::buildComent).collect(Collectors.toList());
    }

    private Comment buildComent(CommentEntity commentEntity) {
        Comment comment = new Comment();
        return comment.setAuthorId(commentEntity.getAuthorId())
                .setContent(commentEntity.getContent())
                .setLesson(transformer.buildLesson(commentEntity.getLesson()));
    }
}
