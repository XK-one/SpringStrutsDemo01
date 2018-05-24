package com.wyk.ss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wyk.ss.entity.LoginActionForm;
import com.wyk.ss.manager.LoginManager;
import com.wyk.ss.manager.impl.LoginManagerImpl;

public class LoginAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		LoginActionForm bean = (LoginActionForm)form;
		String userName = bean.getUsername();
		String pwd = bean.getPassword();
		
		/*BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		*/
		
		//只需要去配置Listener就可以了,spring给实现好了
		BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request
									.getSession().getServletContext());
		LoginManager loginManager = (LoginManager)factory.getBean("loginManager");
		loginManager.login(userName, pwd); 
		
		return mapping.findForward("success");
	}

}
