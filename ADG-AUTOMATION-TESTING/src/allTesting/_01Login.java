package allTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01Login {
	WebDriver driver;
	String baseUrl;
	
	
	
	
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"/Ertonts_Space/projectSpace/ADG-AUTOMATION-TESTING/bin/lib/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://blueocean-it.com/adgtest/admin.htm?actor=goHome";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.linkText("Please Login Here!")).click();
		driver.findElement(By.id("j_username")).sendKeys("adg1");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");

		driver.findElement(By.id("login")).click();
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.id("j_username")).sendKeys("adg2");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg3");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg3");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg4");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg5");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg6");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg7");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();
		driver.navigate().back();

		driver.findElement(By.id("j_username")).sendKeys("adg8");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("login")).click();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();

	}
}
