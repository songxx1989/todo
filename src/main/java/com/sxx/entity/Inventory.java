package com.sxx.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Entity
public class Inventory {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Integer status;

    private String users;

    public Inventory() {
    }

    public Inventory(String name, Integer status) {
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

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", this.id);
        map.put("name", this.name);
        map.put("status", this.status);
        map.put("users", this.users);
        return map;
    }

    public List<Integer> toUserIdList() {
        String[] userIdStrArr = this.users.split(",");
        Integer[] userIdIntArr = new Integer[userIdStrArr.length];
        for (int i = 0; i < userIdStrArr.length; i++) {
            userIdIntArr[i] = Integer.parseInt(userIdStrArr[i]);
        }
        return Arrays.asList(userIdIntArr);
    }
}
