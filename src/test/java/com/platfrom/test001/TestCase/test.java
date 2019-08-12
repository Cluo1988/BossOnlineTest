package com.platfrom.test001.TestCase;

import com.platfrom.test001.Utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;


/**
 * Created by Administrator on 8/9/2019.
 */
public class test extends BaseTest {
    @Test
    public  void  test1(){
        Assert.assertEquals("11","12");
    }
}
