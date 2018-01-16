package allTesting;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _23PocketsMenu__AdminCashOutInCash {

	/**
	 * This part is for set up enviorment.
	 */
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
		/**
		 * This is the login part,using "adg1" account
		 * 
		 * @throws InterruptedException
		 */
		driver.get(baseUrl);
		driver.findElement(By.linkText("Please Login Here!")).click();
		driver.findElement(By.id("j_username")).sendKeys("adg1");
		driver.findElement(By.name("j_password")).sendKeys("P@$$w0rd");

		driver.findElement(By.id("login")).click();

		/**
		 * This part is click on "My Profile" under MenuBar
		 * 
		 */
		WebElement PocketsMenu = driver.findElement(By.linkText("Pockets"));
		Actions action = new Actions(driver);
		action.moveToElement(PocketsMenu).perform();
		Thread.sleep(2000);

		WebElement AdminCashOutInCash = driver.findElement(By.linkText("Admin Cash Out In Cash"));
		action.moveToElement(AdminCashOutInCash).click().perform();
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		// Thread.sleep(4000);
		// driver.quit();

	}
}
