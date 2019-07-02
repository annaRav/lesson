package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "section")
@NoArgsConstructor
public class SectionEntity extends CreatableEntity {
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseEntity course;
    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
    private List<LessonEntity> lessons = new ArrayList<>();
}
