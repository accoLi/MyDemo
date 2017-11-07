package com.lcq.demo.system;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.omg.CORBA.PRIVATE_MEMBER;

public class SessionListener implements HttpSessionListener{
	private static int count = 0;
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		count++;
		// TODO Auto-generated method stub
         HttpSession session = event.getSession();
         System.out.println("session´´½¨£º"+session.getId());
         session.setAttribute("session", session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		count--;
		HttpSession session = event.getSession();
		session.removeAttribute("session");
        System.out.println("session×¢Ïú£º"+session.getId());
        
	}
	
	public static int getCount(){
		return count;
	}
}
