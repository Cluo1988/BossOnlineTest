package com.platfrom.test001.TestCase;


import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.FindBy.Product;
import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestProduct {
    @Test(alwaysRun=true)
    public static void testProduct() {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //全局隐式等待10秒
        /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        //调用谷歌浏览器
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
        //登陆
        LogIn logIn = new LogIn(driver);
        logIn.login("13411164100", "123456789");
        //等待5秒
        ClassAll.sleep(10000);
        //点击设置按钮
        HomePage homePage = new HomePage(driver);
        homePage.options.click();
        ClassAll.sleep(10000);
        homePage.options_product.click();
        ClassAll.sleep(10000);
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(10000);
        //新增一对一产品
        Product product = new Product(driver);
        product.addoneToOneProduct("2019","二年级","自动化1对102","1","150","60");
        System.out.println("一对一产品新增完成");
        ClassAll.sleep(10000);
        //新增班课产品
        product.addClassProduct("2019","冬季","一年级","自动化班课02","4000","10","40","1");
        System.out.println("班课产品新增完成");
        ClassAll.sleep(10000);
        //新增1对N产品
        product.addoneToNProduct("2019","一年级","自动化1对N02","10","200","40");
        System.out.println("1对N产品新增完成");
        ClassAll.sleep(10000);
        //修改一对一产品
        product.modificationoneToOneProduct("自动化1对103","10","100","40");
        System.out.println("一对一产品修改完成");
        ClassAll.sleep(10000);
        //删除刚才创建的一对一产品
        product.deleteProduct("自动化1对103");
        ClassAll.sleep(10000);
        product.deleteProduct("自动化班课02");
        ClassAll.sleep(10000);
        product.deleteProduct("自动化1对N02");
        ClassAll.sleep(10000);
        System.out.println("产品删除完成");
        ClassAll.sleep(10000);
        //查询产品
        product.searchProduct();
        System.out.println("产品查询完成");
        driver.close();



    }
}
