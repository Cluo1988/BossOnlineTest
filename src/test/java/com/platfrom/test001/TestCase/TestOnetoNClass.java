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
        //点击教务-1对1排课按钮
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
        driver.findElement(By.id("courseTimeEl")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[7]/following::div[8]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[7]/following::div[8]")).click();
        driver.findElement(By.id("teacherEl")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='测试老师'])[4]/following::td[1]")).click();
        driver.findElement(By.id("choosePlanHours")).click();
        driver.findElement(By.id("choosePlanHours")).clear();
        driver.findElement(By.id("choosePlanHours")).sendKeys("1");
        driver.findElement(By.id("chooseTimeLong")).click();
        driver.findElement(By.id("chooseTimeLong")).clear();
        driver.findElement(By.id("chooseTimeLong")).sendKeys("5");
        driver.findElement(By.id("chooseSave")).click();
        driver.findElement(By.id("dateRange")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='今年'])[7]/following::th[2]")).click();
        driver.findElement(By.id("dateRange")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[6]/following::h4[1]")).click();
        driver.findElement(By.id("teacherEl")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[7]/following::button[1]")).click();
        driver.findElement(By.id("dateRange")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='下半年'])[7]/following::label[1]")).click();
        driver.findElement(By.id("dateRange")).click();
        driver.findElement(By.id("courseDateLayout")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='日'])[14]/following::div[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='添加标签/备注'])[1]/following::button[1]")).click();
    }
}
