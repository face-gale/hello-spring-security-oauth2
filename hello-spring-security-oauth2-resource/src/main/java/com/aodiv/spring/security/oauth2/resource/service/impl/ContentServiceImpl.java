package com.aodiv.spring.security.oauth2.resource.service.impl;

import com.aodiv.spring.security.oauth2.resource.dao.ContentDORepository;
import com.aodiv.spring.security.oauth2.resource.domain.ContentDO;
import com.aodiv.spring.security.oauth2.resource.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/04
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentDORepository contentDORepository;

    @Override
    public List<ContentDO> selectAll() {
        return contentDORepository.findAll();
    }
}
