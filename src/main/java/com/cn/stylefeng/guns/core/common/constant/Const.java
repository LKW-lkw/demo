package com.cn.stylefeng.guns.core.common.constant;

import cn.hutool.core.collection.CollectionUtil;

import java.util.List;

public interface Const {

    /**
     * 默认管理系统的名称
     */
    String DEFAULT_SYSTEM_NAME = "Guns管理系统";
    /**
     * 默认欢迎界面的提示
     */
    String DEFAULT_WELCOME_TIP = "欢迎使用Guns管理系统!";
    /**
     * 不需要权限验证的资源表达式
     */
    List<String> NONE_PERMISSION_RES = CollectionUtil.newLinkedList("/assets/**", "/gunsApi/**", "/login", "/global/sessionError", "/kaptcha", "/error", "/global/error");


}
