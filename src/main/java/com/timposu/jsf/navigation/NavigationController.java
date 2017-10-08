package com.timposu.jsf.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="navigationController", eager=true)
@RequestScoped
public class NavigationController {

	@ManagedProperty(value="#{param.pageId}")
	private String pageId;
	
	public String movePage1() {
		return "page1";
	}
	
	public String movePage2() {
		return "page2";
	}
	
	public String moveHomePage() {
		return "home";
	}
	
	public String processPage1() {
		return "page";
	}
	
	public String processPage2() {
		return "page";
	}
	
	public String showPage() {
		if (pageId == null) {
			return "home";
		} else if (pageId.equals("1")) {
			return "page1";
		} else if (pageId.equals("2")) {
			return "page2";
		} else {
			return "home";
		}
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
}
