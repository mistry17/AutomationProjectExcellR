package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public WebDriver driver;
	
	public SignIn(WebDriver driver) {
		this.driver=driver;
	}
		By email = By.id("email");
		By _password = By.xpath("//input[@name='login[password]']");
		By _signInButton = By.xpath("//form[1]/fieldset[1]/div[4]/div[1]/button[1]/span[1]");
		By _createAnAccountButton = By.cssSelector(".action create primary");
	
	public void enterEmail(String eMail) {
		driver.findElement(email).sendKeys(eMail);
	}
	
	public void enterPassword(String password) {
		driver.findElement(_password).sendKeys(password);
	}
	
	public void clickSignInButton() {
		driver.findElement(_signInButton).click();
	}
}
