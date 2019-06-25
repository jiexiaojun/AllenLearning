/**
 * @项目名称：ServletDemo
 * @文件名称：MyListener.java
 * @所属包名：com.allen.listener
 * @创建时间：2019年6月25日上午10:48:33
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.allen.listener;

/**
 * @类名称：MyListener @类描述：
 * @创建人：allen
 * @创建时间：2019年6月25日 上午10:48:33
 */
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("ServletContextListener.contextInitialized方法被调用");
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("ServletContextListener.contextDestroyed方法被调用");
	}
}


