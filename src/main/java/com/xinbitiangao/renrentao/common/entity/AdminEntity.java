package com.xinbitiangao.renrentao.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Entity
@Data
@Table(name = "admin")
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
@Accessors(chain = true) //链式写法
/**
 * admin实体
 * Created by 黄大胖子
 * 2018/5/22 11:51
 */
public class AdminEntity {
    /**
     *  管理员id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    /**
     * 管理员账号
     */
    private String username;
    /**
     * 管理员密码
     */
    private String password;
}
