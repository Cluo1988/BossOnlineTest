package com.platfrom.test001.FindBy;

import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/7/3 0003.
 */
public class OnetoNClass {
    //构造本页面
    public OnetoNClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //1对N学员进班
    //教务-1对N学员进班-查询栏-姓名输入框
    @FindBy(name = "name")
    public static WebElement oneToNClassName;

    //教务-1对N学员进班-查询栏-查询按钮
    @FindBy(id = "searchbtn")
    public static WebElement oneToNClassQuery;

    //教务-1对N学员进班-查询按钮
    @FindBy(linkText = "添加组员")
    public static WebElement oneToNClassAddStudent;

    //教务-1对N学员进班-添加组员页面-学生姓名输入框
    @FindBy(xpath = "//div[@id='leftContainer']//input[@placeholder='学员姓名']")
    public static WebElement oneToNClassAddStudentName;

    //教务-1对N学员进班-添加组员页面-查询按钮
    @FindBy(xpath = "//button[@id='searchBtn']")
    public static WebElement oneToNClassAddStudentQuery;

    //教务-1对N学员进班-添加组员页面-第一个学生勾选框
    @FindBy(xpath = "//span[@class='inline-block chooseFlag']")
    public static WebElement oneToNClassAddStudentSelect;


    //首课日期选择的是2019年6月1日
    //教务-1对N学员进班-添加组员页面-日期控件
    @FindBy(xpath = "//label[contains(text(),'首课日期')]")
    public static WebElement oneToNClassAddStudentData;
    //教务-1对N学员进班-添加组员页面-日期控件-月份选择
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")
    public static WebElement oneToNClassAddStudentDataMonth;
    //教务-1对N学员进班-添加组员页面-日期控件-年份选择
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")
    public static WebElement oneToNClassAddStudentDataYear;
    //教务-1对N学员进班-添加组员页面-日期控件-日选择
    @FindBy(xpath = "//div[@id='ui-datepicker-div']//tr[1]//td[6]")
    public static WebElement oneToNClassAddStudentDataDay;
    //教务-1对N学员进班-添加组员页面-保存按钮
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement oneToNClassAddStudentSave;



        /*//添加1对N学员进班
        //1对N小组页面，查询缩小小组数据范围
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("自动化");
        driver.findElement(By.id("searchbtn")).click();
        ClassAll.sleep(5000);
        driver.findElement(By.linkText("添加组员")).click();
        ClassAll.sleep(5000);
        //输入学生姓名缩小查询范围
        driver.findElement(By.xpath("//div[@id='leftContainer']//input[@placeholder='学员姓名']")).sendKeys("test601003");
        //点击查询
        driver.findElement(By.xpath("//button[@id='searchBtn']")).click();
        ClassAll.sleep(5000);
        //勾选查询出来的第一个学生
        driver.findElement(By.xpath("//span[@class='inline-block chooseFlag']")).click();
        //点击保存
        driver.findElement(By.xpath("//button[@class='btn btn-primary submit']")).click();*/
        public void addOneToNClassStudent(String OneToNClassName,String OneToNClassAddStudentName){
            oneToNClassName.clear();
            oneToNClassName.sendKeys(OneToNClassName);
            oneToNClassQuery.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudent.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudentName.sendKeys(OneToNClassAddStudentName);
            oneToNClassAddStudentQuery.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudentSelect.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudentData.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudentDataYear.click();
            oneToNClassAddStudentDataMonth.click();
            ClassAll.sleep(5000);
            oneToNClassAddStudentDataDay.click();
            oneToNClassAddStudentSave.click();

        }
}
