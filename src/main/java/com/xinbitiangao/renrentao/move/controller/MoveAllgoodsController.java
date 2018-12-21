package com.xinbitiangao.renrentao.move.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 全部商品
 * Created by 黄大胖子
 * 2018/6/21 17:17
 *
 * @author hay17
 */
@RestController
@RequestMapping("/move")
public class MoveAllgoodsController{


    /**
     * 转跳全部商品
     *
     * @return
     */
    @GetMapping("/allgoods")
    public String allgoods(ModelMap modelMap) {

        return "move/allgoods";
    }


}
