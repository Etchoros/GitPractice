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

public class _21PocketsMenu__AssignMemberE_PTS {

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

		WebElement AssignMemberE_PTS = driver.findElement(By.linkText("Assign Member E-PTS"));
		action.moveToElement(AssignMemberE_PTS).click().perform();
		//Put information and update
		driver.findElement(By.xpath("//*[@id='buyEpts']/table/tbody/tr[2]/td[2]/button")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/input")).sendKeys("tao01");
		driver.findElement(By.xpath("html/body/div[2]/ul/li[2]/label/span")).click();
		driver.findElement(By.id("buyepts")).sendKeys("2000");
		driver.findElement(By.id("buyEpt")).click();
	}

	@After
	public void tearDown() throws Exception {
		// Thread.sleep(4000);
		// driver.quit();

	}
}
