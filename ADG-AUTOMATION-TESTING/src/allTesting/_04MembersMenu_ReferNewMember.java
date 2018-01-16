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

public class _04MembersMenu_ReferNewMember {

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
		 * This part is click on "Refer New Member" under MenuBar
		 * 
		 */
		WebElement MembersMenu = driver.findElement(By.xpath("//a[@href='member.htm?actor=membermenu']"));

		Actions action = new Actions(driver);
		action.moveToElement(MembersMenu).perform();
		Thread.sleep(2000);

		WebElement ReferNewMember = driver.findElement(By.linkText("Refer New Member"));
		action.moveToElement(ReferNewMember).click().perform();

		/**
		 * This part is for updating refer new user profile info.
		 */
		driver.findElement(By.id("chineseName")).sendKeys("СҶ");// This part
																// some time run
																// through,sometime
																// not.
		driver.findElement(By.id("idNumber")).sendKeys("12345");
		driver.findElement(By.id("firstName")).sendKeys("Ye");
		driver.findElement(By.id("middleName")).sendKeys("Mr");
		driver.findElement(By.id("lastName")).sendKeys("Charles");
		driver.findElement(By.id("jtmUsername")).clear();
		driver.findElement(By.id("jtmUsername")).sendKeys("Charlie");
		driver.findElement(By.id("jtmPassword")).clear();
		driver.findElement(By.id("jtmPassword")).sendKeys("222223");
		driver.findElement(By.id("jtmPass2")).sendKeys("222223");

		driver.findElement(By.id("bankAccName")).click();

		driver.findElement(By.id("bankName")).sendKeys("Bank Of America");
		driver.findElement(By.id("bankBranch")).sendKeys("Arlington Branch");
		driver.findElement(By.id("bankAccount")).sendKeys("123456789");
		driver.findElement(By.id("jtmPhone")).clear();
		driver.findElement(By.id("jtmPhone")).sendKeys("16719902229");
		driver.findElement(By.id("jtmEmail")).clear();
		driver.findElement(By.id("jtmEmail")).sendKeys("ertonts_1006@yahoo.com");
		driver.findElement(By.id("jtmQQNumber")).sendKeys("1235456778");
		driver.findElement(By.id("jtmWeChatAddr")).sendKeys("wechat1234");

		driver.findElement(By.xpath("//*[@id='addMember']/table/tbody/tr[12]/td[2]/button")).click();

		driver.findElement(By.xpath("html/body/div[2]/div/div/input")).sendKeys("china");
		driver.findElement(By.xpath("html/body/div[2]/ul/li[2]/label/span")).click();
		driver.findElement(By.id("addrNum")).sendKeys("11234");
		driver.findElement(By.id("addrStr")).sendKeys("hualian");
		driver.findElement(By.id("addrPt3")).sendKeys("345");
		driver.findElement(By.id("cityName")).clear();
		driver.findElement(By.id("cityName")).sendKeys("Taipei");
		driver.findElement(By.id("stateName")).sendKeys("Gaoxiong");
		driver.findElement(By.id("zipCode")).sendKeys("22222");

		
		driver.findElement(By.id("memberLevel")).click();//This part might not be accurate

		driver.findElement(By.id("insert")).click();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();

	}
}