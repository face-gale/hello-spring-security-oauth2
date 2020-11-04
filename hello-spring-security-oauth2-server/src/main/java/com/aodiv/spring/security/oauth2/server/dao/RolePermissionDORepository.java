package com.aodiv.spring.security.oauth2.server.dao;

import com.aodiv.spring.security.oauth2.server.domain.RolePermissionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolePermissionDORepository extends JpaRepository<RolePermissionDO, Long>, JpaSpecificationExecutor<RolePermissionDO> {

}