package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class ReviewsAndPayment {

	public WebDriver driver;
	public Home home;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public ReviewsAndPayment(WebDriver driver) {
		this.driver = driver;
	}
	
	By placeOrderButton = By.xpath("//span[text()='Place Order']");
	
	public void clickOnPlaceOrderButton() {
//		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Place Order')]")));
		WebElement placeOrder = driver.findElement(placeOrderButton);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", placeOrder);
//		driver.findElement(placeOrderButton).click();
	}
}
