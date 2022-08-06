/**
 * @author Mawaddah Hanbali
 */
package ass4W9D5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWhebDriverAss4W9D5 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */
	@BeforeTest
	public void setUp() throws InterruptedException {
		// The path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");

		// Open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000); // To load the page
		System.out.println("Website Title: " + driver.getTitle());
	}

	/**
	 * Test Alert
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// save main window
		String mainWindow = driver.getWindowHandle();

		// click on confirm alert
		WebElement alertButtin = driver.findElement(By.cssSelector("#confirmButton"));
		alertButtin.click();
//		Thread.sleep(1000);

		// Accepting confirm alert
		driver.switchTo().alert().accept();
//		Thread.sleep(1000);

		// Switching to main window
		driver.switchTo().window(mainWindow);

		// click on confirm alert
		alertButtin.click();
//		Thread.sleep(1000);

		// Dismiss confirm alert
		driver.switchTo().alert().dismiss();
//		Thread.sleep(1000);

		// Switching to main window
		driver.switchTo().window(mainWindow);
//		Thread.sleep(1000);

		// click on prompt alert
		WebElement alertButtin1 = driver.findElement(By.cssSelector("#promtButton"));
		alertButtin1.click();
//		Thread.sleep(1000);

		// send value to prompt alert
		driver.switchTo().alert().sendKeys("Mawaddah Hanbali");
//		Thread.sleep(1000);

		// click on OK button
		driver.switchTo().alert().accept();
//		Thread.sleep(1000);

		// switch to main window
		driver.switchTo().window(mainWindow);
//		Thread.sleep(1000);

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
