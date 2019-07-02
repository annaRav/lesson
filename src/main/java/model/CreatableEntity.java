package model;

import lesteners.DateEntityListener;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(value = DateEntityListener.class)
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class CreatableEntity extends BaseEntity {
    @Column(name = "created_date")
    private Long createdDate;
}
