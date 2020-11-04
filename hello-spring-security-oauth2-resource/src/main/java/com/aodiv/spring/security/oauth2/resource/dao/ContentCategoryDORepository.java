package com.aodiv.spring.security.oauth2.resource.dao;

import com.aodiv.spring.security.oauth2.resource.domain.ContentCategoryDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContentCategoryDORepository extends JpaRepository<ContentCategoryDO, Long>, JpaSpecificationExecutor<ContentCategoryDO> {

}