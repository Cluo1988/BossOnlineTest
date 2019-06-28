package TestCase;

import FindBy.Cont;
import FindBy.HomePage;
import FindBy.LogIn;
import TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public class TestCont {
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
        logIn.login("13411164100", "123456789");
        //等待5秒
        ClassAll.sleep(5000);
        //点击招生按钮
        HomePage homePage = new HomePage(driver);
        homePage.reception.click();
        ClassAll.sleep(5000);
        //点击新生报名按钮
        homePage.cont.click();
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        Cont cont = new Cont(driver);
        //新增合同页面
        cont.addCont("伯纳乌","1903080011","13411164100","六年级","伯纳乌","短息","地推电话","伯纳乌","300","22231");





    }
}
