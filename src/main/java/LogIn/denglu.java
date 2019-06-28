package LogIn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import FindBy.LogIn;

public class denglu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
//		//全局隐式等待10秒
		driver.get("http://uat3.xuebangsoft.net/eduboss/login.jsp");
		//调用谷歌浏览器
		LogIn LogIn = PageFactory.initElements(driver, LogIn.class);
		LogIn.username_input.sendKeys("13411164100");
		LogIn.password_input.sendKeys("12345678");
		LogIn.logein_btn.click();
		
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		driver.close();
		//关闭浏览器调用
		
	}

}
