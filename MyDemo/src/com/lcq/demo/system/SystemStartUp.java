package com.lcq.demo.system;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemStartUp implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
         System.out.println("-----系统注销------");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
         System.out.println("---系统开始初始化----");
         long startTime = System.currentTimeMillis();
         systemInit(event);
         long endTime = System.currentTimeMillis();
         System.out.println("-----系统初始化结束，耗时：" + (endTime-startTime) + "ms-------");
         
	}
    public void systemInit(ServletContextEvent event){
    	System.out.println("占不需要任何初始化");
    }
}
