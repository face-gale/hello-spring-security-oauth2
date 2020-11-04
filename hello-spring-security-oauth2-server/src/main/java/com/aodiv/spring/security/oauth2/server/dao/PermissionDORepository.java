package com.aodiv.spring.security.oauth2.server.dao;

import com.aodiv.spring.security.oauth2.server.domain.PermissionDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PermissionDORepository extends JpaRepository<PermissionDO, Long>, JpaSpecificationExecutor<PermissionDO> {

    // 在HQL语句中表名应该是ORM映射的类名，而不是在数据库中的表名
    @Query("SELECT p FROM UserDO u " +
            "LEFT JOIN UserRoleDO ur ON u.id = ur.userId " +
            "LEFT JOIN RoleDO r ON r.id = ur.roleId " +
            "LEFT JOIN RolePermissionDO rp ON r.id = rp.roleId " +
            "LEFT JOIN PermissionDO p ON p.id = rp.permissionId " +
            "WHERE u.id = ?1")
    List<PermissionDO> selectByUserId(Long id);
}