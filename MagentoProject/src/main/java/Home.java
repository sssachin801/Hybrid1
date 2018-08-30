

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;

	By myacc = By.linkText("My Account");

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMyacc() {
		driver.findElement(myacc).click();
		System.out.println("Pushed..");
	}

}
