package com.platfrom.test001.FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class Product {
    //构造本页面
    public Product(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //设置-课程设置-归属校区
    @FindBy(xpath ="//select[@id='organization_search']//option[contains(text(),'伯纳乌')]")
    public static WebElement affiliationSchool;

    //设置-课程设置-适用校区
    @FindBy(xpath ="//select[@id='productGrantOrgId_search']//option[contains(text(),'伯纳乌')]")
    public static WebElement useSchool;

    //设置-课程设置-适用校区(一对一)
    @FindBy(xpath ="//option[contains(text(),'一对一')]")
    public static WebElement schoolType;

    //设置-课程设置-课程名称
    @FindBy(xpath ="//input[@id='name_search']")
    public static WebElement productName;

    //设置-课程设置-查询按钮
    @FindBy(xpath ="//button[@id='searchbtn']")
    public static WebElement querySchool;

    //设置-课程设置-重置按钮
    @FindBy(xpath ="//button[@id='resetBut']")
    public static WebElement productresetbth;

    //一对一产品新增
    //设置-课程设置-新增课程产品按钮
    @FindBy(id ="addProduct")
    public static WebElement addproduct;
    //设置-课程设置-新增一对一课程产品-选择产品类型（1对1）
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[1]")
    public static WebElement producttype;
    //设置-课程设置-新增一对一课程产品-选择归属校区
    @FindBy(xpath ="//select[@id='organization']//option[contains(text(),'伯纳乌')]")
    public static WebElement productschool;
    //设置-课程设置-新增一对一课程产品-课程年份
    @FindBy(id ="productVersion")
    public static WebElement productyear;
    //设置-课程设置-新增一对一课程产品-适用年级
    @FindBy(id ="grade")
    public static WebElement productgrade;
    //设置-课程设置-新增一对一课程产品-课程名称
    @FindBy(id ="productName")
    public static WebElement productname;
    //设置-课程设置-新增一对一课程产品-课时数
    @FindBy(id ="miniClassTotalhours")
    public static WebElement producthours;
    //设置-课程设置-新增一对一课程产品-课程单价
    @FindBy(id ="priceEl")
    public static WebElement productprice;
    //设置-课程设置-新增一对一课程产品-课时时长
    @FindBy(id ="classTimeLength")
    public static WebElement productclassTime;
    //设置-课程设置-新增一对一课程产品-适用科目
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")
    public WebElement productclass;
    //设置-课程设置-新增一对一课程产品-保存
    @FindBy(id ="appointmentDateSubmit")
    public static WebElement productsave;

    //一对一产品修改页面
    //设置-课程设置-一对一修改页面-课程名称
    @FindBy(xpath = "//input[@id='productName']")
    public static WebElement productname1;
    //设置-课程设置-一对一修改页面-课时数
    @FindBy(id = "miniClassTotalhours")
    public static WebElement producthours1;
    //设置-课程设置-一对一修改页面-课程单价
    @FindBy(id = "priceEl")
    public static WebElement productprice1;
    //设置-课程设置-一对一修改页面-课时时长
    @FindBy(id = "classTimeLength")
    public static WebElement productclassTime1;
    //设置-课程设置-一对一修改页面-保存
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement productsave1;

    //班课产品新增
    //设置-课程设置-新增班课产品-点击班课切页
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[2]")
    public static WebElement classProductPage;
    //设置-课程设置-新增班课产品-选择校区
    @FindBy(xpath = "//select[@id='organization']//option[contains(text(),'伯纳乌')]")
    public static WebElement classProductSchool;
    //设置-课程设置-新增班课产品-选择课程年份
    @FindBy(id = "productVersion")
    public static WebElement classProductYear;
    //设置-课程设置-新增班课产品-选择课程季度
    @FindBy(id = "productQuarter")
    public static WebElement classProductQuarter;
    //设置-课程设置-新增班课产品-选择课程年级
    @FindBy(id = "grade")
    public static WebElement classProductGrade;
    //设置-课程设置-新增班课产品-选择课程名称
    @FindBy(id = "productName")
    public static WebElement classProductName;
    //设置-课程设置-新增班课产品-收费模式选择按课时
    @FindBy(xpath = "//select[@id='fundsTypeSelect']//option[contains(text(),'按课时')]")
    public static WebElement classProductChargeModa;

    //设置-课程设置-新增班课产品-选择课程总价
    @FindBy(id = "paymentEl")
    public static WebElement classProductPrice;
    //设置-课程设置-新增班课产品-选择课时数
    @FindBy(id = "miniClassTotalhours")
    public static WebElement classProductHour;
    //设置-课程设置-新增班课产品-选择课时时长
    @FindBy(id = "classTimeLength")
    public static WebElement classProductTime;
    //设置-课程设置-新增班课产品-选择课时时长
    @FindBy(id = "everyCourseClassNum")
    public static WebElement classProductOneHour;
    //设置-课程设置-新增班课产品-选择适用科目
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")
    public static WebElement classProductSubject;
    //设置-课程设置-新增班课产品-保存
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement classProductSave;


    //一对N产品新增
    //设置-课程设置-新增1对N产品-点击1对N切页
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[4]")
    public static WebElement oneToNProductPage;
    //设置-课程设置-新增1对N产品-点击校区
    @FindBy(xpath = "//select[@id='organization']//option[contains(text(),'伯纳乌')]")
    public static WebElement oneToNProductSchool;
    //设置-课程设置-新增1对N产品-点击产品年份
    @FindBy(id = "productVersion")
    public static WebElement oneToNProductYear;
    //设置-课程设置-新增1对N产品-点击产品年级
    @FindBy(id = "grade")
    public static WebElement oneToNProductGrade;
    //设置-课程设置-新增1对N产品-点击产品名称
    @FindBy(id = "productName")
    public static WebElement oneToNProductName;
    //设置-课程设置-新增1对N产品-点击产品课时数
    @FindBy(id = "miniClassTotalhours")
    public static WebElement oneToNProductHour;
    //设置-课程设置-新增1对N产品-点击产品课程总价
    @FindBy(id = "priceEl")
    public static WebElement oneToNProductPrice;
    //设置-课程设置-新增1对N产品-点击产品课时时长
    @FindBy(id = "classTimeLength")
    public static WebElement oneToNProductTime;
    //设置-课程设置-新增1对N产品-适用科目
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")
    public static WebElement oneToNProductSubject;
    //设置-课程设置-新增1对N产品-保存
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement oneToNProductSave;


    //设置-课程设置-第一个产品修改
    @FindBy(xpath = "/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[last()]/a[1]")
    public static WebElement productmodification;

    //设置-课程设置-第一个产品删除按钮
    @FindBy(xpath = "/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[last()]/a[2]")
    public static WebElement productdelete;

    //设置-课程设置-第一个产品删除-确认
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement productdeleteyes;

    //设置-课程设置-查询
    @FindBy(xpath = "//button[@id='searchbtn']")
    public static WebElement productsearch;





    /*封装方法
    新增一对一产品
    driver.findElement(By.id("addProduct")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[1]")).click();
        driver.findElement(By.id("productVersion")).sendKeys("2019");
        driver.findElement(By.id("grade")).sendKeys("二年级");
        driver.findElement(By.id("productName")).clear();
        driver.findElement(By.id("productName")).sendKeys("test612002");
        driver.findElement(By.id("miniClassTotalhours")).sendKeys("1");
        driver.findElement(By.id("priceEl")).sendKeys("1500");
        driver.findElement(By.id("classTimeLength")).sendKeys("60");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")).click();
        driver.findElement(By.id("appointmentDateSubmit")).click();*/
    public void addoneToOneProduct(String Productyear, String Productgrade, String Productname, String Producthours, String Productprice, String ProductclassTime) {
        addproduct.click();
        ClassAll.sleep(5000);
        producttype.click();
        productschool.click();
        productyear.sendKeys(Productyear);
        productgrade.sendKeys(Productgrade);
        productname.clear();
        productname.sendKeys(Productname);
        producthours.sendKeys(Producthours);
        productprice.sendKeys(Productprice);
        productclassTime.sendKeys(ProductclassTime);
        productclass.click();
        productsave.click();
    }

    /*封装方法
    修改一对一产品
    driver.findElement(By.xpath("//input[@id='productName']")).click();
    driver.findElement(By.id("productName")).clear();
    driver.findElement(By.id("productName")).sendKeys("test003");
    driver.findElement(By.id("miniClassTotalhours")).click();
    driver.findElement(By.id("miniClassTotalhours")).clear();
    driver.findElement(By.id("miniClassTotalhours")).sendKeys("10");
    driver.findElement(By.id("priceEl")).click();
    driver.findElement(By.id("priceEl")).click();
    driver.findElement(By.id("priceEl")).clear();
    driver.findElement(By.id("priceEl")).sendKeys("100");
    driver.findElement(By.id("classTimeLength")).click();
    driver.findElement(By.id("classTimeLengthDiv")).click();
    driver.findElement(By.id("classTimeLength")).clear();
    driver.findElement(By.id("classTimeLength")).sendKeys("40");
    driver.findElement(By.id("subjectDiv")).click();
    driver.findElement(By.name("subjectIds")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")).click();
    driver.findElement(By.id("appointmentDateSubmit")).click();*/
    public void modificationoneToOneProduct(String Productname1,String Producthours1,String Productprice1,String ProductclassTime1){
        affiliationSchool.click();
        useSchool.click();
        ClassAll.sleep(5000);
        schoolType.click();
        ClassAll.sleep(5000);
        querySchool.click();
        ClassAll.sleep(5000);
        productmodification.click();
        ClassAll.sleep(5000);
        productname1.clear();
        productname1.sendKeys(Productname1);
        producthours1.clear();
        producthours1.sendKeys(Producthours1);
        productprice1.clear();
        productprice1.sendKeys(Productprice1);
        productclassTime1.clear();
        productclassTime1.sendKeys(ProductclassTime1);
        productsave1.click();

    }

    //封装方法
    //新增班课产品
    //driver.findElement(By.id("addProduct")).click();
    //ClassAll.sleep(5000);
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[2]")).click();
    //ClassAll.sleep(5000);
    //driver.findElement(By.xpath("//select[@id='organization']//option[contains(text(),'伯纳乌')]")).click();
    //driver.findElement(By.id("productVersion")).sendKeys("2019");
    //driver.findElement(By.id("productQuarter")).sendKeys("冬季");
    //driver.findElement(By.id("grade")).sendKeys("一年级");
    //driver.findElement(By.id("productName")).clear();
    //driver.findElement(By.id("productName")).sendKeys("自动化班课1");
    //driver.findElement(By.id("paymentEl")).sendKeys("4000");
    //driver.findElement(By.id("miniClassTotalhours")).sendKeys("10");
    //driver.findElement(By.id("classTimeLength")).sendKeys("40");
    //driver.findElement(By.id("everyCourseClassNum")).sendKeys("1");
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")).click();
    //driver.findElement(By.id("appointmentDateSubmit")).click();
    public void addClassProduct(String ClassProductYear,String ClassProductQuarter,String ClassProductGrade,String ClassProductName,String ClassProductPrice,String ClassProductHour,String ClassProductTime,String ClassProductOneHour){
        addproduct.click();
        ClassAll.sleep(5000);
        classProductPage.click();
        ClassAll.sleep(5000);
        classProductSchool.click();
        classProductYear.sendKeys(ClassProductYear);
        classProductQuarter.sendKeys(ClassProductQuarter);
        classProductGrade.sendKeys(ClassProductGrade);
        classProductName.clear();
        classProductName.sendKeys(ClassProductName);
        classProductChargeModa.click();
        classProductPrice.sendKeys(ClassProductPrice);
        classProductHour.sendKeys(ClassProductHour);
        classProductTime.sendKeys(ClassProductTime);
        classProductOneHour.sendKeys(ClassProductOneHour);
        classProductSubject.click();
        classProductSave.click();

    }

    //封装方法
    //新增一对N产品
    //driver.findElement(By.id("addProduct")).click();
    //ClassAll.sleep(5000);
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='按期'])[2]/following::li[1]")).click();
    //ClassAll.sleep(5000);
    //driver.findElement(By.xpath("//select[@id='organization']//option[contains(text(),'伯纳乌')]")).click();
    //driver.findElement(By.id("productVersion")).sendKeys("2019");
    //driver.findElement(By.id("grade")).sendKeys("一年级");
    //driver.findElement(By.id("productName")).clear();
    //driver.findElement(By.id("productName")).sendKeys("自动化1对N01");
    //driver.findElement(By.id("miniClassTotalhours")).clear();
    //driver.findElement(By.id("miniClassTotalhours")).sendKeys("10");
    //driver.findElement(By.id("priceEl")).sendKeys("200");
    //driver.findElement(By.id("classTimeLength")).sendKeys("40");
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")).click();
    //driver.findElement(By.id("appointmentDateSubmit")).click();
    public void addoneToNProduct(String OneToNProductYear,String OneToNProductGrade,String OneToNProductName,String OneToNProductHour,String OneToNProductPrice,String OneToNProductTime){
        addproduct.click();
        ClassAll.sleep(5000);
        oneToNProductPage.click();
        ClassAll.sleep(5000);
        oneToNProductSchool.click();
        oneToNProductYear.sendKeys(OneToNProductYear);
        oneToNProductGrade.sendKeys(OneToNProductGrade);
        oneToNProductName.clear();
        oneToNProductName.sendKeys(OneToNProductName);
        oneToNProductHour.clear();
        oneToNProductHour.sendKeys(OneToNProductHour);
        oneToNProductPrice.sendKeys(OneToNProductPrice);
        oneToNProductTime.sendKeys(OneToNProductTime);
        oneToNProductSubject.click();
        oneToNProductSave.click();

    }


    /*封装方法
    删除产品*/
    public  void deleteProduct(String ProductName){
        productName.sendKeys(ProductName);
        querySchool.click();
        ClassAll.sleep(5000);
        productdelete.click();
        productdeleteyes.click();
        ClassAll.sleep(5000);
        productresetbth.click();

    }

    /*封装方法
    查询产品*/
    public  void searchProduct(){
        productsearch.click();

    }

}
