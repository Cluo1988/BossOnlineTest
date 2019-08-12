package com.platfrom.test001.TestCase;

import com.platfrom.test001.FindBy.ClassGrade;
import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public class TestClassGrade extends BaseTest {
    @Test(alwaysRun=true)
    public static void Class() {
        //等待5秒
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-班课管理按钮
        pm.getHomePage().classes.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(10000);
        //新增班课（新增了班级并且排了一节6月24号的课）
        pm.getClassGrade().addClass("自动化","50");
        System.out.println("新增班完成");
        ClassAll.sleep(10000);
        //学员进班
        pm.getClassGrade().addClassStudent("test601001");
        ClassAll.sleep(10000);
        //班课管理页面的班课考勤扣费
        pm.getClassGrade().classConsume("自动化");
        System.out.println("班课考勤扣费完成");
        ClassAll.sleep(10000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(10000);
        //关闭班课管理切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-班课考勤按钮
        pm.getHomePage().classAttendClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(10000);
        //取消班课考勤扣费
        pm.getClassGrade().cancelClass("自动化");
        System.out.println("取消班课考勤扣费完成");
        ClassAll.sleep(10000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        //关闭班课考勤切页
        driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-班课管理按钮
        pm.getHomePage().classes.click();
        ClassAll.sleep(10000);
        //iframe页面跳转
        WebElement iframe2 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe2);
        ClassAll.sleep(10000);
        //班课管理页面学员退班
        pm.getClassGrade().studentQuitClass("自动化");
        System.out.println("学员退班成功");
        ClassAll.sleep(10000);
        //删除班课
        //点击详情按钮
        pm.getClassGrade().classParticular.click();
        ClassAll.sleep(10000);
        //跳出iframe框
        driver.switchTo().defaultContent();
        ClassAll.sleep(10000);
        //跳转进入班课详情切页
        //iframe页面跳转
        WebElement iframe3 = driver.findElement(By.xpath("//div[3]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe3);
        ClassAll.sleep(10000);
        pm.getClassGrade().deleteClass();
        System.out.println("班课删除成功");



    }
}
