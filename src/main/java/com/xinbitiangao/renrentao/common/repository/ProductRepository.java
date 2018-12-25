package com.xinbitiangao.renrentao.common.repository;

import com.xinbitiangao.renrentao.common.entity.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 商品
 * Created by 黄大胖子
 * 2018/5/22 10:57
 *
 * @author hay17
 */
public interface ProductRepository extends JpaRepository<ProductEntity, String> {


    List<ProductEntity> findByProductCategoryLike(String name , Pageable pg);
}
