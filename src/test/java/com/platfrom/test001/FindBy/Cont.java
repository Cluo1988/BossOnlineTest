package com.platfrom.test001.FindBy;

import TestOne.ClassAll;

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
    @FindBy(xpath = "//input[@id='productFilterPanelInput']")
    public static WebElement productclik;

    //前台-新生报名-选择第一个课程产品
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='已报'])[1]/preceding::button[1]")
    public static WebElement productFirst;
    //前台-新生报名-选择第二个课程产品
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='自动化1对N01'])[1]/following::button[1]")
    public static WebElement productSecond;
    //前台-新生报名-选择第三个课程产品
    @FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='自动化一对一01'])[1]/following::button[1]")
    public static WebElement productThird;
    //前台-新生报名-选择第四个课程产品
    @FindBy(xpath = "//div[contains(@class,'productPanelItem col-md-12 border-bottom')]//div[2]//button[1]")
    public static WebElement productFourth;
    //前台-新生报名-第一个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[1]/td[@name='promotion']/div[1]")
    public static WebElement productFirstDisconuts;
    //前台-新生报名-第一个课程产品优惠选择框-选择优惠
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[1]/td[@name='promotion']//div[1]/div[@class='promotionItem']/div[1]")
    public static WebElement productFirstDisconuts1;
    //前台-新生报名-第二个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[2]/td[@name='promotion']/div[1]")
    public static WebElement productSecondDisconuts;
    //前台-新生报名-第二个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[2]/td[@name='promotion']//div[1]/div[@class='promotionItem']/div[1]")
    public static WebElement productSecondDisconuts1;
    //前台-新生报名-第三个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[3]/td[@name='promotion']/div[1]")
    public static WebElement productThirdDisconuts;
    //前台-新生报名-第三个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[3]/td[@name='promotion']//div[1]/div[@class='promotionItem']/div[1]")
    public static WebElement productThirdDisconuts1;
    //前台-新生报名-第四个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[4]/td[@name='promotion']/div[1]")
    public static WebElement productFourthDisconuts;
    //前台-新生报名-第四个课程产品优惠选择框
    @FindBy(xpath = "//tbody[@id='contractProductsTbody']//tr[4]/td[@name='promotion']//div[1]/div[@class='promotionItem']/div[1]")
    public static WebElement productFourthDisconuts1;

    //前台-新生报名-保存按钮
    @FindBy(id = "submitBtnAndRefresh")
    public static WebElement contsave;

    //前台-新生报名-保存成功页面-去收款按钮
    @FindBy(id = "chargeBtn")
    public static WebElement receipt;

    //修改合同-保存-修改确认页面-确定
    @FindBy(xpath = "//button[@id='confirm-yes']")
    public static WebElement contsave2;

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

    //财务-合同管理-查询栏-日期
    @FindBy(xpath = "//label[@class='timeRangeWidth']")
    public static WebElement ContDate;

    //财务-合同管理-查询栏-日期-清空
    @FindBy(xpath = "//input[@class='clear-btn']")
    public static WebElement ContDateClear;

    //财务-合同管理-查询栏-学生名字
    @FindBy(xpath = "//input[@id='stuName']")
    public static WebElement ContStudentName;

    //财务-合同管理-查询栏-查询按钮
    @FindBy(xpath = "//button[@id='searchbtn']")
    public static WebElement ContSearch;

    //财务-合同管理-第一个更多
    @FindBy(xpath = "//button[@id='showMoreOption']")
    public static WebElement ContMore;

    //财务-合同管理-第一个更多-修改合同
    @FindBy(xpath = "//div[@id='operationDropdownMenu']//li[3]//a[1]")
    public static WebElement ContReviseCont;





    public void addCont(String Selectcampus, String Studentname, String Phone, String StudentClass, String Campus, String CusOrg, String CusType,String productClik, String Receiptampus, String Receiptamount, String Receiptnumber) {
        ClassAll.sleep(10000);
        selectcampus.sendKeys(Selectcampus);
        selectsave.click();
        ClassAll.sleep(10000);
        newstudentbtn.click();
        ClassAll.sleep(10000);
        studentname.sendKeys(Studentname);
        phone.sendKeys(Phone);
        studentclass.sendKeys(StudentClass);
        campus.sendKeys(Campus);
        cusOrg.sendKeys(CusOrg);
        cusType.sendKeys(CusType);
        submitBtn.click();
        ClassAll.sleep(10000);
        productclik.click();
        productclik.sendKeys(productClik);
        ClassAll.sleep(10000);
        //这里为了配合之后新增三种类型的排课新增了三种类型的产品
        productFirst.click();
        ClassAll.sleep(10000);
        productSecond.click();
        ClassAll.sleep(10000);
        productThird.click();
        ClassAll.sleep(10000);
        productFourth.click();
        ClassAll.sleep(10000);
        productFirstDisconuts.click();
        ClassAll.sleep(10000);
        productFirstDisconuts1.click();
        ClassAll.sleep(10000);
        productSecondDisconuts.click();
        ClassAll.sleep(10000);
        productSecondDisconuts1.click();
        ClassAll.sleep(10000);
        productThirdDisconuts.click();
        ClassAll.sleep(10000);
        productThirdDisconuts1.click();
        ClassAll.sleep(10000);
        productFourthDisconuts.click();
        ClassAll.sleep(10000);
        productFourthDisconuts1.click();
        ClassAll.sleep(10000);
        contsave.click();
        ClassAll.sleep(10000);
        receipt.click();
        ClassAll.sleep(10000);
        receiptampus.sendKeys(Receiptampus);
        receiptamount.sendKeys(Receiptamount);
        receiptnumber.sendKeys(Receiptnumber);
        receiptsave.click();
        ClassAll.sleep(10000);
        receiptclose.click();
        ClassAll.sleep(10000);
        contsaveclose.click();

    }
    //修改合同

    public static PageManage pm;

    public void reviseCont(String contStudentName) {
        ContDate.click();
        ClassAll.sleep(10000);
        ContDateClear.click();
        ClassAll.sleep(10000);
        ContStudentName.sendKeys(contStudentName);
        ClassAll.sleep(10000);
        ContSearch.click();
        ClassAll.sleep(10000);
        ContMore.click();
        ClassAll.sleep(10000);
        ContReviseCont.click();
    }
    public void reviseCont2(){
        ClassAll.sleep(10000);
        contsave.click();
        ClassAll.sleep(10000);
        contsave2.click();
        ClassAll.sleep(10000);
        contsaveclose.click();
    }

}
