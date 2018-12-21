package com.xinbitiangao.renrentao.admin.service;

import com.xinbitiangao.renrentao.common.entity.AdminEntity;

/**
 * 管理员服务接口
 * Created by 黄大胖子
 * 2018/5/5 17:01
 */
public interface AdminService {

    /**
     * 按管理员名字查找账户
     * @param username
     * @return
     */
    AdminEntity findByUsernameEquals(String username);
}
