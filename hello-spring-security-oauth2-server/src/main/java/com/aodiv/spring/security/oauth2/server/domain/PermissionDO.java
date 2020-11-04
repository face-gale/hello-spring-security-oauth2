package com.aodiv.spring.security.oauth2.server.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 权限表
 */
@Entity
@Data
@Table(name = "tb_permission")
public class PermissionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 父权限
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 权限名称
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 权限英文名称
     */
    @Column(name = "enname", nullable = false)
    private String enname;

    /**
     * 授权路径
     */
    @Column(name = "url", nullable = false)
    private String url;

    /**
     * 备注
     */
    @Column(name = "description")
    private String description;

    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Column(name = "updated", nullable = false)
    private Timestamp updated;

}
