package com.platfrom.test001.Utils;


import com.platfrom.test001.FindBy.LogIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static ChromeDriverService service;
    public static WebDriver driver;

    @BeforeMethod
    public static void openBrowser() {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("driver/chromedriver.exe"))
                .usingAnyFreePort()
                .build();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver =  new RemoteLogWebDriver(service.getUrl(),DesiredCapabilities.chrome(),BaseTest.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.xuebangsoft.net/eduboss/login.jsp");
        //LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
        driver.manage().window().maximize();
        //登陆
        LogIn logIn = new LogIn(driver);
        logIn.login("13411164100", "123456789");


    }



    @AfterMethod
    public void closeBrowser() {

        driver.quit();
        service.stop();
    }
}


/*	@AfterSuite
	public static  void stopService(){
		service.stop();
	}
}*/

