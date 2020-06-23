package com.cn.stylefeng.guns.core.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;
import java.util.Map;

import static com.cn.stylefeng.guns.core.common.constant.Const.DEFAULT_SYSTEM_NAME;
import static com.cn.stylefeng.guns.core.common.constant.Const.DEFAULT_WELCOME_TIP;

/**
 * beetl拓展配置
 * @Author:
 * @Date: 2020/5/14 11:07
 * @Version: 1.0
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        Map<String,Object> shared = new HashMap<>();
        shared.put("systemName",DEFAULT_SYSTEM_NAME);
        shared.put("welcomeTip",DEFAULT_WELCOME_TIP);
        groupTemplate.setSharedVars(shared);

        //全局共享方法
        //groupTemplate.registerFunctionPackage();
    }
}
