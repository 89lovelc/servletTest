package com.hjh.cn.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by 黄建辉 on 2016/9/29.
 */
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("当HttpServletRequest 对象传递到用户的Servlet的service方法之后该方法调用");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("当HttpServletRequest 对象传递到用户的Servlet的service方法之前该方法调用");
    }
}
