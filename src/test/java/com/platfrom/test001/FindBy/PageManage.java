package com.platfrom.test001.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageManage {
    private WebDriver driver;
	private IndexPage indexPage;
	private LoginPage loginPage;
	private Product product;
	private  LogIn logIn;
	private Student student;
	private HomePage homePage;
	private ClassGrade classGrade;
	private OnetoOneClasses onetoOneClasses;
	private OnetoNClass onetoNClass;
	private Cont cont;
	private Customer customer;


	
	public PageManage(WebDriver driver){
		this.driver = driver;	
	}
	
	/**
	 * 首页
	 * @return
	 */
	public IndexPage getIndexPage() {
		if (indexPage == null) {
			indexPage = new IndexPage(driver);
		}
		return indexPage;
	}

	public OnetoNClass getOnetoNClass() {
		if (onetoNClass == null) {
			onetoNClass = new OnetoNClass(driver);
		}
		return onetoNClass;
	}

	public Cont getCont() {
		if (cont == null) {
			cont = new Cont(driver);
		}
		return cont;
	}

	public Customer getCustomer() {
		if (customer == null) {
			customer = new Customer(driver);
		}
		return customer;
	}

	public OnetoOneClasses getOnetoOneClasses() {
		if (onetoOneClasses == null) {
			onetoOneClasses = new OnetoOneClasses(driver);
		}
		return onetoOneClasses;
	}

	public HomePage getHomePage(){
		if (homePage == null){
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage(driver);
		}
		return loginPage;
	}

	public Product getProduct() {
		if(product == null){
			product = new Product(driver);
		}
		return product;
	}

	public LogIn getLogIn() {
		if(logIn == null){
			logIn = new LogIn(driver);
		}
		return logIn;
	}

	public Student getStudent() {
		if(student == null){
			student = new Student(driver);
		}
		return student;
	}

	public ClassGrade getClassGrade() {
		if(classGrade == null){
			classGrade = new ClassGrade(driver);
		}
		return classGrade;
	}

	//这里要注意，ifrema框跳转，如果只打开一个切页，就用第一个切页跳入，如果有多个切页就用最后一个切页跳入。注意看浏览器的元素定位。
	//ifrema框第一个切页跳入
	public void IframeIn() {
		WebElement iframe = driver.findElement(By.xpath("//div[@class='tabs-panels tabs-panels-noborder']//div[2]//div[1]//iframe[1]"));
		driver.switchTo().frame(iframe);
	}

	//ifrema框最后一个切页跳入
	public void IframeInLast() {
		WebElement iframe = driver.findElement(By.xpath("//li[@class='tabs-last tabs-selected']//a[@class='tabs-inner']"));
		driver.switchTo().frame(iframe);
	}

	//ifrema框跳出
	public void IframeOut() {
		driver.switchTo().defaultContent();
	}

	//关闭切页
	public void ClosePage() {
		driver.findElement(By.xpath("//a[contains(@class,'tabs-close fa fa-remove')]")).click();
	}



}
