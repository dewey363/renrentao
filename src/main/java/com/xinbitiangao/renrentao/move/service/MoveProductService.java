package com.xinbitiangao.renrentao.move.service;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;

import java.util.List;

/**
 * @author 1.0
 * @Description: 商品数据接口
 * @Auther: huangyong
 * @Date: 2018/11/21 22:13
 */
public interface MoveProductService {

    /**
     * 分页查询
     * @return
     */
    List<ProductEntity> findPageList(String type, Integer page, Integer size);
}
