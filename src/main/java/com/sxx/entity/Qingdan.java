package com.sxx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Entity
public class Qingdan {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer status;

    public Qingdan() {
    }

    public Qingdan(String name, Integer status) {
        this.name = name;
        this.status = status;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Qingdan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
