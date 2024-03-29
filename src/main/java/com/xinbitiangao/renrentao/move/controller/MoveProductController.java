package com.xinbitiangao.renrentao.move.controller;

import com.xinbitiangao.renrentao.common.utils.R;
import com.xinbitiangao.renrentao.move.service.MoveProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/move/product")
public class MoveProductController {
    /**
     * 商品数据
     */
    @Autowired
    MoveProductService mps;

    /**
     * 分页查询
     * @return
     */
    @GetMapping("/list")
    public R findPageList(String type, Integer page, Integer size) {
        try {
            R r = new R();
            r.put("data", mps.findPageList(type.trim(), page, size));
            return r;
        } catch (Exception e) {
            return R.error();
        }

    }


}
