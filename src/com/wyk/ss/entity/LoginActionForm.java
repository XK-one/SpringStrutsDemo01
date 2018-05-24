package com.wyk.ss.entity;

import org.apache.struts.action.ActionForm;
/** 
 * 登录ActionForm,负责表单收集数据. 
 * 表单的属性必须和ActionForm中的get和set的属性一致.  
 * 
 */ 
public class LoginActionForm extends ActionForm{

	 //用户名。  
    private String username;  
    //密码。  
    private String password;  
     
    //设置密码。  
    public void setPassword(String password) {  
       this.password = password;  
    }  
    //得到用户名。  
    public String getUsername() {  
       return username;  
    }  
    //设置用户名。  
    public void setUsername(String username) {  
       this.username = username;  
    }  
    //得到密码。  
    public String getPassword() {  
     
       return password;  
    }  
}
