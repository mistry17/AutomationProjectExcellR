package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAcc {
	
	public WebDriver driver;
	
	public CreateNewAcc(WebDriver driver) {
		this.driver=driver;
	}

	By _firstName = By.cssSelector("#firstname");
	By _lastName = By.cssSelector("#lastname");
	By _emailAddress = By.cssSelector("#email_address");
	By _passWord = By.xpath("//input[@id='password']");
	By _confirmPassword = By.xpath("//input[@id='password-confirmation']");
	By _createAccountButton = By.xpath("//button[@title='Create an Account']");
	
	
	public void enterFirstName(String firstName) {
		driver.findElement(_firstName).sendKeys(firstName);
	}
	
	
	public void enterLastName(String lastName) {
		driver.findElement(_lastName).sendKeys(lastName);
	}
	
	public void enterEmailAddress(String email) {
		driver.findElement(_emailAddress).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(_passWord).sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(_confirmPassword).sendKeys(confirmPassword);
	}
	
	public void clickOnCreateAccountButton() {
		driver.findElement(_createAccountButton).click();
	}
}

