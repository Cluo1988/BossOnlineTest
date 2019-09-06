package com.platfrom.test001.FindBy;

import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.By;
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


    //教务-1对N小组-查询栏-班级名称输入框
    @FindBy(name = "name")
    public static WebElement oneToNClassName;

    //教务-1对N小组-查询栏-查询按钮
    @FindBy(id = "searchbtn")
    public static WebElement oneToNClassQuery;

    //教务-1对N小组-清空按钮
    @FindBy(xpath = "//button[@id='resetBut']")
    public static WebElement oneToNClassClear;


    //教务-1对N小组-添加组员按钮
    @FindBy(linkText = "添加组员")
    public static WebElement oneToNClassAddStudent;

    //教务-1对N小组-组员管理按钮
    @FindBy(linkText = "组员管理")
    public static WebElement oneToNClassCancelStudent;

    //教务-1对N小组-组员管理-移除
    @FindBy(linkText = "移除")
    public static WebElement oneToNClassCancelStudentRemove;
    //教务-1对N小组-组员管理-移除-确认
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement oneToNClassCancelStudentRemoveSave;


    //1对N学员进班
    //教务-1对N小组-添加组员页面-学生姓名输入框
    @FindBy(xpath = "//div[@id='leftContainer']//input[@placeholder='学员姓名']")
    public static WebElement oneToNClassAddStudentName;

    //教务-1对N小组-添加组员页面-查询按钮
    @FindBy(xpath = "//button[@id='searchBtn']")
    public static WebElement oneToNClassAddStudentQuery;

    //教务-1对N小组-添加组员页面-第一个学生勾选框
    @FindBy(xpath = "//span[@class='inline-block chooseFlag']")
    public static WebElement oneToNClassAddStudentSelect;


    //首课日期选择的是2019年6月1日
    //教务-1对N小组-添加组员页面-日期控件
    @FindBy(xpath = "//label[contains(text(),'首课日期')]")
    public static WebElement oneToNClassAddStudentData;
    //教务-1对N小组-添加组员页面-日期控件-月份选择
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-month')]//option[contains(text(),'六')]")
    public static WebElement oneToNClassAddStudentDataMonth;
    //教务-1对N小组-添加组员页面-日期控件-年份选择
    @FindBy(xpath = "//select[contains(@class,'ui-datepicker-year')]//option[contains(text(),'2019')]")
    public static WebElement oneToNClassAddStudentDataYear;
    //教务-1对N小组-添加组员页面-日期控件-日选择
    @FindBy(xpath = "//div[@id='ui-datepicker-div']//tr[1]//td[6]")
    public static WebElement oneToNClassAddStudentDataDay;
    //教务-1对N小组-添加组员页面-保存按钮
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement oneToNClassAddStudentSave;

    //教务-1对N小组-排课按钮
    @FindBy(xpath = "//a[@class='margin-right-5 courseAct enableRes']")
    public static WebElement oneToNClassAddCourse;

    //教务-1对N小组-排课页面-时间
    @FindBy(id = "courseTimeEl")
    public static WebElement oneToNClassAddCourseTime;
    //教务-1对N小组-排课页面-时间-时
    @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-hours']//div[@class='clockpicker-tick'][contains(text(),'11')]")
    public static WebElement oneToNClassAddCourseTimeHour;
    //教务-1对N小组-排课页面-时间-分
    @FindBy(xpath = "//div[@class='clockpicker-dial clockpicker-minutes']//div[@class='clockpicker-tick'][contains(text(),'10')]")
    public static WebElement oneToNClassAddCourseTimeMinute;

    //教务-1对N小组-排课页面-课时数
    @FindBy(xpath = "//input[@id='planHoursEl']")
    public static WebElement oneToNClassAddCourseCourse;

    //教务-1对N小组-排课页面-时长
    @FindBy(xpath = "//input[@id='timeLongEl']")
    public static WebElement oneToNClassAddCourseTime1;

    //教务-1对N小组-排课页面-选日期
    @FindBy(xpath = "//div[@id='remoteModalgroupArrange']//tr[2]//div[contains(@class,'fc-day-number pull-left')][starts-with(text(),'1')]")
    public static WebElement oneToNClassAddCourseData;

    //教务-1对N小组-排课页面-保存
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary submit')]")
    public static WebElement oneToNClassAddCourseSave;

    //教务-1对N小组-考勤按钮
    @FindBy(xpath = "//a[@class='margin-right-5 attendanceAct enableRes']")
    public static WebElement oneToNClassConsumeBtn;

    //教务-1对N小组-考勤下拉框-未考勤元素（目的是触发考勤弹框）
    @FindBy(xpath = "//td[@class='bootstrap-popover']")
    public static WebElement oneToNClassNoConsume;
    //教务-1对N小组-考勤下拉框-考勤弹框
    @FindBy(xpath = "//button[@id='miniClassAttendanceBtn']")
    public static WebElement oneToNClassConsumeBtn1;

    //教务-1对N小组-考勤下拉框-考勤页面-第一个待考勤数据
    @FindBy(xpath = "//div[@id='remoteModaloneOnNCourseAttendance']//td[1]//input[1]")
    public static WebElement oneToNClassConsumeSelect;

    //教务-1对N小组-考勤下拉框-考勤页面-考勤按钮
    @FindBy(xpath = "//button[@id='oneOnNAttendanceModalSubmitBtn']")
    public static WebElement oneToNClassConsumeBtn2;

    //教务-1对N小组-考勤下拉框-考勤页面-取消考勤按钮
    @FindBy(xpath = "//button[@id='oneOnNAttendanceModalCancelBtn']")
    public static WebElement oneToNClassConsumeCancelBtn;

    //教务-1对N小组-考勤下拉框-考勤页面-关闭
    @FindBy(xpath = "//button[@class='close']")
    public static WebElement oneToNClassConsumeClose;

    //教务-1对N课程-日期框
    @FindBy(id = "date_range")
    public static WebElement oneToNClassData;
    //教务-1对N课程-日期框-清除按钮
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='请选择一个日期范围'])[1]/following::input[1]")
    public static WebElement oneToNClassDataClear;

    //教务-1对N课程-班级名称
    @FindBy(id = "groupName")
    public static WebElement oneToNClassGroupName;

    //教务-1对N课程-查询按钮
    @FindBy(id = "searchBtn")
    public static WebElement oneToNClassQuery1;

    //教务-1对N课程-删除按钮
    @FindBy(linkText = "删除")
    public static WebElement oneToNClassDelete;

    //教务-1对N课程-删除-确认按钮
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement oneToNClassDeleteSave;




    //添加1对N学员进班
    public void addOneToNClassStudent(String OneToNClassName, String OneToNClassAddStudentName) {
        oneToNClassName.clear();
        oneToNClassName.sendKeys(OneToNClassName);
        oneToNClassQuery.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudent.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudentName.sendKeys(OneToNClassAddStudentName);
        oneToNClassAddStudentQuery.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudentSelect.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudentData.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudentDataYear.click();
        oneToNClassAddStudentDataMonth.click();
        ClassAll.sleep(10000);
        oneToNClassAddStudentDataDay.click();
        oneToNClassAddStudentSave.click();

    }


    //1对N排课
    public void addOneToNClass(String OneToNClassName, String OneToNClassAddCourseCourse, String OneToNClassAddCourseTime1) {
        oneToNClassClear.click();
        ClassAll.sleep(10000);
        oneToNClassName.sendKeys(OneToNClassName);
        oneToNClassQuery.click();
        ClassAll.sleep(10000);
        oneToNClassAddCourse.click();
        ClassAll.sleep(10000);
        oneToNClassAddCourseTime.click();
        oneToNClassAddCourseTimeHour.click();
        oneToNClassAddCourseTimeMinute.click();
        ClassAll.sleep(10000);
        oneToNClassAddCourseCourse.sendKeys(OneToNClassAddCourseCourse);
        oneToNClassAddCourseTime1.sendKeys(OneToNClassAddCourseTime1);
        ClassAll.sleep(10000);
        oneToNClassAddCourseData.click();
        oneToNClassAddCourseSave.click();

    }


    //1对N考勤
    public void oneToNClassConsume() {
        oneToNClassConsumeBtn.click();
        ClassAll.sleep(10000);
        oneToNClassNoConsume.click();
        oneToNClassConsumeBtn1.click();
        ClassAll.sleep(10000);
        oneToNClassConsumeSelect.click();
        oneToNClassConsumeBtn2.click();
        ClassAll.sleep(10000);
        oneToNClassConsumeClose.click();

    }

    //取消考勤（和考勤页面元素一样）
    public void oneToNClassCancelConsume() {
        oneToNClassNoConsume.click();
        oneToNClassConsumeBtn1.click();
        ClassAll.sleep(10000);
        oneToNClassConsumeSelect.click();
        oneToNClassConsumeCancelBtn.click();
        ClassAll.sleep(10000);
        oneToNClassConsumeClose.click();

    }
    //选择班级，然后在班课管理里面移除学员
    public void oneToNClassCancelStudent(){
        oneToNClassCancelStudent.click();
        ClassAll.sleep(10000);
        oneToNClassCancelStudentRemove.click();
        ClassAll.sleep(10000);
        oneToNClassCancelStudentRemoveSave.click();
    }

    //删除1对N排课
    public void oneToNClassCancelClass(String OneToNClassGroupName){
        oneToNClassData.click();
        ClassAll.sleep(10000);
        oneToNClassDataClear.click();
        oneToNClassGroupName.sendKeys(OneToNClassGroupName);
        oneToNClassQuery1.click();
        ClassAll.sleep(10000);
        oneToNClassDelete.click();
        ClassAll.sleep(10000);
        oneToNClassDeleteSave.click();
    }

}
