package com.platfrom.test001.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
public class Public {
    //构造本页面
    public Public(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
