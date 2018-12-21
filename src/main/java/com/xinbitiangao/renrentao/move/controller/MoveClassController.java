package com.xinbitiangao.renrentao.move.controller;

import com.xinbitiangao.renrentao.move.service.MoveClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 黄大胖子
 * 2018/6/21 17:17
 *
 * @author hay17
 */
@RestController
@RequestMapping("/move")
public class MoveClassController {

    @Autowired
    private MoveClassService mcs;

    @GetMapping("/class")
    public String classm(ModelMap modelMap) {
        mcs.classm(modelMap);
        return "move/class";
    }


}
