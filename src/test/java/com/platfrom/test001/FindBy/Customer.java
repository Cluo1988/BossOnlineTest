package com.platfrom.test001.FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer {
    //构造本页面
    public Customer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //招生-客户管理-列表第一项数据勾选框
    @FindBy(xpath = "/html[1]/body[1]/div[6]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]")
    public static WebElement CustomerList;

    //招生-客户管理-登记客户按钮
    @FindBy(xpath="//button[contains(text(),'登记客户')]")
    public static WebElement customer_add;

    //招生-客户管理-查询按钮
    @FindBy(id = "searchbtn")
    public static WebElement searchBtn;

    //招生-客户管理-删除按钮
    @FindBy(id = "multiDelete")
    public static WebElement multiDelete;

    //招生-客户管理-删除-确定按钮
    @FindBy(id = "confirm-yes")
    public static WebElement confirm_yes;

    //新增客户页面元素
    //招生-客户管理-登记客户-客户姓名输入框
    @FindBy(xpath = "//input[@id='name']")
    public static WebElement customer_name;

    //招生-客户管理-登记客户-联系方式输入框
    @FindBy(xpath = "//input[@id='contact']")
    public static WebElement customer_contact;

    //招生-客户管理-登记客户-来源类型选择框
    @FindBy(id = "cusOrg")
    public static WebElement Source_type;

    //招生-客户管理-登记客户-来源渠道选择框
    @FindBy(id = "cusType")
    public static WebElement sources;

    //招生-客户管理-登记客户-提交按钮
    @FindBy(id = "submitCustomerBtn")
    public static WebElement submitCustomerBtn;

    //招生-客户管理-登记客户-提交按钮-确认按钮
    @FindBy(id = "confirm-yes")
    public static WebElement submit;

    //修改客户页面元素
    //招生-客户管理-详情
    @FindBy(xpath ="/html[1]/body[1]/div[6]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[last()]/a[1]")
    public static WebElement particulars;

    //招生-客户管理-详情页面-编辑按钮
    @FindBy(linkText ="编辑")
    public static WebElement edit;

    //招生-客户管理-详情页面-编辑模式-客户姓名
    @FindBy(name ="name")
    public static WebElement customer_name1;

    //招生-客户管理-详情页面-编辑模式-联系电话
    @FindBy(name ="contact")
    public static WebElement phone1;

    //招生-客户管理-详情页面-编辑模式-来源类型
    @FindBy(id ="cusOrg")
    public static WebElement Source_type1;

    //招生-客户管理-详情页面-编辑模式-来源渠道
    @FindBy(xpath ="//div[@id='cusTypeContainer']//div//select[@name='cusType']")
    public static WebElement Source1;

    //招生-客户管理-详情页面-编辑模式-保存按钮
    @FindBy(linkText ="保存")
    public static WebElement save;

    //招生-客户管理-详情页面-右上角的X
    @FindBy(xpath ="//button[@class='close']")
    public static WebElement close;

    /**
     * 封装方法
     * 新增客户
     *
     * @param cusname
     * @param cuscontact
     * @param Soutype
     * @param source
     */
    public void addCustomer(String cusname, String cuscontact, String Soutype, String source) {

        customer_name.sendKeys(cusname);
        customer_contact.sendKeys(cuscontact);
        Source_type.sendKeys(Soutype);
        sources.sendKeys(source);
        submitCustomerBtn.click();
        submit.click();
    }

   /* 封装方法
    修改客户
    @param customer_name
    @param phone
    @param Source_type
    @param Source*/
   /*driver.findElement(By.xpath("/html[1]/body[1]/div[6]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[32]/a[1]")).click();
     driver.findElement(By.linkText("编辑")).click();
     driver.findElement(By.name("name")).clear();
     driver.findElement(By.name("name")).sendKeys("test1");
     driver.findElement(By.name("contact")).clear();
     driver.findElement(By.name("contact")).sendKeys("13411164112");
     driver.findElement(By.id("cusOrg")).sendKeys("学生转介绍");
     driver.findElement(By.xpath("//div[@id='cusTypeContainer']//div//select[@name='cusType']")).sendKeys("地推电话");
     driver.findElement(By.linkText("保存")).click();
     ClassAll.sleep(5000);
     driver.findElement(By.xpath("//button[@class='close']")).click();*/
    public void modificationCustomer(String customer_name,String phone,String Source_type,String Source){
        particulars.click();
        ClassAll.sleep(5000);
        edit.click();
        customer_name1.clear();
        customer_name1.sendKeys(customer_name);
        phone1.clear();
        phone1.sendKeys(phone);
        Source_type1.sendKeys(Source_type);
        Source1.sendKeys(Source);
        save.click();
        ClassAll.sleep(5000);
        close.click();
    }

    /*封装方法
    * 删除客户*/
    public void deleteCustomer(){
        ClassAll.sleep(10000);
        CustomerList.click();
        multiDelete.click();
        confirm_yes.click();
    }

    /*封装方法
    查询客户*/
    /*driver.findElement(By.id("searchbtn")).click();*/
    public void searchbthCustomer(){
        searchBtn.click();
    }


}
