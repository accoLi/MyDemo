package com.lcq.demo.system;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemStartUp implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
         System.out.println("-----ϵͳע��------");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
         System.out.println("---ϵͳ��ʼ��ʼ��----");
         long startTime = System.currentTimeMillis();
         systemInit(event);
         long endTime = System.currentTimeMillis();
         System.out.println("-----ϵͳ��ʼ����������ʱ��" + (endTime-startTime) + "ms-------");
         
	}
    public void systemInit(ServletContextEvent event){
    	System.out.println("ռ����Ҫ�κγ�ʼ��");
    }
}
