package com.sxx.service;

import com.sxx.entity.Inventory;

import java.util.List;
import java.util.Map;

/**
 * Created by songxx1989 on 2017/7/15.
 */
public interface InventoryService {
    List<Inventory> findAll();

    Map<String, Object> findOne(Integer id);

    Inventory save(Inventory inventory);

    Map<String, Object> updateUsers(Integer id, String users);

    void del(Integer id);
}
