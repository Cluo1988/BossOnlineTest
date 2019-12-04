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
public class TestUploadCont extends BaseTest {
    @Test(alwaysRun = true)
    public static void testUploadCont() throws IOException {
        //等待5秒
        ClassAll.sleep(10000);
        //点击财务按钮
        //HomePage homePage = new HomePage(driver);
        pm.getHomePage().Finance.click();
        ClassAll.sleep(10000);
        //点击合同管理按钮
        pm.getHomePage().financeCont.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //点击导入按钮
        driver.findElement(By.xpath("//button[@id='importExcelBtn']")).click();
        ClassAll.sleep(10000);
        //修改分公司1
        driver.findElement(By.xpath("//select[@id='importContractModalBrenchId']")).sendKeys("西班牙");
        ClassAll.sleep(10000);
        //选择校区
        driver.findElement(By.xpath("//select[@id='importContractModalCampusId']")).sendKeys("伯纳乌");
        ClassAll.sleep(10000);
        //选择上传文档按钮
        driver.findElement(By.xpath("//div[@id='dropArea']")).click();
        ClassAll.sleep(10000);
        //AutoIt控件上传文件
        Runtime.getRuntime().exec("updown/ht001.exe");
        ClassAll.sleep(10000);
        //点击开始导入按钮
        driver.findElement(By.xpath("//button[@id='kaishi']")).click();
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