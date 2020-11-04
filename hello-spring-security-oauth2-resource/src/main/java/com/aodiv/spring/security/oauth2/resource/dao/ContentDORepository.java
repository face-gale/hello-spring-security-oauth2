package com.aodiv.spring.security.oauth2.resource.dao;

import com.aodiv.spring.security.oauth2.resource.domain.ContentDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContentDORepository extends JpaRepository<ContentDO, Long>, JpaSpecificationExecutor<ContentDO> {

}