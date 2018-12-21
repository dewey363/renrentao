package com.xinbitiangao.renrentao.desktop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制类
 * Created by 黄大胖子
 * 2018/6/21 17:17
 * @author hay17
 */
@Controller
@RequestMapping("/desktop")
public class DesktopIndexController {
    /**
     * 返回桌面首页
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "/desktop/index";
    }
}
