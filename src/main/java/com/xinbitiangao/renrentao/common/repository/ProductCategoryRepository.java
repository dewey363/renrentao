package com.xinbitiangao.renrentao.common.repository;

import com.xinbitiangao.renrentao.common.entity.AdminEntity;
import com.xinbitiangao.renrentao.common.entity.ProductCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品类目
 * Created by 黄大胖子
 * @author hay17
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity, Long> {

    /**
     * 按照类目名  查找类目
     *
     * @param categoryName
     * @return
     */
    ProductCategoryEntity findByCategoryNameEquals(String categoryName);


}
