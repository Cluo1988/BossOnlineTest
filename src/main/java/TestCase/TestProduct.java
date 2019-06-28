package TestCase;

import FindBy.HomePage;
import FindBy.LogIn;
import FindBy.Product;
import TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static FindBy.Product.*;

/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestProduct {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
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
        ClassAll.sleep(5000);
        //点击设置按钮
        HomePage homePage = new HomePage(driver);
        homePage.options.click();
        ClassAll.sleep(5000);
        homePage.options_product.click();
        ClassAll.sleep(5000);
        //iframe页面跳转
        WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
        driver.switchTo().frame(iframe);
        ClassAll.sleep(5000);
        //新增产品
        Product product = new Product(driver);
        product.addProduct("2019","二年级","test612003","1","150","60");
        ClassAll.sleep(5000);
        //删除产品
        product.deleteProduct();
        ClassAll.sleep(5000);
        product.productmodification.click();
        ClassAll.sleep(5000);
        //修改产品
        product.modificationProduct("test998","10","100","40");
        ClassAll.sleep(5000);
        //查询产品
        product.searchProduct();



    }
}
