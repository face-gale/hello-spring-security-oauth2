package com.aodiv.spring.security.oauth2.server.config;

import com.aodiv.spring.security.oauth2.server.domain.PermissionDO;
import com.aodiv.spring.security.oauth2.server.domain.UserDO;
import com.aodiv.spring.security.oauth2.server.service.PermissionService;
import com.aodiv.spring.security.oauth2.server.service.UserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/10/29
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDO userDO = userService.getByUsername(s);
        ArrayList<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (userDO != null){
            //声明用户授权
            List<PermissionDO> permissionDOs = permissionService.getByUserId(userDO.getId());
            permissionDOs.forEach(permissionDO -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permissionDO.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
            // 由框架完成认证工作
            return new User(userDO.getUsername(),userDO.getPassword(),grantedAuthorities);
        }
        return null;
    }
}
