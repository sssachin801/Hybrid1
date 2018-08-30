

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest {

	@Test
	public void testRun() throws InterruptedException{

		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyacc();
		Thread.sleep(2000);

		Login l = new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		Thread.sleep(2000);
		l.typePassword("Welcome123");
		Thread.sleep(2000);
		l.clickOnLogin();
		Thread.sleep(2000);

		Main m = new Main(driver);
		m.clickOnLogout();

		Thread.sleep(2000);

		driver.quit();

	}

}
