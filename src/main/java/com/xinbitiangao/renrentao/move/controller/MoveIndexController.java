package com.xinbitiangao.renrentao.move.controller;

import com.xinbitiangao.renrentao.move.service.MoveIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页控制类
 * Created by 黄大胖子
 * 2018/6/21 17:17
 *
 * @author hay17
 */
@RestController
@RequestMapping("/move")
public class MoveIndexController {

    @Autowired
    MoveIndexService moveIndexService;

    /**
     * 转跳移动端首页
     * @return
     */
    @GetMapping("/index")
    public String index(ModelMap modelMap) {
//        将视图map对象传递至service层
        moveIndexService.index(modelMap);
        return "move/index";
    }


}
