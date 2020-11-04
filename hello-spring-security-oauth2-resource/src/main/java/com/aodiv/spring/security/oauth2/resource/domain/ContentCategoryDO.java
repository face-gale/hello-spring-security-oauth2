package com.aodiv.spring.security.oauth2.resource.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 内容分类
 */
@Entity
@Table(name = "tb_content_category")
@Data
public class ContentCategoryDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类目ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 分类名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @Column(name = "sort_order")
    private Integer sortOrder;

    /**
     * 该类目是否为父类目，1为true，0为false
     */
    @Column(name = "is_parent")
    private Boolean parent;

    /**
     * 创建时间
     */
    @Column(name = "created")
    private Timestamp created;

    /**
     * 创建时间
     */
    @Column(name = "updated")
    private Timestamp updated;

}
