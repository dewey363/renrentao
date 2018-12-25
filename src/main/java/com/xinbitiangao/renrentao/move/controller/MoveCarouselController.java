package com.xinbitiangao.renrentao.move.controller;

import com.xinbitiangao.renrentao.common.utils.R;
import com.xinbitiangao.renrentao.move.service.MoveCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 1.0
 * @Description: 轮播图
 * @Auther: hay17
 * @Date: 2018/12/23 09:47
 */
@RestController
@RequestMapping("/move/carousel")
public class MoveCarouselController {
    @Autowired
    MoveCarouselService moveCarouselService;

    /**
     * 获取全部轮播图
     *
     * @return
     */
    @GetMapping("/list")
    public R list() {
        try {
            R r = new R();
            r.put("data", moveCarouselService.list());
            return r;
        } catch (Exception e) {
            return R.error();
        }

    }

}
