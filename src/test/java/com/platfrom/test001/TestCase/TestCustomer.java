package com.platfrom.test001.TestCase;


import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCustomer extends BaseTest {
    @Test(alwaysRun=true)
    public static void testcustome() {
        //等待5秒
        ClassAll.sleep(10000);
        //点击招生按钮
        pm.getHomePage().recruit_student.click();
        ClassAll.sleep(10000);
        //点击客户管理按钮
        pm.getHomePage().customer_management.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(10000);
        //点击招生-客户管理-登记客户按钮
        pm.getCustomer().customer_add.click();
        //输入登记客户页面必填项参数，并且点击保存
        pm.getCustomer().addCustomer("test601001", "13411164100", "短息", "来电咨询");
        System.out.println("客户新增完成");
        ClassAll.sleep(10000);
        //修改客户信息
        pm.getCustomer().modificationCustomer("test601002","13411164111","学生转介绍","地推电话");
        System.out.println("客户修改完成");
        ClassAll.sleep(10000);
        //查询客户列表
        pm.getCustomer().searchbthCustomer();
        System.out.println("客户查询完成");
        ClassAll.sleep(10000);
        //删除列表第一个客户
        pm.getCustomer().deleteCustomer();
        System.out.println("客户删除完成");

    }
}
