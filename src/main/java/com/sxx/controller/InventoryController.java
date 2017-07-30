package com.sxx.controller;

import com.sxx.entity.Inventory;
import com.sxx.entity.Result;
import com.sxx.service.InventoryService;
import com.sxx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService service;

    @GetMapping
    public Result findAll() {
        List<Inventory> inventoryList = service.findAll();
        return ResultUtil.successResult(inventoryList);
    }

    @PostMapping
    public Result save(@ModelAttribute Inventory inventory) {
        return ResultUtil.successResult(service.save(inventory));
    }

    @DeleteMapping("/{id}")
    public Result del(@PathVariable Integer id) {
        service.del(id);
        return ResultUtil.successResult();
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable int id) {
        return ResultUtil.successResult(service.findOne(id));
    }

    @PatchMapping("/{id}/{users}")
    public Result updateUsers(@PathVariable int id, @PathVariable String users){
        return ResultUtil.successResult(service.updateUsers(id, users));
    }
}
