

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By email = By.id("email");
	By pwd = By.id("pass");
	By log = By.id("send2");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void typeEmail(String data) {
		driver.findElement(email).sendKeys(data);
	}

	public void typePassword(String pass) {
		driver.findElement(pwd).sendKeys(pass);
	}

	public void clickOnLogin() {
		driver.findElement(log).click();
	}

}
