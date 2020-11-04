package com.aodiv.spring.security.oauth2.server.dao;

import com.aodiv.spring.security.oauth2.server.domain.UserRoleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRoleDORepository extends JpaRepository<UserRoleDO, Long>, JpaSpecificationExecutor<UserRoleDO> {

}