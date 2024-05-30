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
	
	By placeOrderButton = By.xpath("//ol[@id='checkoutSteps']/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/button[1]");
	By totalNumberOfItemsInCart = By.xpath("//div[@class='title']/strong[1]/span[1]");
	
	public void clickOnPlaceOrderButton() {
//		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Place Order')]")));
		WebElement placeOrder = driver.findElement(placeOrderButton);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", placeOrder);
//		driver.findElement(placeOrderButton).click();
	}
	
	public void getTotalNumberOfProductsAndAssertIt() {
		String num = driver.findElement(totalNumberOfItemsInCart).getText();
		Assert.assertEquals(num, home.totalProducts);
	}
}
