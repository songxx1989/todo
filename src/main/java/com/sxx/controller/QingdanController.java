package com.sxx.controller;

import com.sxx.entity.QingdanEntity;
import com.sxx.repository.QingdanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Controller
public class QingdanController {
    @Autowired
    private QingdanRepository qingdanRepository;

    @GetMapping({"/qingdan", "/"})
    public String qingdan(Model model) {
        List<QingdanEntity> qingdanEntityList = qingdanRepository.findAll();
        model.addAttribute("qingdanList", qingdanEntityList);
        return "qingdan";
    }

    @GetMapping("/qingdan/list")
    public String qingdanList(Model model) {
        List<QingdanEntity> qingdanEntityList = qingdanRepository.findAll();
        model.addAttribute("qingdanList", qingdanEntityList);
        return "qingdan-list";
    }

    @GetMapping("/qingdan/del/{id}")
    public String qingdanDel(@PathVariable("id") int id) {
        qingdanRepository.delete(id);
        return "redirect:/qingdan/list";
    }
}
