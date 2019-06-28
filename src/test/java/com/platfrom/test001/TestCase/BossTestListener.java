package com.platfrom.test001.TestCase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BossTestListener extends TestListenerAdapter {
	WebDriver driver = null;
	@Override
	public void onTestFailure(ITestResult tr) {
		String name = tr.getMethod().getMethodName();
		/**
		 * 通过反射的方法，获取driver
		 */
		Object obj = tr.getInstance();
		Class<?> clazz = obj.getClass();
		try {
			Field filed = clazz.getField("driver");
			driver = (WebDriver)filed.get(obj);
			System.out.println(driver);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		//截图
		File sceenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//截图文件存放路径
		String path="sceenshot";
		SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String filename=clazz.getName()+"."+name+"_"+df.format(new Date())+".png";
		File pathfile = new File(path,filename);
		sceenshot.renameTo(pathfile);

		Reporter.log("<label style='color:red'>"+name+"执行失败，详情请查看日志,截图存放在sceenshot目录中</label>");
	
	}

}
