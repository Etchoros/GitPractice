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

public class _10MainMenu_ChangePassWord {

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
		 * This part is click on "Change Password" under Main MenuBar
		 * 
		 */
		WebElement MainMenu = driver.findElement(By.xpath("//a[@href='admins.htm?actor=mainmenu']"));

		Actions action = new Actions(driver);
		action.moveToElement(MainMenu).perform();
		Thread.sleep(2000);

		WebElement ChangePassword = driver.findElement(By.linkText("Change Password"));
		action.moveToElement(ChangePassword).click().perform();

		//This part for change password
		driver.findElement(By.id("currpass")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("j_password")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("j_password2")).sendKeys("P@$$w0rd");
		driver.findElement(By.id("changePWD")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		// driver.quit();
}
}