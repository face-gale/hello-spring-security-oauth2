package com.aodiv.spring.security.oauth2.server.dao;

import com.aodiv.spring.security.oauth2.server.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserDORepository extends JpaRepository<UserDO, Long>, JpaSpecificationExecutor<UserDO> {

    List<UserDO> findByUsername(String username);
}