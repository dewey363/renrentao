package com.xinbitiangao.renrentao.move.service;

import org.springframework.ui.ModelMap;

/**
 * @author 1.0
 * @Description: 首页服务层抽象类
 * @Auther: huangyong
 * @Date: 2018/11/21 22:13
 */
public interface MoveIndexService {
    /**
     * 首页
     * @param modelMap
     */
    void index(ModelMap modelMap);
}
