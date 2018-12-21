package com.xinbitiangao.renrentao.common.repository;

import com.xinbitiangao.renrentao.common.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 管理员
 * Created by 黄大胖子
 * 2018/5/22 10:57
 */
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
    /**
     * 按照用户名查询用户
     *
     * @param username
     * @return
     */
    AdminEntity findByUsernameEquals(String username);
}
