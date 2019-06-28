package com.platfrom.test001.TestOne;


public class ClassAll {

/**
 * 封装方法
 * 等待
 * @param sleep
 */
public static void sleep(int sleep) {
	try {
		Thread.sleep(sleep);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}



}
