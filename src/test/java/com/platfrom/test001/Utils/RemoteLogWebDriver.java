package com.platfrom.test001.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class RemoteLogWebDriver extends RemoteWebDriver {
	private Logger logger;

	public RemoteLogWebDriver(URL url, Capabilities caps, Class<?> clazz) {
		super(url, caps);
		logger = LogManager.getLogger(clazz);

	}

	//@FindB页面管理类运用了哪些定位方法，都需要重写
	@Override
	public WebElement findElementByXPath(String using) {
		try {
			WebElement element = super.findElementByXPath(using);
			logger.info(using + "定位已找到元素");
			return element;
		} catch (NoSuchElementException e) {
			logger.error(using + "定位未找到元素");
			throw e;
		}
	}

	@Override
	public WebElement findElementByName(String using) {
		try {
			WebElement element = super.findElementByName(using);
			logger.info(using + "定位已找到元素");
			return element;
		} catch (NoSuchElementException e) {
			logger.error(using + "定位未找到元素");
			throw e;
		}
	}

	@Override
	public WebElement findElementById(String using) {
		try {
			WebElement element = super.findElementById(using);
			logger.info(using + "定位已找到元素");
			return element;
		} catch (NoSuchElementException e) {
			logger.error(using + "定位未找到元素");
			throw e;
		}

	}

	@Override
	public WebElement findElementByLinkText(String using) {
		try {
			WebElement element = super.findElementByLinkText(using);
			logger.info(using + "定位已找到元素");
			return element;
		} catch (NoSuchElementException e) {
			logger.error(using + "定位未找到元素");
			throw e;
		}
	}
}
