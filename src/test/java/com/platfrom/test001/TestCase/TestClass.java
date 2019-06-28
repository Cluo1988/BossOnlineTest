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
    @Test
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
        //Class.addClass("自动化","50");
        //System.out.println("新增班完成");
        //ClassAll.sleep(5000);
        //学员进班
        //Class.addClassStudent("test619001");
        ClassAll.sleep(5000);

        //班课管理查询缩小范围，校区和班课名称搜索
        driver.findElement(By.xpath("//select[@id='blCampusEl']//option[contains(text(),'伯纳乌')]")).click();
        driver.findElement(By.id("search-mini-class-name")).clear();
        driver.findElement(By.id("search-mini-class-name")).sendKeys("自动化");
        ClassAll.sleep(5000);
        driver.findElement(By.id("searchbtn")).click();
        ClassAll.sleep(5000);
        //点击考勤按钮
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='报名'])[2]/following::button[1]")).click();
        ClassAll.sleep(5000);
        //点击未考勤页面元素，触发考勤弹框
        driver.findElement(By.xpath("//td[contains(text(),'未考勤')]")).click();
        //点击考勤按钮
        driver.findElement(By.id("miniClassAttendanceBtn")).click();
        ClassAll.sleep(5000);
        //勾选班课排课
        driver.findElement(By.xpath("//input[@id='cb_jqgrid-attd']")).click();
        //点击班主任扣费按钮
        driver.findElement(By.id("minicourse-submit-charge")).click();
        ClassAll.sleep(5000);
        //点击扣费确认按钮
        driver.findElement(By.id("confirm-yes")).click();
        System.out.println("班课排课完成");
        ClassAll.sleep(5000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(5000);
        //关闭班课切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(5000);
        //取消班课考勤
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-班课考勤按钮
        homePage.classAttendClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(5000);
        //点击日期框
        driver.findElement(By.id("date_range")).click();
        //去掉日期范围
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[1]/following::input[1]")).click();
        //输入班课名称确认范围
        driver.findElement(By.id("miniClassName")).sendKeys("自动化");
        //点击查询按钮
        driver.findElement(By.id("searchBtn")).click();
        ClassAll.sleep(5000);
        //选择课程扣费切页
        driver.findElement(By.id("classTeacherDeduction")).click();
        ClassAll.sleep(5000);
        //勾选已扣费勾选框
        driver.findElement(By.id("showChargedMcCourses")).click();
        //去掉待扣费勾选框
        driver.findElement(By.id("showUnchargedMcCourses")).click();
        ClassAll.sleep(5000);
        //点击取消扣费按钮
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='无'])[1]/following::button[1]")).click();
        ClassAll.sleep(5000);
        //选择已扣费课程
        driver.findElement(By.xpath("//input[@id='cb_jqgrid-attd']")).click();
        //点击取消扣费按钮
        driver.findElement(By.id("minicourse-submit-roll")).click();
        ClassAll.sleep(5000);
        //取消扣费确认按钮
        driver.findElement(By.id("confirm-yes")).click();
        //关闭取消扣费弹框
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[1]/following::button[1]")).click();


        //重置班课考勤

    }
}
