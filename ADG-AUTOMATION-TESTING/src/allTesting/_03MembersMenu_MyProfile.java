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

public class _03MembersMenu_MyProfile {
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
		WebElement MembersMenu = driver.findElement(By.xpath("//a[@href='member.htm?actor=membermenu']"));

		Actions action = new Actions(driver);
		action.moveToElement(MembersMenu).perform();
		Thread.sleep(2000);

		WebElement MyProfile = driver.findElement(By.linkText("My Profile"));
		action.moveToElement(MyProfile).click().perform();
		
		/**
		 * This part is updating user profile info
		 */
		driver.findElement(By.id("updbut")).click();
		driver.findElement(By.id("jtmChineseName")).sendKeys("СҶ");
		driver.findElement(By.id("idNumber")).sendKeys("10000110");
		driver.findElement(By.id("jtmFirstName")).clear();
		driver.findElement(By.id("jtmFirstName")).sendKeys("Ye");;
		driver.findElement(By.id("jtmMiddleName")).sendKeys("Mr");
		driver.findElement(By.id("jtmLastName")).clear();
		driver.findElement(By.id("jtmLastName")).sendKeys("Charles");
		
		/**This part has 2 item with same id,it auto select the first one.
		driver.findElement(By.id("bankAccName")).click();
		*/
		driver.findElement(By.id("bankName")).sendKeys("Bank of America");
		driver.findElement(By.id("bankBranch")).sendKeys("Arlington Branch");
		driver.findElement(By.id("bankAccount")).sendKeys("123456789");
		driver.findElement(By.id("jtmPhone")).clear();
		driver.findElement(By.id("jtmPhone")).sendKeys("16719902229");
		driver.findElement(By.id("jtmEmail")).clear();
		driver.findElement(By.id("jtmEmail")).sendKeys("ertonts_1006@yahoo.com");
		driver.findElement(By.id("jtmQQNumber")).sendKeys("1235456778");
		driver.findElement(By.id("jtmWeChatAddr")).sendKeys("wechat1234");
		driver.findElement(By.id("addrNum")).sendKeys("11234");
		driver.findElement(By.id("addrStr")).sendKeys("hualian");
		driver.findElement(By.id("addrPt3")).sendKeys("345");
		driver.findElement(By.id("cityName")).clear();
		driver.findElement(By.id("cityName")).sendKeys("Taipei");
		driver.findElement(By.id("stateName")).sendKeys("Gaoxiong");
		driver.findElement(By.id("zipCode")).sendKeys("22222");
		driver.findElement(By.id("update")).click();
		
		
		
		

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();

	}
}
