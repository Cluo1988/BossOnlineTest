package com.platfrom.test001.TestCase;

import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2019/7/3 0003.
 */
public class TestOnetoNClassGrade extends BaseTest {
    @Test(alwaysRun=true)
    public static void testOnetoNClass() {
        //等待10秒
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-1对N小组按钮
        pm.getHomePage().onetoNClasses.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //1对N学员进班
        pm.getOnetoNClass().addOneToNClassStudent("自动化","test601001");
        System.out.println("1对N学员进班完成");
        ClassAll.sleep(10000);
        //1对N排课
        pm.getOnetoNClass().addOneToNClass("自动化","1","5");
        System.out.println("1对N排课完成");
        ClassAll.sleep(10000);
        //1对N考勤
        pm.getOnetoNClass().oneToNClassConsume();
        System.out.println("1对N考勤完成");
        ClassAll.sleep(10000);
        //1对N取消考勤
        pm.getOnetoNClass().oneToNClassCancelConsume();
        System.out.println("1对N取消考勤完成");
        ClassAll.sleep(10000);
        //1对N学员退班
        pm.getOnetoNClass().oneToNClassCancelStudent();
        System.out.println("1对N学员退班完成");
        ClassAll.sleep(10000);
        //跳出iframe框
        pm.IframeOut();
        ClassAll.sleep(10000);
        //关闭1对N小组切页
        pm.ClosePage();
        ClassAll.sleep(10000);
        //点击教务按钮
        pm.getHomePage().education.click();
        ClassAll.sleep(10000);
        //点击教务-1对N课程按钮
        pm.getHomePage().onetoNClass.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //删除1对N排课
        pm.getOnetoNClass().oneToNClassCancelClass("自动化");
        System.out.println("1对N删除排课完成");

    }
}
