package com.timposu.jsf.hello1;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld", eager=true)
public class Hello {
	
	 public Hello() {
		 System.out.println("Hello World running..");
	 }
	 
	 public String getMessage() {
		 return "Halo dunia";
	 }
}
