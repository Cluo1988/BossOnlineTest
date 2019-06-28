package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public class BeforeTest {
    //构造本页面
    public BeforeTest(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public static void Logeintest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //全局隐式等待10秒
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //调用谷歌浏览器
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
        //登陆
        com.platfrom.test001.FindBy.LogIn logIn = new LogIn(driver);
        logIn.login("13411164100", "123456789");

    }
}