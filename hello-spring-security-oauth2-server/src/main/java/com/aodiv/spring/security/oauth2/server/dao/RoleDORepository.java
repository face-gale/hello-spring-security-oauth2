package com.aodiv.spring.security.oauth2.server.dao;

import com.aodiv.spring.security.oauth2.server.domain.RoleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDORepository extends JpaRepository<RoleDO, Long>, JpaSpecificationExecutor<RoleDO> {

}