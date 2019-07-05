package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.FindBy.OnetoNClass;
import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/7/3 0003.
 */
public class TestOnetoNClass {
    @Test
    public static void testOnetoNClass() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //全局隐式等待10秒
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //调用谷歌浏览器
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //登陆
        LogIn logIn = new LogIn(driver);
        logIn.login("13411164100", "123456789");
        //等待5秒
        ClassAll.sleep(5000);
        //点击教务按钮
        HomePage homePage = new HomePage(driver);
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-1对N小组按钮
        homePage.onetoNClasses.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        OnetoNClass onetoNClass = new OnetoNClass(driver);
        //1对N学员进班
        onetoNClass.addOneToNClassStudent("自动化","test601003");
        ClassAll.sleep(5000);
        //1对N排课
        onetoNClass.addOneToNClass("自动化","1","5");
        ClassAll.sleep(5000);
        //1对N考勤
        onetoNClass.oneToNClassConsume();
        ClassAll.sleep(5000);
        //1对N取消考勤
        onetoNClass.oneToNClassCancelConsume();
        ClassAll.sleep(5000);
        //1对N学员退班
        onetoNClass.oneToNClassCancelStudent();
        ClassAll.sleep(5000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(5000);
        //关闭1对N小组切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(5000);
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-1对N课程按钮
        homePage.onetoNClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(5000);
        //删除1对N排课
        onetoNClass.oneToNClassCancelClass("自动化");
        driver.close();

    }
}
