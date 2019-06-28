package com.platfrom.test001.FindBy;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	/**
	 *注册链接
	 */
	@FindBy(linkText = "注册")
	private WebElement register_link;

	@FindBy(linkText = "登录")
	private static WebElement login_link;

	@FindBy(xpath = "//a[@class='hd-welcome']")
	public WebElement welcome;

	@FindBy(xpath = "//a[@class='hd-logout']")
	public WebElement logout;

	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	/**
	 * 点击注册链接
	 */

	public void goRegist() {
		register_link.click();

	}

	public void goLogin(WebDriver driver) {
		if (isContentAppeared(driver,By.linkText("登录"))) {
			login_link.click();

		} else {
			logout.click();
			login_link.click();
		}
	}

	public static boolean isContentAppeared(WebDriver driver,By by) {  
	       boolean status = false;  
	       try {  
	           driver.findElement(by);  
               status = true;  
	       } catch (NoSuchElementException e) {      	  
	           status = false;              
	      }  
	      return status;  	    
	  }
}
	

