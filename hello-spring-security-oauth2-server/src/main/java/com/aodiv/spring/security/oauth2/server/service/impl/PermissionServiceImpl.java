package com.aodiv.spring.security.oauth2.server.service.impl;

import com.aodiv.spring.security.oauth2.server.dao.PermissionDORepository;
import com.aodiv.spring.security.oauth2.server.domain.PermissionDO;
import com.aodiv.spring.security.oauth2.server.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/03
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDORepository permissionDORepository;

    @Override
    public List<PermissionDO> getByUserId(Long id) {
        return permissionDORepository.selectByUserId(id);
    }
}
