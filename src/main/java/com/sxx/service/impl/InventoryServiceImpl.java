package com.sxx.service.impl;

import com.sxx.entity.Inventory;
import com.sxx.entity.User;
import com.sxx.repository.InventoryRepository;
import com.sxx.repository.UserRepository;
import com.sxx.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Inventory> findAll() {
        return repository.findAll();
    }

    @Override
    public Inventory save(Inventory inventory) {
        inventory.setStatus(0);
        return repository.save(inventory);
    }

    @Override
    public void del(Integer id) {
        if (repository.exists(id)) {
            repository.delete(id);
        }
    }

    @Override
    public Map<String, Object> updateUsers(Integer id, String users) {
        if (!repository.exists(id)) {
            throw new RuntimeException("清单" + id + "不存在！");
        }
        Inventory inventory = repository.findOne(id);
        inventory.setUsers(users);
        inventory = repository.save(inventory);
        List<User> userList = userRepository.findByIdIn(inventory.toUserIdList());
        Map<String, Object> map = inventory.toMap();
        map.put("uesrList", userList);
        return map;
    }

    @Override
    public Map<String, Object> findOne(Integer id) {
        Inventory inventory = repository.findOne(id);
        List<User> userList = userRepository.findByIdIn(inventory.toUserIdList());
        Map<String, Object> map = inventory.toMap();
        map.put("userList", userList);
        return map;
    }
}
