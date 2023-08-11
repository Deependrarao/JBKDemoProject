package com.page;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;
	
	public void userClick() {
		userBtn.click();
		List<WebElement> row_list = driver.findElements(By.tagName("tr"));
		for(int i=1; i<row_list.size();i++) 
		{
			List<WebElement> col_list = row_list.get(i).findElements(By.tagName("td"));
			for(int j=0; j<col_list.size();j++) 
			{
				System.out.print(col_list.get(j).getText()+" \t");
			}
			System.out.println(" ");
		}
	
	}	
}

