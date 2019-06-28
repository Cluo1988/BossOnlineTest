package com.platfrom.test001.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class LoginPage {

	@FindBy(name = "username")
	public WebElement username_input;

	@FindBy(name = "password")
	public WebElement password_input;

	@FindBy(name = "submit")
	public WebElement submit_btn;

	@FindBy(xpath = "//a[@class='hd-logout']")
	private WebElement logout_btn;

	@FindBy(xpath = "//a[@href='forum-42-1.html']")
	public WebElement newBird;

	@FindBy(xpath = "//a[@href='thread-1084390-1-1.html']")
	public WebElement frist;

	@FindBy(id = "idInput1")
	private WebElement upload;

	@FindBy(xpath = "//table[@class='txt']/tbody/tr/td[2]/div/a")
	private WebElement bbs;

	@FindBy(id = "thread_subject")
	private WebElement title;

	@FindBy(xpath = "//div[@class='cart-message fl wfs']/p")
	private WebElement login_result_text;



	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void doLogin(String username, String password) {
		
//			username_input.clear();
			username_input.sendKeys(username);
//			password_input.clear();
			password_input.sendKeys(password);
			submit_btn.click();
	}




	public void upload() {
		upload.click();

	}

	public void clickBbs() {
		bbs.click();
	}

	public String bbsTitle() {
		return title.getText();

	}

	public void assrtLoginResult(String expected) {
		assertEquals(login_result_text.getText(), expected);

	}

	public void clickLogoutBtn() {
		logout_btn.click();

	}
}
