package com.xinbitiangao.renrentao.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 商品类目  实体
 * Created by 黄大胖子
 * 2018/5/22 11:51
 */
@Entity
@Data
@Table(name = "product_category")
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Accessors(chain = true) //链式写法
public class ProductCategoryEntity {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 首字母
     */
    private String categoryInitial;



}
