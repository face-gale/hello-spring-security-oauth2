package com.aodiv.spring.security.oauth2.server.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 角色权限表
 */
@Entity
@Data
@Table(name = "tb_role_permission")
public class RolePermissionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 角色 ID
     */
    @Column(name = "role_id", nullable = false)
    private Long roleId;

    /**
     * 权限 ID
     */
    @Column(name = "permission_id", nullable = false)
    private Long permissionId;

}
