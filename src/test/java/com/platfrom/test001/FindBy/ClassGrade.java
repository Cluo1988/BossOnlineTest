package com.platfrom.test001.FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/26 0026.
 */
public class ClassGrade {
    //构造本页面
    public ClassGrade(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //班课管理搜索范围-输入校区
    @FindBy(xpath = "//select[@id='blCampusEl']//option[contains(text(),'伯纳乌')]")
    public static WebElement classSchool;
    //班课管理搜索范围-班课名称
    @FindBy(id = "search-mini-class-name")
    public static WebElement className;
    //教务-班课管理-查询按钮
    @FindBy(id = "searchbtn")
    public static WebElement classSearch;

    //教务-班课管理-新建班课
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='报名'])[1]/following::button[1]")
    public static WebElement newClass;

    //教务-班课管理-新建班课-手动开班
    @FindBy(linkText = "手动开班")
    public static WebElement newClassHand;

    //教务-班课管理-新建班课-手动开班-选择校区
    @FindBy(xpath = "//select[@id='campusEl']//option[contains(text(),'伯纳乌')]")
    public static WebElement newClassSchool;
    //教务-班课管理-新建班课-手动开班-选择校区-确认
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement newClassSchoolSave;

    //教务-班课管理-新建班课-选择课程按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='+ 新建课程'])[1]/following::div[2]")
    public static WebElement newClassbtn;

    //教务-班课管理-新建班课-选择课程-选择班课产品
    //搜索框输入
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='选择关联的班课产品'])[1]/following::input[1]")
    public static WebElement newClassProductSearch;
    //选择第一个产品
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='冬季'])[4]/following::a[1]")
    public static WebElement newClassProductSelect;

    //教务-班课管理-新建班课-班课基本信息
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
    //教务-班课管理-新建班课-保存
    @FindBy(id = "appointmentDateSubmit")
    public static WebElement newClassSave;


    //学员进班
    //教务-班课管理-点击第一行数据的更多
    @FindBy(xpath = "//tr[@id='1']//button[@id='showMoreOption']")
    public static WebElement newClassMore;
    //教务-班课管理-更多-成员
    @FindBy(linkText = "成员")
    public static WebElement newClassMoreStudent;

    //教务-班课管理-更多-成员-输入搜索学员名字
    @FindBy(id = "studentName")
    public static WebElement newClassMoreStudentName;

    //教务-班课管理-更多-成员-点击查询
    @FindBy(id = "searchBtn")
    public static WebElement newClassMoreStudentSearchBtn;

    //教务-班课管理-更多-成员-点击报班按钮
    @FindBy(xpath = "//tr[@id='1']//a[@class='link addStudent enableRes'][contains(text(),'报班')]")
    public static WebElement newClassMoreStudentInto;

    //教务-班课管理-更多-成员-点击报班-点击第一次上课时间
    @FindBy(id = "firstSchoolTime")
    public static WebElement newClassMoreStudentFirstTimeClick;
    //教务-班课管理-更多-成员-点击报班-第一次上课时间-年2019
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")
    public static WebElement newClassMoreStudentFirstTimeClickYear;
    //教务-班课管理-更多-成员-点击报班-第一次上课时间-月6
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")
    public static WebElement newClassMoreStudentFirstTimeClickMonth;
    //教务-班课管理-更多-成员-点击报班-第一次上课时间-日24
    @FindBy(xpath = "//div[@id='ui-datepicker-div']//tr[5]//td[1]")
    public static WebElement newClassMoreStudentFirstTimeClickDay;

    //教务-班课管理-更多-成员-点击报班-第一次上课时间-保存
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement newClassMoreStudentFirstTimeSave;




    //教务-班课管理-更多-成员-退班按钮
    @FindBy(linkText = "退班")
    public static WebElement newClassMoreStudentQuitClass;
    //教务-班课管理-更多-成员-退班-确认按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='取消'])[3]/following::button[1]")
    public static WebElement newClassMoreStudentQuitClassSave;
    //教务-班课管理-更多-成员页面-关闭页面
    @FindBy(xpath = "//div[@id='remoteModalminiClassStudentSignupModal']//button[@class='close'][contains(text(),'×')]")
    public static WebElement newClassMoreStudentClose;



    //教务-班课管理-班课考勤扣费
    //教务-班课管理-第一个考勤按钮
    @FindBy(xpath = "//tr[@id='1']//button[@class='btn btn-xs btn-default miniClassAttendance enableRes'][contains(text(),'考勤')]")
    public static WebElement classKaoqin;

    //教务-班课管理-考勤-点击未考勤页面元素，触发考勤弹框
    @FindBy(xpath = "//td[contains(text(),'未考勤')]")
    public static WebElement classKaoqintRigger;
    //教务-班课管理-考勤-点击未考勤页面元素，触发考勤弹框
    @FindBy(id = "miniClassAttendanceBtn")
    public static WebElement classClickKaoqin;

    //教务-班课管理-考勤考勤扣费页面-班课全选按钮
    @FindBy(xpath = "//input[@id='cb_jqgrid-attd']")
    public static WebElement classKaoqinPageAllSelect;
    //教务-班课管理-考勤考勤扣费页面-班主任扣费按钮
    @FindBy(id = "minicourse-submit-charge")
    public static WebElement classKaoqinPageConsumebtn;
    //教务-班课管理-考勤考勤扣费页面-班主任扣费-确认按钮
    @FindBy(id = "confirm-yes")
    public static WebElement classKaoqinPageSave;


    //删除班课
    //教务-班课管理-详情按钮
    @FindBy(xpath = "//tr[@id='1']//button[@class='btn btn-xs btn-default miniClassDetailModal enableRes'][contains(text(),'详情')]")
    public static WebElement classParticular;

    //教务-班课管理-详情-删除此班按钮
    @FindBy(xpath = "//button[contains(text(),'删除此班')]")
    public static WebElement classParticularQuitClass;
    //教务-班课管理-详情-删除此班-确认删除按钮
    @FindBy(id = "confirm-yes")
    public static WebElement classParticularQuitClassSave;



    //教务-班课考勤-取消班课考勤扣费
    //教务-班课考勤-查询-日期输入框
    @FindBy(id = "date_range")
    public static WebElement classData;
    //教务-班课考勤-查询-日期清空按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[1]/following::input[1]")
    public static WebElement classDataClear;
    //教务-班课考勤-查询-班课名称
    @FindBy(id = "miniClassName")
    public static WebElement className1;
    //教务-班课考勤-查询-查询按钮
    @FindBy(id = "searchBtn")
    public static WebElement classSearchBtn;

    //教务-班课考勤-课程扣费切页
    @FindBy(id = "classTeacherDeduction")
    public static WebElement classTeacherDeduction;

    //教务-班课考勤-已扣费勾选框
    @FindBy(id = "showChargedMcCourses")
    public static WebElement classShowChargedMcCourses;

    //教务-班课考勤-待扣费勾选框
    @FindBy(id = "showUnchargedMcCourses")
    public static WebElement classShowUnchargedMcCourses;

    //教务-班课考勤-取消扣费按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='无'])[1]/following::button[1]")
    public static WebElement classCancel;

    //教务-班课考勤-取消扣费切页-全选按钮
    @FindBy(xpath = "//input[@id='cb_jqgrid-attd']")
    public static WebElement classCancelAllSelect;
    //教务-班课考勤-取消扣费切页-取消扣费按钮
    @FindBy(id = "minicourse-submit-roll")
    public static WebElement classCancelBtn;
    //教务-班课考勤-取消扣费切页-取消扣费确认按钮
    @FindBy(id = "confirm-yes")
    public static WebElement classCancelSaveBtn;
    //教务-班课考勤-取消扣费切页-关闭取消扣费切页按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[1]/following::button[1]")
    public static WebElement classCancelCloseBtn;


    //新建班课
    public void addClass(String NewClassProductSearch,String NewClassPeople) {
        newClass.click();
        newClassHand.click();
        ClassAll.sleep(10000);
        newClassSchool.click();
        newClassSchoolSave.click();
        ClassAll.sleep(10000);
        newClassbtn.click();
        ClassAll.sleep(10000);
        newClassProductSearch.sendKeys(NewClassProductSearch);
        newClassProductSearch.sendKeys(Keys.ENTER);
        ClassAll.sleep(10000);
        newClassProductSelect.click();
        ClassAll.sleep(10000);
        newClassSchedule.click();
        newClassData.click();
        newClassYear.click();
        newClassMonth.click();
        newClassDay.click();
        newClassPeople.sendKeys(NewClassPeople);
        newClassDirector.click();
        newClassSubject.click();
        ClassAll.sleep(10000);
        newClassTeacherbtn.click();
        ClassAll.sleep(10000);
        newClassTeacher.click();
        ClassAll.sleep(10000);
        newClassOpenDatabtn.click();
        newClassOpenDataBegin.click();
        newClassOpenDataEnd.click();
        ClassAll.sleep(10000);
        newClassOpenTimebtn.click();
        ClassAll.sleep(10000);
        newClassOpenTimeHour.click();
        newClassOpenTimeMinute.click();
        ClassAll.sleep(10000);
        newClassSave.click();


    }



    //学员进班
    public void addClassStudent(String NewClassMoreStudentName ) {
        newClassMore.click();
        newClassMoreStudent.click();
        ClassAll.sleep(10000);
        newClassMoreStudentName.sendKeys(NewClassMoreStudentName);
        ClassAll.sleep(10000);
        newClassMoreStudentSearchBtn.click();
        ClassAll.sleep(10000);
        newClassMoreStudentInto.click();
        ClassAll.sleep(10000);
        newClassMoreStudentFirstTimeClick.click();
        newClassMoreStudentFirstTimeClickYear.click();
        newClassMoreStudentFirstTimeClickMonth.click();
        newClassMoreStudentFirstTimeClickDay.click();
        ClassAll.sleep(10000);
        newClassMoreStudentFirstTimeSave.click();
        ClassAll.sleep(10000);
        newClassMoreStudentClose.click();


    }



    //班课管理页面的班课考勤扣费
    public void classConsume(String ClassName){
        classSchool.click();
        className.clear();
        className.sendKeys(ClassName);
        ClassAll.sleep(10000);
        classSearch.click();
        ClassAll.sleep(10000);
        classKaoqin.click();
        ClassAll.sleep(10000);
        classKaoqintRigger.click();
        classClickKaoqin.click();
        ClassAll.sleep(10000);
        classKaoqinPageAllSelect.click();
        classKaoqinPageConsumebtn.click();
        ClassAll.sleep(10000);
        classKaoqinPageSave.click();

    }


    //取消班课考勤扣费
    public void cancelClass(String ClassName1){
        classData.click();
        classDataClear.click();
        className1.sendKeys(ClassName1);
        classSearchBtn.click();
        ClassAll.sleep(10000);
        classTeacherDeduction.click();
        ClassAll.sleep(10000);
        classShowChargedMcCourses.click();
        ClassAll.sleep(10000);
        classShowUnchargedMcCourses.click();
        ClassAll.sleep(10000);
        classCancel.click();
        ClassAll.sleep(10000);
        classCancelAllSelect.click();
        classCancelBtn.click();
        ClassAll.sleep(10000);
        classCancelSaveBtn.click();
        ClassAll.sleep(10000);
        classCancelCloseBtn.click();

    }


    //班课管理页面学员退班
    public void studentQuitClass(String ClassName){
        className.sendKeys(ClassName);
        classSearch.click();
        ClassAll.sleep(10000);
        newClassMore.click();
        ClassAll.sleep(10000);
        newClassMoreStudent.click();
        ClassAll.sleep(10000);
        newClassMoreStudentQuitClass.click();
        ClassAll.sleep(10000);
        newClassMoreStudentQuitClassSave.click();
        ClassAll.sleep(10000);
        newClassMoreStudentClose.click();

    }


    //删除班课
    public void deleteClass(){
        ClassAll.sleep(10000);
        classParticularQuitClass.click();
        ClassAll.sleep(10000);
        classParticularQuitClassSave.click();
    }

}
