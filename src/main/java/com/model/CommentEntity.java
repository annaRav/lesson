package com.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "comment")
public class CommentEntity extends CreatableEntity{
    @Column(name = "authorId")
    private Long authorId;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private LessonEntity lesson;
}
