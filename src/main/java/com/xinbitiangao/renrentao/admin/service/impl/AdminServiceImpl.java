package com.xinbitiangao.renrentao.admin.service.impl;

import com.xinbitiangao.renrentao.admin.service.AdminService;
import com.xinbitiangao.renrentao.common.entity.AdminEntity;
import com.xinbitiangao.renrentao.common.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员实现类
 * Created by 黄大胖子
 * 2018/5/5 17:02
 * @author hay17
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository ar;

    /**
     * 按管理员名字查找账户
     * @param username
     * @return
     */
    @Override
    public AdminEntity findByUsernameEquals(String username) {
        return ar.findByUsernameEquals(username);
    }
}
