package com.aodiv.spring.security.oauth2.resource.controller;

import com.aodiv.spring.security.oauth2.resource.domain.ContentDO;
import com.aodiv.spring.security.oauth2.resource.dto.ResponseResult;
import com.aodiv.spring.security.oauth2.resource.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dong feng
 * @version 1.0
 * @Desc
 * @date 2020/11/04
 */
@RestController
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping(value = "/")
    public ResponseResult<List<ContentDO>> list() {
        List<ContentDO> contentDOList = contentService.selectAll();
        return new ResponseResult<>(HttpStatus.OK.value(),HttpStatus.OK.toString(),contentDOList);
    }
}
