package com.platfrom.test001.demo;

import org.testng.Assert;
import org.testng.annotations.*;


/**
 * Created by Administrator on 2019/6/14 0014.
 */
public class test0011 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("执行beforClass。。。");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("执行afterClass。。。");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("执行beforeMethod。。。");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("执行afterMethod。。。");
    }
    @Test
    public void test00111() {
        Assert.assertEquals(5, 5);
        System.out.println("执行test00111。。。");
    }
    //把test00111作为前置条件，前者运行成功才运行后者，alwaysRun无论成功与否都会运行
    @Test(dependsOnMethods = "test00111",alwaysRun = true)
    public void test00112() {
        Assert.assertEquals(5, 5);
        System.out.println("执行test00112。。。");
    }
    //是否运行
 /*   @Test(enabled = false)
    public void test00113() {
        Assert.assertEquals(5, 5);
    }
    //运行1次，线程数1个
    @Test(invocationCount = 1,threadPoolSize = 1)
    public void test00114() {
        Assert.assertEquals(5, 5);
    }*/
}
