package testes;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.page.DashBoardPage;
import com.page.LoginPage;
import com.page.UserPage;
import com.page.registorPage;

import junit.framework.Assert;

public class LoginTest {
	public WebDriver driver = null;
	public LoginPage lp=null;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html#");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void login() {
		lp = new LoginPage(driver);
		lp.loginApplication("kiran@gmail.com", "123456");

	}

	@Test(priority = 2)
	public void newLogin() throws InterruptedException {
		lp.navigateToRegister();
		registorPage rp = new registorPage(driver);
		String text = rp.registorText().getText();
		System.out.println(text);
		rp.nameFiled().sendKeys("Deepu");
		rp.mobileFiled().sendKeys("8208745475");
		rp.emailFiled().sendKeys("deependraraosa@gmail.com");
		rp.passwordFiled().sendKeys("12345678");
		rp.buttonFiled().click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		rp.alreadyAccount().click();

	}
	
	@Test(priority = 3)
	public void loginAgain() {
	
		LoginPage lp = new LoginPage(driver);
		lp.loginApplication("kiran@gmail.com", "123456");

	}
	@Test(priority = 4)
	public void dashBoard() {
		ArrayList<String> expectedCoyrses = new ArrayList<String>();
		expectedCoyrses.add("Selenium");
		expectedCoyrses.add("Java / J2EE");
		expectedCoyrses.add("Python");
		expectedCoyrses.add("Php");
		System.out.println(expectedCoyrses);
		DashBoardPage dp = new DashBoardPage(driver);
		ArrayList<String> actualCourses = dp.verifyCourse();
		System.out.println(actualCourses);
		Assert.assertEquals(actualCourses,expectedCoyrses);
	}
	@Test(priority = 5)
	public void userPage() {
		UserPage up = new UserPage(driver);
		up.userClick();
	}
	

//	@AfterSuite
//	public void close() {
//		driver.quit();
//	}

}
