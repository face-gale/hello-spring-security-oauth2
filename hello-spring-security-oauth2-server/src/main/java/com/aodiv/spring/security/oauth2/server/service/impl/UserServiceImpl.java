package com.aodiv.spring.security.oauth2.server.service.impl;

import com.aodiv.spring.security.oauth2.server.dao.UserDORepository;
import com.aodiv.spring.security.oauth2.server.domain.UserDO;
import com.aodiv.spring.security.oauth2.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/03
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDORepository userDORepository;
    @Override
    public UserDO getByUsername(String username) {
        return userDORepository.findByUsername(username).get(0);
    }
}
