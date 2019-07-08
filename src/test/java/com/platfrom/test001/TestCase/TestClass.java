package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.Class;
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
 * Created by Administrator on 2019/6/26 0026.
 */
public class TestClass {
    public static  WebDriver driver;
    @Test(alwaysRun=true)
    public static void Class() {
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
        //点击教务-班课管理按钮
        homePage.classes.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        Class Class = new Class(driver);
        //新增班课（新增了班级并且排了一节6月24号的课）
        Class.addClass("自动化","50");
        System.out.println("新增班完成");
        ClassAll.sleep(5000);
        //学员进班
        Class.addClassStudent("test601001");
        ClassAll.sleep(5000);
        //班课管理页面的班课考勤扣费
        Class.classConsume("自动化");
        System.out.println("班课考勤扣费完成");
        ClassAll.sleep(5000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(5000);
        //关闭班课管理切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(5000);
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-班课考勤按钮
        homePage.classAttendClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(5000);
        //取消班课考勤扣费
        Class.cancelClass("自动化");
        System.out.println("取消班课考勤扣费完成");
        ClassAll.sleep(5000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        //关闭班课考勤切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(5000);
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-班课管理按钮
        homePage.classes.click();
        ClassAll.sleep(5000);
        //iframe页面跳转
        WebElement iframe2 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe2);
        ClassAll.sleep(5000);
        //班课管理页面学员退班
        Class.studentQuitClass("自动化");
        System.out.println("学员退班成功");
        ClassAll.sleep(5000);
        //删除班课
        //点击详情按钮
        Class.classParticular.click();
        ClassAll.sleep(5000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(5000);
        //跳转进入班课详情切页
        //iframe页面跳转
        WebElement iframe3 = driver.findElement(By.xpath("//div[3]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe3);
        ClassAll.sleep(5000);
        Class.deleteClass();
        System.out.println("班课删除成功");
        driver.close();


    }
}
