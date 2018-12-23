package com.xinbitiangao.renrentao.move.service.impl;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import com.xinbitiangao.renrentao.common.repository.ProductRepository;
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
public class MoveProductServiceImpl implements MoveProductService {

    @Autowired
    ProductRepository productRepository;

    /**
     * 获取商品 列表
     *
     * @param type
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<ProductEntity> list(String type, Integer page, Integer size) {
        switch (type) {
            case "综 合":
                type = "%";
                break;
            case "女装":
                type = "%女%";
                break;
            case "家具家装":
                type = "%材%";
                break;
            case "数码家电":
                type = "%数%";
                break;
            case "母婴":
                type = "%婴%";
                break;
            case "食品":
                type = "%食%";
                break;
            case "鞋包配饰":
                type = "%鞋%";
                break;
            case "美妆个护":
                type = "%美%";
                break;
            case "男装":
                type = "%男%";
                break;
            case "内衣":
                type = "%内衣%";
                break;
            case "户外运动":
                type = "%户外%";
                break;
        }
        Pageable pageable = new PageRequest(page, size);
        List<ProductEntity> pes = productRepository.findByProductCategoryLike(type, pageable);

        return pes;
    }
}
