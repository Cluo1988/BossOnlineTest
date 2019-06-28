package FindBy;

import TestOne.ClassAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public class Cont {
    //构造本页面
    public Cont(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //前台-新生报名-校区选择框
    @FindBy(xpath = "//select[@id='campusEl']")
    public static WebElement selectcampus;

    //前台-新生报名-校区选择框-确认按钮
    @FindBy(xpath = "//button[@class='btn btn-primary submit']")
    public static WebElement selectsave;

    //前台-新生报名-新增学员按钮
    @FindBy(id = "showAddStudentLayoutEl")
    public static WebElement newstudentbtn;

    //新增合同的新增学员页面
    //前台-新生报名-新增学员页面-学员姓名
    @FindBy(xpath = "//div[@class='col-md-8']//input[@name='name']")
    public static WebElement studentname;

    //前台-新生报名-新增学员页面-联系电话
    @FindBy(name = "contact")
    public static WebElement phone;

    //前台-新生报名-新增学员页面-学员年级
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='学员年级'])[2]/following::select[1]")
    public static WebElement studentclass;

    //前台-新生报名-新增学员页面-归属校区
    @FindBy(id = "campusId")
    public static WebElement campus;

    //前台-新生报名-新增学员页面-来源类型
    @FindBy(id = "cusOrg")
    public static WebElement cusOrg;

    //前台-新生报名-新增学员页面-来源渠道
    @FindBy(id = "cusType")
    public static WebElement cusType;

    //前台-新生报名-新增学员页面-保存按钮
    @FindBy(id = "submitBtn")
    public static WebElement submitBtn;

    //前台-新生报名-新增学员页面-保存-学员重名检测页面的继续保存按钮
    @FindBy(xpath = "//div[@id='showMiniClassStudentModal']//div[@class='modal-footer']//button[contains(text(),'继续保存')]")
    public static WebElement againsubmitBtn;

    //前台-新生报名-选择第一个课程产品
    //前台-新生报名-课程产品点击下拉框
    @FindBy(xpath = "//div[@id='productFilterPanelInputContainer']")
    public static WebElement productclik;

    //前台-新生报名-选择第一个课程产品
    @FindBy(xpath = "//div[@class='items col-md-12 no-padding border-top productItems']//div[1]//div[3]//button[1]")
    public static WebElement productfirst;

    //前台-新生报名-保存按钮
    @FindBy(id = "submitBtnAndRefresh")
    public static WebElement contsave;

    //前台-新生报名-保存成功页面-去收款按钮
    @FindBy(id = "chargeBtn")
    public static WebElement receipt;

    //新生报名的合同收款页面
    //前台-新生报名-保存成功页面-去收款-合同收款页面-选择收款校区
    @FindBy(xpath = "//div[@id='campusInfo']//div//select[@id='blCampusId']")
    public static WebElement receiptampus;

    //前台-新生报名-保存成功页面-去收款-合同收款页面-付款金额
    @FindBy(name = "transactionAmount")
    public static WebElement receiptamount;

    //前台-新生报名-保存成功页面-去收款-合同收款页面-收款凭证号
    @FindBy(name = "posid")
    public static WebElement receiptnumber;

    //前台-新生报名-保存成功页面-去收款-合同收款页面-保存
    @FindBy(id = "submitBtn")
    public static WebElement receiptsave;

    //前台-新生报名-保存成功页面-去收款-合同收款页面-收款成功页面-关闭按钮
    @FindBy(xpath = "//div[@id='afterTransaction']//button[@class='close'][contains(text(),'×')]")
    public static WebElement receiptclose;

    //前台-新生报名-保存成功页面-保存成功页面关闭按钮
    @FindBy(xpath = "//button[@class='close']")
    public static WebElement contsaveclose;


    /**
     * 封装方法
     * 新增合同
     * //新增合同页面
     *         ClassAll.sleep(5000);
     *         driver.findElement(By.xpath("//select[@id='campusEl']")).sendKeys("伯纳乌");
     *         driver.findElement(By.xpath("//button[@class='btn btn-primary submit']")).click();
     *         ClassAll.sleep(5000);
     *     //选择校区
     *         driver.findElement(By.id("showAddStudentLayoutEl")).click();
     *         ClassAll.sleep(5000);
     *     //新增学员页面数据填写
     *         driver.findElement(By.xpath("//div[@class='col-md-8']//input[@name='name']")).sendKeys("1903080011");
     *         driver.findElement(By.name("contact")).sendKeys("13411164100");
     *         driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='学员年级'])[2]/following::select[1]")).sendKeys("六年级");
     *         driver.findElement(By.id("cusOrg")).sendKeys("短息");
     *         driver.findElement(By.id("cusType")).sendKeys("地推电话");
     *         driver.findElement(By.id("campusId")).sendKeys("伯纳乌");
     *         driver.findElement(By.id("submitBtn")).click();
     *         ClassAll.sleep(5000);
     *     //相同学生页面的保存
     *     //driver.findElement(By.xpath("//div[@id='showMiniClassStudentModal']//div[@class='modal-footer']//button[contains(text(),'继续保存')]")).click();
     *     //选择课程
     *         driver.findElement(By.xpath("//div[@id='productFilterPanelInputContainer']")).click();
     *         ClassAll.sleep(5000);
     *         driver.findElement(By.xpath("//div[@class='items col-md-12 no-padding border-top productItems']//div[1]//div[3]//button[1]")).click();
     *         ClassAll.sleep(5000);
     *         driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
     *         ClassAll.sleep(5000);
     *     //
     *         driver.findElement(By.id("chargeBtn")).click();
     *         driver.findElement(By.xpath("//div[@id='campusInfo']//div//select[@id='blCampusId']")).sendKeys("伯纳乌");
     *         driver.findElement(By.name("transactionAmount")).sendKeys("300");
     *         driver.findElement(By.name("posid")).sendKeys("22231");
     *         driver.findElement(By.id("submitBtn")).click();
     *
     *         ClassAll.sleep(5000);
     *         driver.findElement(By.xpath("//div[@id='afterTransaction']//button[@class='close'][contains(text(),'×')]")).click();
     *         ClassAll.sleep(5000);
     *         driver.findElement(By.xpath("//button[@class='close']")).click();
     */
    public void addCont(String Selectcampus, String Studentname, String Phone, String StudentClass, String Campus, String CusOrg, String CusType, String Receiptampus, String Receiptamount, String Receiptnumber) {
        ClassAll.sleep(5000);
        selectcampus.sendKeys(Selectcampus);
        selectsave.click();
        ClassAll.sleep(5000);
        newstudentbtn.click();
        ClassAll.sleep(5000);
        studentname.sendKeys(Studentname);
        phone.sendKeys(Phone);
        studentclass.sendKeys(StudentClass);
        campus.sendKeys(Campus);
        cusOrg.sendKeys(CusOrg);
        cusType.sendKeys(CusType);
        submitBtn.click();
        ClassAll.sleep(5000);
        productclik.click();
        ClassAll.sleep(5000);
        productfirst.click();
        ClassAll.sleep(5000);
        contsave.click();
        ClassAll.sleep(5000);
        receipt.click();
        ClassAll.sleep(5000);
        receiptampus.sendKeys(Receiptampus);
        receiptamount.sendKeys(Receiptamount);
        receiptnumber.sendKeys(Receiptnumber);
        receiptsave.click();
        ClassAll.sleep(5000);
        receiptclose.click();
        ClassAll.sleep(5000);
        contsaveclose.click();

    }



}
