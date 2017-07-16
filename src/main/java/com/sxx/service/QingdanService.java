package com.sxx.service;

import com.sxx.entity.Qingdan;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
public interface QingdanService {
    List<Qingdan> findQingdanList();

    Qingdan saveQingdan(Qingdan qingdan);

    void delQingdan(Integer id);
}
