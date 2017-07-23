package com.sxx.controller;

import com.sxx.entity.Qingdan;
import com.sxx.entity.Result;
import com.sxx.service.QingdanService;
import com.sxx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@RestController
public class QingdanController {
    @Autowired
    private QingdanService service;

    @GetMapping("/qingdan")
    public Result findAll() {
        List<Qingdan> qingdanList = service.findAll();
        return ResultUtil.successResult(qingdanList);
    }

    @PostMapping("/qingdan")
    public Result save(@ModelAttribute Qingdan qingdan) {
        return ResultUtil.successResult(service.save(qingdan));
    }

    @DeleteMapping("/qingdan/{id}")
    public Result del(@PathVariable Integer id) {
        service.del(id);
        return ResultUtil.successResult();
    }

    @GetMapping("/qingdan/{id}")
    public Result findOne(@PathVariable int id) {
        return ResultUtil.successResult(service.findOne(id));
    }

    @PatchMapping("/qingdan/{id}/{users}")
    public Result updateUsers(@PathVariable int id, @PathVariable String users){
        return ResultUtil.successResult(service.updateUsers(id, users));
    }
}
