package com.platfrom.test001.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	//构造本页
	public LogIn (WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//登录页面-账号输入框
	@FindBy(id="j_username_face")
	public static  WebElement username_input;

	//登录页面-密码输入框
	@FindBy(id="j_password")
	public static  WebElement password_input;

	//登录页面-登录按钮
	@FindBy(xpath="//button[@type='submit']")
	public static  WebElement logein_btn;

	/**
	 * 封装方法
	 * 登录
	 * @param user
	 * @param pwd
	 */	
	public void login(String user, String pwd) {
		username_input.sendKeys(user);
		password_input.sendKeys(pwd);
		logein_btn.click();
	}

}
