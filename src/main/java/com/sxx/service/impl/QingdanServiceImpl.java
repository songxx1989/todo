package com.sxx.service.impl;

import com.sxx.entity.Qingdan;
import com.sxx.entity.User;
import com.sxx.repository.QingdanRepository;
import com.sxx.repository.UserRepository;
import com.sxx.service.QingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Service
public class QingdanServiceImpl implements QingdanService {
    @Autowired
    private QingdanRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Qingdan> findAll() {
        return repository.findAll();
    }

    @Override
    public Qingdan save(Qingdan qingdan) {
        qingdan.setStatus(0);
        return repository.save(qingdan);
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
        Qingdan qingdan = repository.findOne(id);
        qingdan.setUsers(users);
        qingdan = repository.save(qingdan);
        List<User> userList = userRepository.findByIdIn(qingdan.toUserIdList());
        Map<String, Object> map = qingdan.toMap();
        map.put("uesrList", userList);
        return map;
    }

    @Override
    public Map<String, Object> findOne(Integer id) {
        Qingdan qingdan = repository.findOne(id);
        List<User> userList = userRepository.findByIdIn(qingdan.toUserIdList());
        Map<String, Object> map = qingdan.toMap();
        map.put("userList", userList);
        return map;
    }
}
