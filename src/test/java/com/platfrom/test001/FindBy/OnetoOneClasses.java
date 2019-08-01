package com.platfrom.test001.FindBy;

import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/19 0019.
 */
public class OnetoOneClasses {
    //构造本页面
    public OnetoOneClasses(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //新增一对一排课
    //教务-一对一排课-校区选择框
    @FindBy(xpath = "//select[@id='campusEl']")
    public static WebElement oneClassescampus;

    //教务-一对一排课-校区选择框-确认按钮
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement oneClassessave;

    //教务-一对一排课-学员姓名框塞值
    @FindBy(id = "findStudentAutoComplate")
    public static WebElement oneClassesstuName;

    //教务-一对一排课-学员姓名框选择学生
    @FindBy(xpath = "/html[1]/body[1]/ul[1]/li[1]")
    public static WebElement oneClassesSlectstuName;

    //教务-一对一排课-学员选择学管师
    @FindBy(xpath = "//option[contains(text(),'二狗子')]")
    public static WebElement oneClassesTeather;

    //教务-一对一排课-学员选择学管师-确认按钮
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement oneClassesTeatherSave;

    //教务-一对一排课-选择科目
    @FindBy(xpath = "//select[@name='subject']")
    public static WebElement oneClassesSubject;

    //教务-一对一排课-点击激活日期控件
    //日期选择框,日期选择框是两个矩阵，本月定位永远是month1，下月定位永远是month2，再通过tr（X轴），td（Y轴）来定位具体日，目前选择的是本月1日
    @FindBy(xpath = "//span[@class='form-control date_range_input date_range curcor-pointer']")
    public static WebElement oneClassesDate;

    //教务-一对一排课-选择日期为今天
    @FindBy(xpath = "//div[contains(@class,'date-picker-wrapper no-shortcuts no-gap two-months')]//label[1]")
    public static WebElement oneClassesDateBegin;

    //教务-一对一排课-选择上课星期，选择第一个数据
    //点击激活星期控件
    @FindBy(xpath = "//b[contains(@class,'caret')]")
    public static WebElement oneClassesWeek;
    //选择具体星期几
    @FindBy(xpath = "//li[4]//a[1]//label[1]//input[1]")
    public static WebElement oneClassesWeekNumber;

    //教务-一对一排课-点击选择老师按钮，弹出选择老师页面
    @FindBy(linkText = "选择老师")
    public static WebElement oneClassesTeacher;
    //选择老师页面-选择第二个老师
    @FindBy(xpath = "//table[@id='dayChooseTable']//tbody//tr[2]")
    public static WebElement oneClassesTwoTeacher;
    //选择老师页面-点击激活上课时间控件
    @FindBy(id = "chooseCourseTime")
    public static WebElement oneClassesTime;
    //选择老师页面-选择上课时间控件 时（6点）
    @FindBy(xpath = "//div[contains(@class,'clockpicker-tick')][contains(text(),'6')]")
    public static WebElement oneClassesHourTime;
    //选择老师页面-选择上课时间控件 分钟（05分）
    @FindBy(xpath = "//div[contains(text(),'05')]")
    public static WebElement oneClassesMinuteTime;

    //选择老师页面-课时数
    @FindBy(xpath = "//input[@id='choosePlanHours']")
    public static WebElement oneClassesPlanHours;

    //选择老师页面-课时时长
    @FindBy(xpath = "//input[@id='chooseTimeLong']")
    public static WebElement oneClassesTimeLong;

    //选择老师页面-保存按钮
    @FindBy(id = "chooseSave")
    public static WebElement chooseSave;

    //教务-一对一排课-保存排课
    @FindBy(linkText = "保存")
    public static WebElement oneClassesSave;

    //一对一排课页面-删除一对一排课
    //教务-一对一排课-删除一对一排课
    @FindBy(xpath = "//a[contains(@class,'del')]")
    public static WebElement oneClassesClear;

   //教务-一对一排课-删除一对一排课-确认
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement oneClassesClearSave;

    //一对一考勤
    //一对一考勤-日期控件
    //点击日期控件选择上面新增排课的同一天
    @FindBy(id = "date_range")
    public static WebElement oneClassesUseData;
    //清空时间控件
    @FindBy(xpath = "//input[contains(@class,'clear-btn')]")
    public static WebElement oneClassesUseDataBegin;


    //搜索的学生名字
    @FindBy(xpath = "//input[@id='studentName']")
    public static WebElement oneClassesStudent;

    //一对一考勤-查询按钮
    @FindBy(id = "searchbtn")
    public static WebElement oneClassesUseQuery;

    //一对一考勤-勾选第一条数据
    @FindBy(id = "jqg_jqgrid_1")
    public static WebElement oneClassesUseFirst;

    //一对一考勤-点击第一条数据考勤
    @FindBy(xpath = "//tr[@id='1']//button[contains(@class,'btn attendBtn')][contains(text(),'考勤')]")
    public static WebElement oneClassesUseFirstkaoqin;

    //一对一考勤-点击课程考勤切页
    @FindBy(id = "studyManegerVerifyHref")
    public static WebElement oneClassesUseSecondkaoqinPage;

    //一对一考勤-第二切页-考勤按钮
    @FindBy(xpath = "//tr[@id='1']//button[contains(@class,'btn attendBtn')][contains(text(),'考勤')]")
    public static WebElement oneClassesUseSecondkaoqin;

    //一对一考勤-点击第三切页
    @FindBy(id = "classTeacherDeductionHref")
    public static WebElement oneClassesUseThirdPage;

    //一对一考勤-第三切页-扣费按钮
    @FindBy(xpath = "//tr[@id='1']//button[contains(@class,'btn chargeRecordBtn')][contains(text(),'扣费')]")
    public static WebElement oneClassesUseThirdPagekoufei;

    //一对一考勤-第三切页-扣费-确认按钮
    @FindBy(id = "confirm-yes")
    public static WebElement oneClassesUseThirdPagekoufeiSave;

    //取消扣费操作
    //一对一考勤-点击取消（查看未扣费课程勾选框）
    @FindBy(xpath = "//input[@id='showUnchargedCourses']")
    public static WebElement oneClassesUseNotkoufei;

    //一对一考勤-点击勾选（查看已扣费课程勾选框）
    @FindBy(xpath = "//input[@id='showChargedCourses']")
    public static WebElement oneClassesUseFiniskoufei;

    //一对一考勤-第三切页-点击第一条数据的重置按钮
    @FindBy(xpath = "//button[@class='btn rollbackChargeRecord']")
    public static WebElement oneClassesUseReset;

    //一对一考勤-第三切页-重置-确认按钮
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement oneClassesUseResetSave;

    //考勤页面的删除排课
    //一对一考勤-第三切页-点击第一条数据修改按钮
    @FindBy(xpath = "//tr[@id='1']//button[@class='btn changeBtn enableRes'][contains(text(),'修改')]")
    public static WebElement oneClassesUseThirdChange;

    //一对一考勤-第三切页-第一条数据修改-删除按钮
    @FindBy(xpath = "//button[@id='deleteBtn']")
    public static WebElement oneClassesUseThirdChangeDelete;

    //一对一考勤-第三切页-第一条数据修改-删除-确认按钮
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement oneClassesUseThirdChangeDeleteSave;

    /**
     * 封装方法
     * 一对一考勤
     * //点击日期控件选择上面新增排课的同一天
     *         //driver.findElement(By.id("date_range")).click();
     *         //driver.findElement(By.xpath("//table[contains(@class,'month1')]//tr[5]//td[1]")).click();
     *         //driver.findElement(By.xpath("//table[contains(@class,'month1')]//tr[5]//td[1]")).click();
     *         //点击查询按钮
     *         //driver.findElement(By.id("searchbtn")).click();
     *        // ClassAll.sleep(10000);
     *         //勾选第一条数据
     *        // driver.findElement(By.id("jqg_jqgrid_1")).click();
     *         //点击考勤按钮
     *        // driver.findElement(By.xpath("//tr[@id='1']//button[contains(@class,'btn attendBtn')][contains(text(),'考勤')]")).click();
     *        // ClassAll.sleep(10000);
     *         //点击课程考勤切页
     *        // driver.findElement(By.id("studyManegerVerifyHref")).click();
     *        // ClassAll.sleep(10000);
     *         //勾选第一条数据
     *        // driver.findElement(By.id("jqg_jqgrid_1")).click();
     *         //点击考勤按钮
     *        // driver.findElement(By.xpath("//tr[@id='1']//button[contains(@class,'btn attendBtn')][contains(text(),'考勤')]")).click();
     *        // ClassAll.sleep(10000);
     *         //点击课程扣费切页
     *        // driver.findElement(By.id("classTeacherDeductionHref")).click();
     *        // ClassAll.sleep(10000);
     *         //勾选第一条数据
     *        // driver.findElement(By.id("jqg_jqgrid_1")).click();
     *         //点击扣费按钮
     *        // driver.findElement(By.xpath("//tr[@id='1']//button[contains(@class,'btn chargeRecordBtn')][contains(text(),'扣费')]")).click();
     *         //点击扣费确认按钮
     *        // driver.findElement(By.id("confirm-yes")).click();
     *         //ClassAll.sleep(10000);
     *
     */
    public void useonetoOneClasses(String OneClassesStudent){
        oneClassesUseData.click();
        oneClassesUseDataBegin.click();
        oneClassesStudent.sendKeys(OneClassesStudent);
        oneClassesUseQuery.click();
        ClassAll.sleep(10000);
        oneClassesUseFirst.click();
        oneClassesUseFirstkaoqin.click();
        ClassAll.sleep(10000);
        oneClassesUseSecondkaoqinPage.click();
        ClassAll.sleep(10000);
        oneClassesUseSecondkaoqin.click();
        ClassAll.sleep(10000);
        oneClassesUseThirdPage.click();
        ClassAll.sleep(10000);
        oneClassesUseThirdPagekoufei.click();
        oneClassesUseThirdPagekoufeiSave.click();
    }

    /**
     * 封装方法
     * 重置考勤
     *点击取消（查看未扣费课程勾选框）
     *         //driver.findElement(By.xpath("//input[@id='showUnchargedCourses']")).click();
     *         //ClassAll.sleep(10000);
     *         //点击勾选（查看已扣费课程勾选框）
     *         //driver.findElement(By.xpath("//input[@id='showChargedCourses']")).click();
     *         //ClassAll.sleep(10000);
     *         //点击第一条数据的重置按钮
     *         //driver.findElement(By.xpath("//tr[@id='2']//button[@class='btn rollbackChargeRecord'][contains(text(),'重置')]")).click();
     *        // ClassAll.sleep(10000);
     *         //点击重置按钮-确认按钮
     *         //driver.findElement(By.xpath("//button[@id='confirm-yes']")).click();
     *        // ClassAll.sleep(10000);
     */
    public void cancelonetoOneClasses(){
        oneClassesUseNotkoufei.click();
        ClassAll.sleep(10000);
        oneClassesUseFiniskoufei.click();
        ClassAll.sleep(10000);
        oneClassesUseReset.click();
        ClassAll.sleep(10000);
        oneClassesUseResetSave.click();
    }

    /**
     * 封装方法
     * 一对一考勤页面-删除排课
     *点击勾选（查看未扣费课程勾选框）
     *         //driver.findElement(By.xpath("//input[@id='showUnchargedCourses']")).click();
     *         //ClassAll.sleep(10000);
     *         //选择第一条数据的修改
     *         //driver.findElement(By.xpath("//tr[@id='1']//button[@class='btn changeBtn'][contains(text(),'修改')]")).click();
     *         //ClassAll.sleep(10000);
     *         //修改页面选择删除
     *        //driver.findElement(By.xpath("//button[@id='deleteBtn']")).click();
     *         //ClassAll.sleep(10000);
     *         //修改页面选择删除-确认按钮
     *         //driver.findElement(By.xpath("//button[@id='confirm-yes']")).click();
     */
    public void deleteonetoOneClasses(){
        oneClassesUseNotkoufei.click();
        ClassAll.sleep(10000);
        oneClassesUseThirdChange.click();
        ClassAll.sleep(10000);
        oneClassesUseThirdChangeDelete.click();
        ClassAll.sleep(10000);
        oneClassesUseThirdChangeDeleteSave.click();


    }



    /**
     * 封装方法
     * 新增一对一排课
     *选择校区
     *         driver.findElement(By.xpath("//select[@id='campusEl']")).sendKeys("伯纳乌");
     *         选择校区确认按钮
     *         driver.findElement(By.xpath("//button[@class='btn btn-primary submit']")).click();
     *         给学员姓名输入框塞值
     *         driver.findElement(By.id("findStudentAutoComplate")).sendKeys("test619001");
     *         选择输入值对应的学员，这时显示右边页面详细信息
     *         driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]")).click();
     *         选择排课处的科目，产品使用默认值
     *         driver.findElement(By.xpath("//select[@name='subject']")).sendKeys("英语");
     *         日期选择框,日期选择框是两个矩阵，本月定位永远是month1，下月定位永远是month2，再通过tr（X轴），td（Y轴）来定位具体日
     *         driver.findElement(By.xpath("//span[@class='form-control date_range_input date_range curcor-pointer']")).click();
     *         选择时间段开始日期和结束日期
     *         driver.findElement(By.xpath("//table[contains(@class,'month1')]//tr[5]//td[1]")).click();
     *         driver.findElement(By.xpath("//table[contains(@class,'month1')]//tr[5]//td[1]")).click();
     *         这里是选择上课星期，要根据你选的时间段来修改结果，例如你日期段选择的是6月24到6月25，但是你这里勾选星期四，则会报错，24和25号是星期一和星期二
     *         driver.findElement(By.xpath("//b[contains(@class,'caret')]")).click();
     *         ClassAll.sleep(10000);
     *         driver.findElement(By.xpath("//label[contains(text(),'星期一')]")).click();
     *         点击选择老师按钮
     *         driver.findElement(By.linkText("选择老师")).click();
     *         ClassAll.sleep(10000);
     *         选择第二个老师
     *         driver.findElement(By.xpath("//table[@id='dayChooseTable']//tbody//tr[2]")).click();
     *         点击上课时间日期控件(14:05分)
     *         driver.findElement(By.id("chooseCourseTime")).click();
     *         ClassAll.sleep(10000);
     *         driver.findElement(By.xpath("//div[contains(@class,'clockpicker-tick')][contains(text(),'14')]")).click();
     *         driver.findElement(By.xpath("//div[contains(text(),'05')]")).click();
     *         课时数
     *         driver.findElement(By.xpath("//input[@id='choosePlanHours']")).clear();
     *         driver.findElement(By.xpath("//input[@id='choosePlanHours']")).sendKeys("1");
     *         课时时长
     *         driver.findElement(By.xpath("//input[@id='chooseTimeLong']")).clear();
     *         driver.findElement(By.xpath("//input[@id='chooseTimeLong']")).sendKeys("5");
     *         driver.findElement(By.id("chooseSave")).click();
     *         ClassAll.sleep(10000);
     *         driver.findElement(By.linkText("保存")).click();
     */
    public void addonetoOneClasses(String oneclassescampus,String oneClassesstuname,String oneClassessubject,String oneClassesplanhours,String oneClassestimelong){
        oneClassescampus.sendKeys(oneclassescampus);
        oneClassessave.click();
        oneClassesstuName.sendKeys(oneClassesstuname);
        oneClassesSlectstuName.click();
        ClassAll.sleep(10000);
        oneClassesTeather.click();
        oneClassesTeatherSave.click();
        ClassAll.sleep(10000);
        oneClassesSubject.sendKeys(oneClassessubject);
        oneClassesDate.click();
        oneClassesDateBegin.click();
        oneClassesWeek.click();
        ClassAll.sleep(10000);
        oneClassesWeekNumber.click();
        oneClassesTeacher.click();
        ClassAll.sleep(10000);
        oneClassesTwoTeacher.click();
        oneClassesTime.click();
        ClassAll.sleep(10000);
        oneClassesHourTime.click();
        oneClassesMinuteTime.click();
        oneClassesPlanHours.clear();
        oneClassesPlanHours.sendKeys(oneClassesplanhours);
        oneClassesTimeLong.clear();
        oneClassesTimeLong.sendKeys(oneClassestimelong);
        chooseSave.click();
        ClassAll.sleep(10000);
        oneClassesSave.click();

    }

    /**
     * 封装方法
     * 删除一对一排课
     *选择校区
     * */
    public void onetoOneClassesClear(){
        oneClassesClear.click();
        oneClassesClearSave.click();

    }

}
