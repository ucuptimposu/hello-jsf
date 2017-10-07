package com.timposu.jsf.hello2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "hello2", eager = true)
@RequestScoped
public class Hello2 {
	@ManagedProperty(value = "#{message}")
	private Message messageBean;
	private String message;
	
	public Hello2() {
		System.out.println("Hello World 2 running....");
	}
	
	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}
	
	public void setMessageBean(Message message) {
		this.messageBean = message;
	}
}
