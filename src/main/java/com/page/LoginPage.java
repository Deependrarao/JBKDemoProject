package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img")
	WebElement logo;

	@FindBy(xpath="//a/b")
	WebElement textDisplay;

	@FindBy(xpath="//a/h4")
	WebElement textPage;

	@FindBy(xpath="//div[2]/p")
	WebElement paragraph;

	@FindBy(id="email")
	WebElement userName;

	@FindBy(id="password")
	WebElement pwdField;

	@FindBy(xpath="//button")
	WebElement loginBtn;

	@FindBy(xpath="//div[2]/a")
	WebElement registerLink;

	public  void loginApplication(String uname,String pwd) {
		boolean text =logo.isDisplayed();
		System.out.println(text);
		String text1 =textDisplay.getText();
		System.out.println(text1);
		String text2 =textPage.getText();
		System.out.println(text2);
		String text3 =paragraph.getText();
		System.out.println(text3);
		userName.sendKeys(uname);
		pwdField.sendKeys(pwd);
		loginBtn.click();
		
	}
	public void navigateToRegister() {
		driver.navigate().back();
		registerLink.click();
	}

}
