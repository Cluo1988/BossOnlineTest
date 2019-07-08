package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.FindBy.OnetoOneClasses;
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
public class TestOnetoOneClasses {
    @Test(alwaysRun=true)
    public static void testOnetoOneClasses() {
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
        //点击教务按钮
        HomePage homePage = new HomePage(driver);
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-1对1排课按钮
        HomePage.onetoOneClasses.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        OnetoOneClasses onetooneClasses = new OnetoOneClasses(driver);
        //新增一对一排课
        onetooneClasses.addonetoOneClasses("伯纳乌","test601001","英语","1","5");
        System.out.println("一对一排课完成");
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(5000);
        //关闭排课切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(5000);
        //考勤操作
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(5000);
        //点击教务-1对1考勤按钮
        homePage.onetoOneAttendClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(5000);
        //一对一课程考勤
        onetooneClasses.useonetoOneClasses("test601001");
        System.out.println("一对一考勤完成");
        ClassAll.sleep(5000);
        //一对一重置考勤
        onetooneClasses.cancelonetoOneClasses();
        System.out.println("一对一重置考勤完成");
        ClassAll.sleep(5000);
        //一对一考勤页面-删除排课
        onetooneClasses.deleteonetoOneClasses();
        System.out.println("一对一排课删除完成");
        driver.close();

        //一对一排课页面-删除一对一排课
        //onetooneClasses.onetoOneClassesClear();
        //ClassAll.sleep(5000);




    }
}
