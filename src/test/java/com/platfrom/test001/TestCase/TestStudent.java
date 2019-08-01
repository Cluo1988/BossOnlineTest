package com.platfrom.test001.TestCase;



import com.platfrom.test001.FindBy.HomePage;
import com.platfrom.test001.FindBy.LogIn;
import com.platfrom.test001.FindBy.Student;
import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestStudent extends BaseTest {
    @Test(alwaysRun=true)
    public static void testStudent() {
        //等待5秒
        ClassAll.sleep(10000);
        //点击学员按钮
        HomePage homePage = new HomePage(driver);
        homePage.student.click();
        ClassAll.sleep(10000);
        //点击学员列表按钮
        HomePage.student_management.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(10000);
        //修改学员信息
        Student student = new Student(driver);
        student.modificationStudent("test601001","test601001","13411164100","二年级","上课中","13411164100");
        System.out.println("学员修改完成");
        ClassAll.sleep(10000);
        //查询学员
        student.searchStudent();
        System.out.println("学员查询完成");
        ClassAll.sleep(10000);
        //删除学员
        student.deleteStudent("测试");
        System.out.println("学员删除完成");
        ClassAll.sleep(10000);

    }
}
