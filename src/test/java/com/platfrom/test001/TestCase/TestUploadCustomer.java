package com.platfrom.test001.TestCase;

import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestUploadCustomer extends BaseTest {
    @Test(alwaysRun = true)
    public static void testUploadCustomer() throws IOException {
        //等待5秒
        ClassAll.sleep(10000);
        //点击招生按钮
        //HomePage homePage = new HomePage(driver);
        pm.getHomePage().recruit_student.click();
        ClassAll.sleep(10000);
        //点击客户管理按钮
        pm.getHomePage().customer_management.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //点击导入按钮
        driver.findElement(By.xpath("//button[@id='importBtn']")).click();
        ClassAll.sleep(10000);
        //点击上传文件按钮
        driver.findElement(By.xpath("//div[@class='upload-customer-file-box margin-bottom-20']//div[1]")).click();
        ClassAll.sleep(10000);
        //AutoIt控件上传文件
        Runtime.getRuntime().exec("updown/kh001.exe");
        ClassAll.sleep(10000);
        //点击开始导入按钮
        driver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary submit']")).click();
        ClassAll.sleep(10000);
        //拿出导入后的弹框，得出导入是否成功
        String text= driver.findElement(By.xpath("//p[@class='text-center margin-top-20 margin-bottom-20']")).getText();
        System.out.println(text);
        //只要包含就成功
        Assert.assertTrue(text.contains("失败0条"));
        //对比完全值，不一样就失败
//        Assert.assertEquals("数据导入完成：成功1条，失败0条",text);

    }
}