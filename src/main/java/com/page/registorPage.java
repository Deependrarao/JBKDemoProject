package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registorPage {
	WebDriver driver;

	public registorPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//p")
	private WebElement registorText;

	@FindBy(id="name")
	private WebElement nameFiled;

	@FindBy(id="mobile")
	private WebElement mobileFiled;

	@FindBy(id="email")
	private WebElement emailFiled;

	@FindBy(id="password")
	private WebElement passwordFiled;

	@FindBy(xpath="//button")
	private WebElement buttonFiled;

	@FindBy(xpath="//div[2]/a")
	private WebElement alreadyAccount;


	public WebElement registorText() {
		return registorText;
	}

	public WebElement nameFiled() {
		return nameFiled;
	}

	public WebElement emailFiled() {
		return emailFiled;
	}

	public WebElement mobileFiled() {
		return mobileFiled;
	}

	public WebElement passwordFiled() {
		return  passwordFiled;
	}

	public WebElement buttonFiled() {
		return  buttonFiled;
	}
	
	public WebElement alreadyAccount() {
		return alreadyAccount;
	}
	
}
