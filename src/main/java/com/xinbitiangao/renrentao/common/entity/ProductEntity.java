package com.xinbitiangao.renrentao.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 存放淘宝客数据实体
 * Created by 黄大胖子
 * 2018/5/22 11:51
 */
@Entity
@Data
@Table(name = "product")
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Accessors(chain = true) //链式写法
public class ProductEntity {
    /**
     * 商品id
     */
    @Id
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品主图
     */
    private String productImgAddress;
    /**
     * 商品详情页链接地址
     */
    private String productDetailsAddress;
    /**
     * 商品一级类目
     */
    private String productCategory;
    /**
     * 淘宝客链接
     */
    private String productTaokeAddress;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    /**
     * 商品优惠价格
     */
    private BigDecimal productCouponPrice;

    /**
     * 商品月销量
     */
    private int productSales;
    /**
     * 收入比率
     */
    private double productRate;
    /**
     * 佣金
     */
    private BigDecimal productRbrokerage;
    /**
     * 卖家旺旺
     */
    private String productSellerWangwang;
    /**
     * 卖家id
     */
    private String productSellerId;
    /**
     * 店铺名称
     */
    private String productSellerShopName;
    /**
     * 平台
     */
    private String platform;
    /**
     * 优惠券id
     */
    private String discountCouponId;
    /**
     * 优惠券总量
     */
    private int discountCouponGross;
    /**
     * 优惠券剩余
     */
    private int discountCouponResidue;
    /**
     * 优惠券金额
     */
    private String discountCouponSum;
    /**
     * 优惠券开始时间
     */
    private Date discountCouponStartTime;
    /**
     * 优惠券结束时间
     */
    private Date discountCouponOverTime;
    /**
     * 优惠券链接
     */
    private String discountCouponAddress;
    /**
     * 商品优惠券推广链接
     */
    private String productDiscountCouponAddress;

    private Date createTime;
    private Date updateTime;
}
