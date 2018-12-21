package com.xinbitiangao.renrentao.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 搜索关键词 实体
 * Created by 黄大胖子
 * 2018/5/22 11:51
 */
@Entity
@Data
@Table(name = "search_keyword")
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Accessors(chain = true) //链式写法
public class SearchKeywordEntity {
    /**
     * 管理员id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer searchId;
    /**
     * 管理员账号
     */
    private String searchKeyword;

}
