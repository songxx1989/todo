package com.sxx.service;

import com.sxx.entity.Qingdan;

import java.util.List;
import java.util.Map;

/**
 * Created by songxx1989 on 2017/7/15.
 */
public interface QingdanService {
    List<Qingdan> findAll();

    Map<String, Object> findOne(Integer id);

    Qingdan save(Qingdan qingdan);

    Map<String, Object> updateUsers(Integer id, String users);

    void del(Integer id);
}
