package com.hjh.cn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by 黄建辉 on 2016/9/29.
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Context容器初始化时候被触发，在所有的Filter和Servlet的init方法调用" +
                "调用这个方法");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Context容器初始化时候被触发，在所有的Filter和Servlet的init方法调用使用完成" +
                "调用这个方法");
    }
}
