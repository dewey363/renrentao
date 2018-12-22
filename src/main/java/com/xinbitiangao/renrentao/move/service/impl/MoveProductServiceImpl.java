package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.entity.SearchKeywordEntity;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
import com.xinbitiangao.renrentao.common.repository.SearchKeywordRepository;
import com.xinbitiangao.renrentao.move.entity.IndexCarouselEntity;
import com.xinbitiangao.renrentao.move.repository.IndexCarouselRepository;
import com.xinbitiangao.renrentao.move.service.MoveProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 1.0
 * @Description: 商品数据 实现层
 * @Auther:
 * @Date: 2018/11/21 22:13
 */
@Service
public class MoveProductServiceImpl implements MoveProductService {

    @Autowired
    ProductRepository productRepository;

    /**
     * 获取商品 列表
     * @param type
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<ProductEntity> list(Integer type, Integer page, Integer size) {

        Pageable pageable = new PageRequest(page, size);
        List<ProductEntity> pes = productRepository.findAll(pageable).getContent();

        return pes;
    }
}
