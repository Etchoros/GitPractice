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

public class _41ManageEvents_AddEvent {

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
		 * This part is click on  "My Profile" under MenuBar
		 * 
		 */
		WebElement MainMenu = driver.findElement(By.xpath("//a[@href='admins.htm?actor=mainmenu']"));

		Actions action = new Actions(driver);
		action.moveToElement(MainMenu).perform();
		Thread.sleep(2000);

		WebElement ManageEvents = driver.findElement(By.linkText("Manage Events"));
		action.moveToElement(ManageEvents).click().perform();
		
		driver.findElement(By.xpath("//*[@id='addNew_top']")).click();
		driver.findElement(By.xpath("//*[@id='table-jt']/tbody/tr[1]/td[2]/button")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div/input")).sendKeys("Software");
		driver.findElement(By.xpath("html/body/div[3]/ul/li[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id='eventStart']")).sendKeys("2017/10/10");
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();

	}

}
