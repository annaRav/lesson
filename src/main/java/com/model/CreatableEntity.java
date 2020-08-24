package com.model;

import com.lesteners.DateEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(value = DateEntityListener.class)
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class CreatableEntity extends BaseEntity {
    @Column(name = "created_date")
    private Date createdDate;
}
