package com.platfrom.test001.Utils;


import com.platfrom.test001.Data.ConfigReader;
import com.platfrom.test001.FindBy.PageManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	public static  WebDriver driver;
	public static PageManage pageManage;

	@BeforeTest
	/*public void openBrowser(){
		//读取配置文件config.properties中的内容
		driver = WebDriverUtils.getDriver(ConfigReader.getConfig(ConfigReader.BROWSER),this.getClass());
		String wt = ConfigReader.getConfig(ConfigReader.WAITTIME);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(wt), TimeUnit.SECONDS);


		pageManage = new PageManage(driver);

	}*/
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();

	}

}
