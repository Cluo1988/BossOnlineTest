package com.platfrom.test001.FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public class Class {
    //构造本页面
    public Class(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //前台-教务-班课管理-新建班课
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='报名'])[1]/following::button[1]")
    public static WebElement newClass;

    //前台-教务-班课管理-新建班课-手动开班
    @FindBy(linkText = "手动开班")
    public static WebElement newClassHand;

    //前台-教务-班课管理-新建班课-手动开班-选择校区
    @FindBy(xpath = "//select[@id='campusEl']//option[contains(text(),'伯纳乌')]")
    public static WebElement newClassSchool;
    //前台-教务-班课管理-新建班课-手动开班-选择校区-确认
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement newClassSchoolSave;

    //前台-教务-班课管理-新建班课-选择课程按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='+ 新建课程'])[1]/following::div[2]")
    public static WebElement newClassbtn;

    //前台-教务-班课管理-新建班课-选择课程-选择班课产品
    //搜索框输入
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='选择关联的班课产品'])[1]/following::input[1]")
    public static WebElement newClassProductSearch;
    //选择第一个产品
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='冬季'])[4]/following::a[1]")
    public static WebElement newClassProductSelect;

    //前台-教务-班课管理-新建班课-班课基本信息
    //选择班课档期（2019年）
    @FindBy(xpath = "//select[@id='miniClassSchedule']//option[contains(text(),'2019年暑假')]")
    public static WebElement newClassSchedule;

    //选择开课时间
    //点开日期控件
    @FindBy(id = "startDateFrom")
    public static WebElement newClassData;
    //选择年份（2019年）
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")
    public static WebElement newClassYear;
    //选择月份（6月）
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")
    public static WebElement newClassMonth;
    //选择天（24日）
    @FindBy(xpath = "//div[@id='ui-datepicker-div']//tr[5]//td[1]")
    public static WebElement newClassDay;
    //预招生人数（50）
    @FindBy(id = "peopleQuantity")
    public static WebElement newClassPeople;
    //选择班主任（二狗子）
    @FindBy(xpath = "//select[@id='studyManegerId']//option[contains(text(),'二狗子')]")
    public static WebElement newClassDirector;
    //选择班课科目
    @FindBy(xpath = "//div[@class='col-md-8']//option[contains(text(),'物理')]")
    public static WebElement newClassSubject;
    //选择授课老师
    //点击选择按钮
    @FindBy(id = "showTeacherModalBtn")
    public static WebElement newClassTeacherbtn;
    //点击选择老师
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='（周日）'])[1]/following::td[18]")
    public static WebElement newClassTeacher;
    //选择上课日期（24号）
    //点击上课日期选择框
    @FindBy(id = "courseDate_range")
    public static WebElement newClassOpenDatabtn;
    //点击上课日期-开始日期
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='日'])[5]/following::div[29]")
    public static WebElement newClassOpenDataBegin;
    //点击上课日期-结束日期
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='日'])[5]/following::div[29]")
    public static WebElement newClassOpenDataEnd;
    //上课时间（9点05）
    //点击上课时间选择框
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='操作'])[2]/following::input[1]")
    public static WebElement newClassOpenTimebtn;
    //点击上课时间选择框-小时
    @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[9]")
    public static WebElement newClassOpenTimeHour;
    //点击上课时间选择框-分钟
    @FindBy(xpath = "//div[@class='clockpicker-tick'][contains(text(),'05')]")
    public static WebElement newClassOpenTimeMinute;
    //前台-教务-班课管理-新建班课-保存
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement newClassSave;


    //学员进班
    //前台-教务-班课管理-点击第一行数据的更多
    @FindBy(xpath = "//tr[@id='1']//button[@id='showMoreOption']")
    public static WebElement newClassMore;
    //前台-教务-班课管理-更多-成员
    @FindBy(linkText = "成员")
    public static WebElement newClassMoreStudent;

    //前台-教务-班课管理-更多-成员-输入搜索学员名字
    @FindBy(id = "studentName")
    public static WebElement newClassMoreStudentName;

    //前台-教务-班课管理-更多-成员-点击查询
    @FindBy(id = "searchBtn")
    public static WebElement newClassMoreStudentSearchBtn;

    //前台-教务-班课管理-更多-成员-点击报班按钮
    @FindBy(xpath = "//tr[@id='1']//a[@class='link addStudent enableRes'][contains(text(),'报班')]")
    public static WebElement newClassMoreStudentInto;

    //前台-教务-班课管理-更多-成员-点击报班-点击第一次上课时间
    @FindBy(id = "firstSchoolTime")
    public static WebElement newClassMoreStudentFirstTimeClick;
    //前台-教务-班课管理-更多-成员-点击报班-第一次上课时间-年2019
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")
    public static WebElement newClassMoreStudentFirstTimeClickYear;
    //前台-教务-班课管理-更多-成员-点击报班-第一次上课时间-月6
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")
    public static WebElement newClassMoreStudentFirstTimeClickMonth;
    //前台-教务-班课管理-更多-成员-点击报班-第一次上课时间-日24
    @FindBy(xpath = "//div[@id='ui-datepicker-div']//tr[5]//td[1]")
    public static WebElement newClassMoreStudentFirstTimeClickDay;

    //前台-教务-班课管理-更多-成员-点击报班-第一次上课时间-保存
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement newClassMoreStudentFirstTimeSave;



/*//学员进班

        driver.findElement(By.xpath("//button[@class='btn btn-primary submit']")).click();*/



    /*//新建班课
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='报名'])[1]/following::button[1]")).click();
            driver.findElement(By.linkText("手动开班")).click();
            ClassAll.sleep(5000);
            driver.findElement(By.xpath("//select[@id='campusEl']//option[contains(text(),'伯纳乌')]")).click();
        //校区确定按钮
            driver.findElement(By.xpath("//button[@class='btn btn-primary submit']")).click();
            ClassAll.sleep(5000);
        //新建课程按钮
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='+ 新建课程'])[1]/following::div[2]")).click();
            ClassAll.sleep(5000);
        //选择班课产品（筛选自动化名字的班课然后选择第一个）
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='选择关联的班课产品'])[1]/following::input[1]")).sendKeys("自动化");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='选择关联的班课产品'])[1]/following::input[1]")).sendKeys(Keys.ENTER);
            ClassAll.sleep(5000);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='冬季'])[4]/following::a[1]")).click();
            ClassAll.sleep(5000);
        //选择班课档期（2019年）
            driver.findElement(By.xpath("//select[@id='miniClassSchedule']//option[contains(text(),'2019年暑假')]")).click();
        //选择开课时间
        //点开日期控件
            driver.findElement(By.id("startDateFrom")).click();
        //选择年份（2019年）
            driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")).click();
        //选择月份（6月）
            driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")).click();
        //选择天（24日）
            driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tr[5]//td[1]")).click();
        //预招生人数（50）
            driver.findElement(By.id("peopleQuantity")).sendKeys("50");
        //选择班主任（二狗子）
            driver.findElement(By.xpath("//select[@id='studyManegerId']//option[contains(text(),'二狗子')]")).click();
        //选择班课科目
            driver.findElement(By.xpath("//div[@class='col-md-8']//option[contains(text(),'物理')]")).click();
        //选择授课老师
            driver.findElement(By.id("showTeacherModalBtn")).click();
            ClassAll.sleep(5000);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='（周日）'])[1]/following::td[18]")).click();
            ClassAll.sleep(5000);
        //上课日期（24号）
            driver.findElement(By.id("courseDate_range")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='日'])[5]/following::div[29]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='日'])[5]/following::div[29]")).click();
        //上课时间
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='操作'])[2]/following::input[1]")).click();
            ClassAll.sleep(5000);
            driver.findElement(By.xpath("//div[@class='clockpicker-dial clockpicker-hours']//div[9]")).click();
            driver.findElement(By.xpath("//div[@class='clockpicker-tick'][contains(text(),'05')]")).click();
            ClassAll.sleep(5000);
            driver.findElement(By.id("appointmentDateSubmit")).click();*/
    public void addClass(String NewClassProductSearch,String NewClassPeople) {
        newClass.click();
        newClassHand.click();
        ClassAll.sleep(5000);
        newClassSchool.click();
        newClassSchoolSave.click();
        ClassAll.sleep(5000);
        newClassbtn.click();
        ClassAll.sleep(5000);
        newClassProductSearch.sendKeys(NewClassProductSearch);
        newClassProductSearch.sendKeys(Keys.ENTER);
        ClassAll.sleep(5000);
        newClassProductSelect.click();
        ClassAll.sleep(5000);
        newClassSchedule.click();
        newClassData.click();
        newClassYear.click();
        newClassMonth.click();
        newClassDay.click();
        newClassPeople.sendKeys(NewClassPeople);
        newClassDirector.click();
        newClassSubject.click();
        newClassTeacherbtn.click();
        ClassAll.sleep(5000);
        newClassTeacher.click();
        ClassAll.sleep(5000);
        newClassOpenDatabtn.click();
        newClassOpenDataBegin.click();
        newClassOpenDataEnd.click();
        newClassOpenTimebtn.click();
        ClassAll.sleep(5000);
        newClassOpenTimeHour.click();
        newClassOpenTimeMinute.click();
        ClassAll.sleep(5000);
        newClassSave.click();


    }



    /*//学员进班
        driver.findElement(By.id("showMoreOption")).click();
        driver.findElement(By.linkText("成员")).click();
        ClassAll.sleep(5000);
        driver.findElement(By.id("studentName")).sendKeys("test619001");
        ClassAll.sleep(5000);
        driver.findElement(By.id("searchBtn")).click();
        ClassAll.sleep(5000);
        driver.findElement(By.linkText("报班")).click();
        ClassAll.sleep(5000);
        driver.findElement(By.id("firstSchoolTime")).click();
        driver.findElement(By.linkText("24")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='取消'])[3]/following::button[1]")).click();*/
    public void addClassStudent(String NewClassMoreStudentName ) {
        newClassMore.click();
        newClassMoreStudent.click();
        ClassAll.sleep(5000);
        newClassMoreStudentName.sendKeys(NewClassMoreStudentName);
        ClassAll.sleep(5000);
        newClassMoreStudentSearchBtn.click();
        ClassAll.sleep(5000);
        newClassMoreStudentInto.click();
        ClassAll.sleep(5000);
        newClassMoreStudentFirstTimeClick.click();
        newClassMoreStudentFirstTimeClickYear.click();
        newClassMoreStudentFirstTimeClickMonth.click();
        newClassMoreStudentFirstTimeClickDay.click();
        ClassAll.sleep(5000);
        newClassMoreStudentFirstTimeSave.click();

    }
}
