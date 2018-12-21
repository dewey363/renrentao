package com.xinbitiangao.renrentao.move.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 黄大胖子
 * 2018/6/21 17:17
 *
 * @author hay17
 */
@Controller
@RequestMapping("/move")
public class MovePromotionController   {


    @GetMapping("/promotion")
    public String promotion(ModelMap modelMap) {

        return "/move/promotion";
    }


}
