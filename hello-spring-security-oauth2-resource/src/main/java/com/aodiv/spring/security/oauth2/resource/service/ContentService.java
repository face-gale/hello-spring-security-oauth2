package com.aodiv.spring.security.oauth2.resource.service;

import com.aodiv.spring.security.oauth2.resource.domain.ContentDO;

import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/04
 */
public interface ContentService {
    List<ContentDO> selectAll();
}
