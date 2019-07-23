package com.platfrom.test001.FindBy;


import com.platfrom.test001.TestOne.ClassAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/12 0012.
 */
public class Student {
    //构造本页面
    public Student(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //学员-学员列表-列表第一项数据勾选框
    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
    public static WebElement student_List;

    //学员-学员列表-名字输入框
    @FindBy(xpath = "//input[@id='name']")
    public static WebElement studentName;

    //学员-学员列表-查询按钮
    @FindBy(xpath = "//button[@id='searchbtn']")
    public static WebElement student_search;

    //学员-学员列表-删除按钮
    @FindBy(xpath = "//button[contains(text(),'删除')]")
    public static WebElement student_delete;

    //学员-学员列表-删除按钮-完全删除
    @FindBy(xpath = "//a[contains(text(),'完全删除')]")
    public static WebElement student_deleteall;

    //学员-学员列表-删除按钮-完全删除-确认
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement student_deleteallyes;

    //学员-学员列表-删除按钮-完全删除-确认-删除原因
    @FindBy(xpath = "//textarea[@placeholder='删除原因']")
    public static WebElement student_deleteallyes_reason;

    //学员-学员列表-删除按钮-完全删除-确认-删除原因-确认
    @FindBy(xpath = "//button[@class='btn btn-primary submit'][contains(text(),'确定')]")
    public static WebElement student_deleteallyes_reason_save;

    //编辑学员页面元素
    //学员-学员列表-编辑按钮
    @FindBy(xpath ="/html[1]/body[1]/div[6]/div[1]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[last()]/button[1]")
    public static WebElement student_edit;

    //学员-学员列表-编辑页面-姓名输入框
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='姓名'])[2]/following::input[1]")
    public static WebElement student_name;

    //学员-学员列表-编辑页面-手机（学讯通）输入框
    @FindBy(xpath ="(.//*[normalize-space(text()) and normalize-space(.)='手机(学讯通)'])[1]/following::input[1]")
    public static WebElement student_phone;

    //学员-学员列表-编辑页面-年级
    @FindBy(id ="gradeId")
    public static WebElement student_grade;

    //学员-学员列表-编辑页面-状态
    @FindBy(id ="status")
    public static WebElement student_status;

    //学员-学员列表-编辑页面-客户手机
    @FindBy(id ="latestCustomerContact")
    public static WebElement student_customerphone;

    //学员-学员列表-编辑页面-保存按钮
    @FindBy(id ="appointmentDateSubmit")
    public static WebElement student_save;

    //学员-学员列表-编辑页面-保存-继续保存按钮
    @FindBy(xpath ="//button[@id='submitBtn']")
    public static WebElement studentSaveAgain;




    /**
     * 封装方法
     * 修改学员信息
     *driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/section[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[last()]/button[1]")).click();
     * driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='姓名'])[2]/following::input[1]")).clear();
     * driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='姓名'])[2]/following::input[1]")).sendKeys("牙牙乐888");
     * driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='手机(学讯通)'])[1]/following::input[1]")).clear();
     * driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='手机(学讯通)'])[1]/following::input[1]")).sendKeys("13411164100");
     * driver.findElement(By.id("gradeId")).sendKeys("二年级");
     * driver.findElement(By.id("status")).sendKeys("上课中");
     * driver.findElement(By.id("latestCustomerContact")).clear();
     * driver.findElement(By.id("latestCustomerContact")).sendKeys("13411164100");
     * driver.findElement(By.id("appointmentDateSubmit")).click();
     */
    public void modificationStudent(String StudentName,String studentname, String studentphone, String studentgrade, String studentstatus, String studentcustomerphone) {
        ClassAll.sleep(10000);
        studentName.sendKeys(StudentName);
        ClassAll.sleep(10000);
        student_search.click();
        ClassAll.sleep(10000);
        student_edit.click();
        ClassAll.sleep(10000);
        student_name.clear();
        student_name.sendKeys(studentname);
        ClassAll.sleep(10000);
        student_phone.clear();
        student_phone.sendKeys(studentphone);
        student_grade.sendKeys(studentgrade);
        student_status.sendKeys(studentstatus);
        student_customerphone.clear();
        student_customerphone.sendKeys(studentcustomerphone);
        student_save.click();
        //ClassAll.sleep(10000);
        //studentSaveAgain.click();

    }

    /*封装方法
    删除学员*/
    public void deleteStudent(String reason) {

       student_List.click();
       student_delete.click();
       student_deleteall.click();
       student_deleteallyes.click();
       student_deleteallyes_reason.sendKeys(reason);
       ClassAll.sleep(10000);
       student_deleteallyes_reason_save.click();
    }

    /*封装方法
    查询学员*/
    public void searchStudent() {
        student_search.click();
    }

}
