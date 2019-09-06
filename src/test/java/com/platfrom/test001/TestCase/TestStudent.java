package com.platfrom.test001.TestCase;

import com.platfrom.test001.TestOne.ClassAll;
import com.platfrom.test001.Utils.BaseTest;
import org.testng.annotations.Test;


/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class TestStudent extends BaseTest {
    @Test(alwaysRun=true)
    public static void testStudent() {
        //等待5秒
        ClassAll.sleep(10000);
        //点击学员按钮
        //HomePage homePage = new HomePage(driver);
        pm.getHomePage().student.click();
        ClassAll.sleep(10000);
        //点击学员列表按钮
        pm.getHomePage().student_management.click();
        //iframe页面跳转
        pm.IframeIn();
        ClassAll.sleep(10000);
        //修改学员信息
        //Student student = new Student(driver);
        pm.getStudent().modificationStudent("test601001","test601001","13411164100","二年级","上课中","13411164100");
        System.out.println("学员修改完成");
        ClassAll.sleep(10000);
        //查询学员
        pm.getStudent().searchStudent();
        System.out.println("学员查询完成");
        ClassAll.sleep(10000);
        //删除学员
        pm.getStudent().deleteStudent("测试");
        System.out.println("学员删除完成");
        ClassAll.sleep(10000);

    }
}
