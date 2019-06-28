package TestCase;

import FindBy.HomePage;
import FindBy.LogIn;
import FindBy.Student;
import TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestStudent {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
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
        //点击学员按钮
        HomePage homePage = new HomePage(driver);
        homePage.student.click();
        ClassAll.sleep(5000);
        //点击学员列表按钮
        HomePage.student_management.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        //修改学员信息
        Student student = new Student(driver);
        student.modificationStudent("test1","13411164100","二年级","上课中","13411164100");
        ClassAll.sleep(5000);
        //删除学员
        student.deleteStudent("测试");
        //查询学员
        student.searchStudent();

    }
}
