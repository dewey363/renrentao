package com.xinbitiangao.renrentao.move.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "index_carousel")
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Accessors(chain = true) //链式写法

/**
 * 首页轮播图实体类
 * Created by 黄大胖子
 * 2018/5/22 11:51
 *
 * @author hay17
 */
public class IndexCarouselEntity {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 轮播图名称
     */
    private String imgname;
    /**
     * 轮播图地址
     */
    private String imgsite;
    /**
     * 链接地址
     */
    private String site;
    /**
     * 轮播图权重排序
     */
    private Integer sort;
    /**
     * 状态是否有效  0-无效 1-有效
     */
    private Integer state;

}
