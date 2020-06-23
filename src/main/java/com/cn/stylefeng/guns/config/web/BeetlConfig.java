package com.cn.stylefeng.guns.config.web;

import com.cn.stylefeng.guns.config.properties.BeetlProperties;
import com.cn.stylefeng.guns.core.beetl.BeetlConfiguration;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * web 配置类
 * @Author:
 * @Date: 2020/5/14 11:03
 * @Version: 1.0
 */
@Configuration
public class BeetlConfig {

    @Autowired
    BeetlProperties beetlProperties;

    /**
     * beetl的配置
     */
    @Bean(initMethod = "init")
    public BeetlConfiguration beetlConfiguration(){
       BeetlConfiguration beetlConfiguration = new BeetlConfiguration();
       beetlConfiguration.setResourceLoader(new ClasspathResourceLoader(BeetlConfig.class.getClassLoader(),beetlProperties.getPrefix()));
       beetlConfiguration.setConfigProperties(beetlProperties.getProperties());
       return beetlConfiguration;
    }

    @Bean
    public BeetlSpringViewResolver beetlViewResolver(){
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setConfig(beetlConfiguration());
        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
        beetlSpringViewResolver.setOrder(0);
        return beetlSpringViewResolver;
    }

}
