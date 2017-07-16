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
    public Result findQingdanList() {
        List<Qingdan> qingdanList = service.findQingdanList();
        return ResultUtil.successResult(qingdanList);
    }

    @PostMapping("/qingdan")
    public Result saveQingdan(@ModelAttribute Qingdan qingdan) {
        return ResultUtil.successResult(service.saveQingdan(qingdan));
    }

    @DeleteMapping("/qingdan/{id}")
    public Result delQingdan(@PathVariable Integer id) {
        service.delQingdan(id);
        return ResultUtil.successResult();
    }
}
