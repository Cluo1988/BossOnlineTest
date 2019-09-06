package com.platfrom.test001.TestCase;

import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



/**
 * Created by Administrator on 2019/6/19 0019.
 */
public class TestOnetoOneClasses extends BaseTest {
    @Test(alwaysRun=true)
    public static void testOnetoOneClasses() {
        //等待5秒
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-1对1排课按钮
        pm.getHomePage().onetoOneClasses.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //新增一对一排课
        pm.getOnetoOneClasses().addonetoOneClasses("伯纳乌","test601001","英语","1","5");
        System.out.println("一对一排课完成");
        //跳出iframe框
        pm.IframeOut();
        ClassAll.sleep(10000);
        //关闭排课切页
        pm.ClosePage();
        ClassAll.sleep(10000);
        //考勤操作
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-1对1考勤按钮
        pm.getHomePage().onetoOneAttendClass.click();
        //iframe页面跳转
        WebElement iframe1 = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe1);
        ClassAll.sleep(10000);
        //一对一课程考勤
        pm.getOnetoOneClasses().useonetoOneClasses("test601001");
        System.out.println("一对一考勤完成");
        ClassAll.sleep(10000);
        //一对一重置考勤
        pm.getOnetoOneClasses().cancelonetoOneClasses();
        System.out.println("一对一重置考勤完成");
        ClassAll.sleep(10000);
        //一对一考勤页面-删除排课
        pm.getOnetoOneClasses().deleteonetoOneClasses();
        System.out.println("一对一排课删除完成");

    }
}
