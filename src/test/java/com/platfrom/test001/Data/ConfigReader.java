package com.platfrom.test001.Data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件读取
 * @author Administrator
 *
 */
public class ConfigReader {
	private static Properties prop;
	public static final String BROWSER = "browser";
	public static final String WAITTIME = "waitTime";
	
	
	static {
		prop = new Properties();
		InputStream is = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
	    try {
			prop.load(is);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static String getConfig(String name) {
		return prop.getProperty(name);
		
		
	}

}
