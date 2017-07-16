package com.sxx.service.impl;

import com.sxx.entity.Qingdan;
import com.sxx.repository.QingdanRepository;
import com.sxx.service.QingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Service
public class QingdanServiceImpl implements QingdanService {
    @Autowired
    private QingdanRepository repository;

    @Override
    public List<Qingdan> findQingdanList() {
        return repository.findAll();
    }

    @Override
    public Qingdan saveQingdan(Qingdan qingdan) {
        qingdan.setStatus(0);
        return repository.save(qingdan);
    }

    @Override
    public void delQingdan(Integer id) {
        if (repository.exists(id)) {
            repository.delete(id);
        }
    }
}
