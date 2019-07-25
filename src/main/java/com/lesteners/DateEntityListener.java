package com.lesteners;

import com.model.CreatableEntity;

import javax.persistence.PrePersist;
import java.util.Date;


public class DateEntityListener {
    @PrePersist
    public void prePersist(CreatableEntity entity) {
        entity.setCreatedDate(new Date().getTime());
    }
}
