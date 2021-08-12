package Juint;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class JunitAnnotations {
	static WebDriver driver;

	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish cj\\Desktop\\vezha\\vezha\\chrome\\92\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com");
	}

	@Before
	public static void start() {
		Date date = new Date();
		System.out.println("Browser Starting time is " + date);
	}

	@After
	public static void End() {
		Date Date = new Date();
		System.out.println("Browser end time is: " + Date);
	}

	@Test
	public static void username() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("vezhavendan.vendan4@gmail.com");
		String usernametext = username.getText();
		System.out.println(usernametext);
		Assert.assertEquals("vezhavendan.vendan4@gmail.com", usernametext);
	}

	@Test
	public static void password() {
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("8072848152");
		String passtext = pass.getText();
		System.out.println(passtext);
		Assert.assertEquals("8072848152", passtext);
	}

	@Ignore
	@Test
	public static void submit() {
		WebElement submit = driver.findElement(By.id("u_0_d_xv"));
		submit.click();
	}

}
