package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.OnetoNClass;
import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2019/7/3 0003.
 */
public class TestOnetoNClass extends BaseTest {
    @Test(alwaysRun=true)
    public static void testOnetoNClass() {
        //等待10秒
        ClassAll.sleep(10000);
        //点击教务按钮
        HomePage homePage = new HomePage(driver);
        homePage.education.click();
        ClassAll.sleep(10000);
        //点击教务-1对N小组按钮
        homePage.onetoNClasses.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(10000);
        OnetoNClass onetoNClass = new OnetoNClass(driver);
        //1对N学员进班
        onetoNClass.addOneToNClassStudent("自动化","test601001");
        System.out.println("1对N学员进班完成");
        ClassAll.sleep(10000);
        //1对N排课
        onetoNClass.addOneToNClass("自动化","1","5");
        System.out.println("1对N排课完成");
        ClassAll.sleep(10000);
        //1对N考勤
        onetoNClass.oneToNClassConsume();
        System.out.println("1对N考勤完成");
        ClassAll.sleep(10000);
        //1对N取消考勤
        onetoNClass.oneToNClassCancelConsume();
        System.out.println("1对N取消考勤完成");
        ClassAll.sleep(10000);
        //1对N学员退班
        onetoNClass.oneToNClassCancelStudent();
        System.out.println("1对N学员退班完成");
        ClassAll.sleep(10000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(10000);
        //关闭1对N小组切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(10000);
        //点击教务按钮
        homePage.education.click();
        ClassAll.sleep(10000);
        //点击教务-1对N课程按钮
        homePage.onetoNClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(10000);
        //删除1对N排课
        onetoNClass.oneToNClassCancelClass("自动化");
        System.out.println("1对N删除排课完成");

    }
}
