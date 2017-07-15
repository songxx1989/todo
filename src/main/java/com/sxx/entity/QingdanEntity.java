package com.sxx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Entity
public class QingdanEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public QingdanEntity() {
    }

    public QingdanEntity(String name) {

        this.name = name;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
