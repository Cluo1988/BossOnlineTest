package com.platfrom.test001.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public  class HomePage {
	//构造本页面
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//首页退出头像
	@FindBy(xpath="//input[@name='picture']")
	public static WebElement logout_head;

	//首页退出按钮
	@FindBy(xpath="//span[@class='btn btn-primary btn-logout']")
	public static WebElement logout_btn;

	//首页-前台按钮
	@FindBy(xpath="//a[@title='前台']")
	public static WebElement reception;

	//首页-前台-新生报名按钮
	@FindBy(xpath="//a[contains(text(),'新生报名')]")
	public static WebElement cont;

	//首页-招生按钮
	@FindBy(xpath="//a[@title='招生']")
	public static WebElement recruit_student;

	//首页-招生-客户管理按钮
	@FindBy(xpath="//a[contains(text(),'客户管理')]")
	public static WebElement customer_management;

	//首页-学员按钮
	@FindBy(xpath="//a[@title='学员']")
	public static WebElement student;

	//首页-学员-学员列表按钮
	@FindBy(xpath="//a[contains(text(),'学员列表')]")
	public static WebElement student_management;

	//首页-教务按钮
	@FindBy(xpath="//a[@title='教务']")
	public static WebElement education;

	//首页-教务-1对1排课按钮
	@FindBy(xpath="//a[contains(text(),'1对1排课')]")
	public static WebElement onetoOneClasses;

	//首页-教务-1对1考勤
	@FindBy(xpath="//a[contains(text(),'1对1考勤')]")
	public static WebElement onetoOneAttendClass;

	//首页-教务-班课管理
	@FindBy(xpath="//a[contains(text(),'班课管理')]")
	public static WebElement classes;

	//首页-教务-班课考勤
	@FindBy(xpath="//a[contains(text(),'班课考勤')]")
	public static WebElement classAttendClass;

	//首页-设置按钮
	@FindBy(xpath="//a[@title='设置']")
	public static WebElement options;

	//首页-设置-课程设置按钮
	@FindBy(xpath="//a[contains(text(),'课程设置')]")
	public static WebElement options_product;





}





