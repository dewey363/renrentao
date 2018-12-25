package com.xinbitiangao.renrentao.move.service;

import com.xinbitiangao.renrentao.common.entity.IndexCarouselEntity;
import com.xinbitiangao.renrentao.common.entity.ProductEntity;

import java.util.List;

/**
 * @author 1.0
 * @Description: 商品数据接口
 * @Auther: huangyong
 * @Date: 2018/11/21 22:13
 */
public interface MoveCarouselService {

    /**
     * 轮播图  所有数据
     *
     * @return
     */
    List<IndexCarouselEntity> list();
}
