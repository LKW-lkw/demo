package com.cn.stylefeng.guns.core.interceptor;

import com.cn.stylefeng.guns.core.shiro.ShiroKit;
import com.cn.stylefeng.guns.core.shiro.ShiroUser;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:
 * @Date: 2020/5/14 11:43
 * @Version: 1.0
 */
public class AttributesSetInteceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(modelAndView == null ||modelAndView.getViewName() == null){
            return;
        }
        if(!modelAndView.getViewName().endsWith("html")){
            return;
        }

        ShiroUser user = ShiroKit.getUser();
        if(null == user){
            throw new AuthenticationException("当前没有登录账号");
        }else {
            modelAndView.addObject("name",user.getName());
            modelAndView.addObject("avatar",user.getAvatar());
            modelAndView.addObject("email",user.getEmail());
        }
    }
}
