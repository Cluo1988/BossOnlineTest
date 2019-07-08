package com.platfrom.test001.TestCase;


import com.platfrom.test001.FindBy.Cont;
import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public class TestCont {
    @Test(alwaysRun=true)
    public static void testCont() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //全局隐式等待10秒
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //调用谷歌浏览器
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
        //登陆
        LogIn logIn = new LogIn(driver);
        logIn.login("13411164100", "123456789");
        //等待5秒
        ClassAll.sleep(5000);
        //点击招生按钮
        HomePage homePage = new HomePage(driver);
        homePage.reception.click();
        ClassAll.sleep(5000);
        //点击新生报名按钮
        homePage.cont.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        Cont cont = new Cont(driver);
        //新增合同页面
        cont.addCont("伯纳乌","test601001","13411164100","六年级","伯纳乌","短息","地推电话","自动化","伯纳乌","10000","22231");
        System.out.println("合同新增完成");
        driver.close();
    }
}
