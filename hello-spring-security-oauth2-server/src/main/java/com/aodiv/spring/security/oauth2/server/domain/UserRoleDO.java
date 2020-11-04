package com.aodiv.spring.security.oauth2.server.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户角色表
 */
@Table(name = "tb_user_role")
@Entity
@Data
public class UserRoleDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户 ID
     */
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /**
     * 角色 ID
     */
    @Column(name = "role_id", nullable = false)
    private Long roleId;

}
