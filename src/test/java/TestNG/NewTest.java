package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish cj\\Desktop\\vezha\\vezha\\chrome\\92\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
	}
	@AfterClass
	public static void close() {
		driver.quit();
}
	@Test(priority=1,parameters="username1",groups="login")
	public static void username(String username1) {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(username1);
		System.out.println("username sucessfully inserted");
		}
	@Test(priority=2,parameters="password1",groups="login")
	public static void password(String password1) {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(password1);
		System.out.println("password sucessfully entered");
		
	}
	@Test(priority=3,groups="click",enabled=false)
	public static void submit() {
		WebElement submit = driver.findElement(By.id("u_0_d_xv"));
		submit.click();
	}

  }

