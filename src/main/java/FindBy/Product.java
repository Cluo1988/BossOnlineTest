package FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.By;
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

    //设置-课程设置-新增课程产品
    @FindBy(id ="addProduct")
    public static WebElement addproduct;

    //设置-课程设置-新增课程产品-选择产品类型（1对1）
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='新增课程'])[1]/following::li[1]")
    public static WebElement producttype;

    //设置-课程设置-新增课程产品-课程年份
    @FindBy(id ="productVersion")
    public static WebElement productyear;

    //设置-课程设置-新增课程产品-适用年级
    @FindBy(id ="grade")
    public static WebElement productgrade;

    //设置-课程设置-新增课程产品-课程名称
    @FindBy(id ="productName")
    public static WebElement productname;

    //设置-课程设置-新增课程产品-课时数
    @FindBy(id ="miniClassTotalhours")
    public static WebElement producthours;

    //设置-课程设置-新增课程产品-课程单价
    @FindBy(id ="priceEl")
    public static WebElement productprice;

    //设置-课程设置-新增课程产品-课时时长
    @FindBy(id ="classTimeLength")
    public static WebElement productclassTime;

    //设置-课程设置-新增课程产品-适用科目
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='适用科目'])[1]/following::input[1]")
    public WebElement productclass;

    //设置-课程设置-新增课程产品-保存
    @FindBy(id ="appointmentDateSubmit")
    public static WebElement productsave;

    //设置-课程设置-修改按钮
    @FindBy(xpath = "/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[24]/a[1]")
    public static WebElement productmodification;

    //产品修改页面
    //设置-课程设置-修改页面-课程名称
    @FindBy(xpath = "//input[@id='productName']")
    public static WebElement productname1;

    //设置-课程设置-修改页面-课程名称
    @FindBy(id = "miniClassTotalhours")
    public static WebElement producthours1;

    //设置-课程设置-修改页面-课程单价
    @FindBy(id = "priceEl")
    public static WebElement productprice1;

    //设置-课程设置-修改页面-课时时长
    @FindBy(id = "classTimeLength")
    public static WebElement productclassTime1;

    //设置-课程设置-修改页面-课时时长
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement productsave1;

    //设置-课程设置-删除按钮
    @FindBy(xpath = "/html[1]/body[1]/div[6]/section[1]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[24]/a[2]")
    public static WebElement productdelete;

    //设置-课程设置-删除-确认
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement productdeleteyes;

    //设置-课程设置-查询
    @FindBy(xpath = "//button[@id='searchbtn']")
    public static WebElement productsearch;





    /*封装方法
    新增产品
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
    public void addProduct(String Productyear, String Productgrade, String Productname, String Producthours, String Productprice, String ProductclassTime) {
        addproduct.click();
        ClassAll.sleep(5000);
        producttype.click();
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
    修改产品
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
    public void modificationProduct(String Productname1,String Producthours1,String Productprice1,String ProductclassTime1){
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

    /*封装方法
    删除产品*/
    public  void deleteProduct(){
        productdelete.click();
        productdeleteyes.click();

    }

    /*封装方法
    查询产品*/
    public  void searchProduct(){
        productsearch.click();

    }

}
