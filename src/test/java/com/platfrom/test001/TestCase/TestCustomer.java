package com.platfrom.test001.TestCase;



import com.platfrom.test001.FindBy.Customer;
import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCustomer {
    @Test
    public static void testcustome() {
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        //全局隐式等待10秒
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //调用谷歌浏览器
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
        //登陆
        LogIn logIn = new LogIn(driver);
        logIn.login("13411164100","123456789");
        //等待5秒
        ClassAll.sleep(5000);
        //点击招生按钮
        HomePage homePage = new HomePage(driver);
        homePage.recruit_student.click();
        ClassAll.sleep(5000);
        //点击客户管理按钮
        HomePage.customer_management.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        //点击招生-客户管理-登记客户按钮
        Customer customer = new Customer(driver);
        customer.customer_add.click();
        //输入登记客户页面必填项参数，并且点击保存
        customer.addCustomer("test601001", "13411164100", "短息", "来电咨询");
        System.out.println("客户新增完成");
        ClassAll.sleep(5000);
        //修改客户信息
        customer.modificationCustomer("test601002","13411164111","学生转介绍","地推电话");
        System.out.println("客户修改完成");
        ClassAll.sleep(5000);
        //查询客户列表
        customer.searchbthCustomer();
        System.out.println("客户查询完成");
        ClassAll.sleep(5000);
        //删除列表第一个客户
        customer.deleteCustomer();
        System.out.println("客户删除完成");
        driver.close();
    }
}
