package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.IndexCarouselEntity;
import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.repository.IndexCarouselRepository;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
import com.xinbitiangao.renrentao.move.service.MoveCarouselService;
import com.xinbitiangao.renrentao.move.service.MoveProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 1.0
 * @Description: 商品数据 实现层
 * @Auther:
 * @Date: 2018/11/21 22:13
 */
@Service
public class MoveCarouselServiceImpl implements MoveCarouselService {

    @Autowired
    IndexCarouselRepository indexCarouselRepository;


    /**
     * 获取所有的轮播图
     * @return
     */
    @Override
    public List<IndexCarouselEntity> list() {
        return indexCarouselRepository.findByStateEquals(1);
    }
}
