package com.platfrom.test001.FindBy;

import org.openqa.selenium.WebDriver;

public class PageManage {
    private WebDriver driver;
	private IndexPage indexPage;
	private LoginPage loginPage;
	
	public PageManage(WebDriver driver){
		this.driver = driver;	
	}
	
	/**
	 * 首页
	 * @return
	 */
	public IndexPage getIndexPage() {
		if (indexPage == null) {
			indexPage = new IndexPage(driver);
		}
		return indexPage;
	}
	
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}
}
