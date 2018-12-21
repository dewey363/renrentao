package com.xinbitiangao.renrentao.admin.config;

import com.xinbitiangao.renrentao.common.entity.AdminEntity;
import com.xinbitiangao.renrentao.common.repository.AdminRepository;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Shiro认证
 * Created by 黄大胖子
 * 2018/6/6 22:14
 */
public class RenRenTaoRealm extends AuthorizingRealm {
    @Autowired
    private AdminRepository ar;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户的输入的账号.
        String username = (String) authenticationToken.getPrincipal();
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        AdminEntity adminEntity = ar.findByUsernameEquals(username);
        if (adminEntity == null) {
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                adminEntity, //用户名
                adminEntity.getPassword(), //密码
                getName()  //realm name
        );
        return authenticationInfo;
    }


}
