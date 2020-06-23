package com.cn.stylefeng.guns.core.shiro;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:
 * @Date: 2020/5/14 11:54
 * @Version: 1.0
 */
@Data
public class ShiroUser implements Serializable {
    /**
     * 用户主键ID
     */
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 角色集
     */
    private List<Long> roleList;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 角色名称集
     */
    private List<String> roleNames;
}
