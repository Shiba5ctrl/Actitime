package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	private WebElement logo;
	
	@FindBy(xpath="//div[@class='atProductName']")
	private WebElement pname;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement cbox;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement fplink;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	public WebElement logo() {
		return logo;
	}
	public WebElement pname() {
		return pname;
	}
	public WebElement cbox() {
		return cbox;
	}
	public WebElement fplink() {
		return fplink;
	}

}
