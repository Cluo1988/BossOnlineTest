package com.platfrom.test001.TestOne;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ClassAll {

	//构造本页面
	public ClassAll(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


/**
 * 封装方法
 * 等待
 * @param sleep
 */
	public static void sleep(int sleep) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}




}
