package com.sxx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Entity
public class TodoEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer qid;
    private Integer pid;

    private String name;
    private Integer status;
    private String remark;

    public TodoEntity() {
    }

    public TodoEntity(Integer qid, Integer pid, String name, Integer status, String remark) {
        this.qid = qid;
        this.pid = pid;
        this.name = name;
        this.status = status;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
