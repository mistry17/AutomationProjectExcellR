package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shipping {

	public WebDriver driver;
	public Select select;
	public Actions action;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public Shipping(WebDriver driver) {
		this.driver = driver;
	}
	
	By addressInputBox = By.xpath("//input[@id='DESD7GR']");
	By cityInputBox = By.xpath("//input[@id='NBIL33C']");
	By stateDropDown = By.id("IXOEQYS");
	By postalCodeInputBox = By.id("W5NHP3K");
	By countryDropDown = By.id("QBGUXO2");
	By phoneNumberDropDown = By.id("U161NGB");
	By nextButton = By.xpath("//span[text()='Next']");
	
	public void addAddress(String address) {
		driver.findElement(addressInputBox).sendKeys(address);
	}
	
	public void addCity(String city) {
		driver.findElement(cityInputBox).sendKeys(city);
	}
	
	public void selectState(String state) {
		select = new Select((WebElement) stateDropDown);
		select.selectByVisibleText(state);
	}
	
	public void addPostalCode(String code) {
		driver.findElement(postalCodeInputBox).sendKeys(code);
	}
	
	public void selectCountry(String country) {
		select = new Select((WebElement)countryDropDown);
		select.selectByVisibleText(country);
	}
	
	public void addPhoneNumber(String number) {
		driver.findElement(phoneNumberDropDown).sendKeys(number);
	}
	
	public void clickOnNextButton() {
		WebElement nextB = driver.findElement(nextButton);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",nextB);
		driver.findElement(nextButton).click();
	}
	
	
}
