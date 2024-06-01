package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Gear {

	public WebDriver driver;
	public Actions action;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public Gear(WebDriver driver) {
		this.driver = driver;
	}
	
	By bags14 = By.linkText("Bags");
	By fitnessEquipment11 = By.linkText("Fitness Equipment");
	By watches9 = By.linkText("Watches");
	By addToCartButtonForFusionBackPack = By.xpath("(//span[text()='Add to Cart'])[1]");
	By xButtonOfThePopUp = By.xpath("//div[contains(text(),'×')]");
	By priceOfSpriteFoamRoller = By.xpath("//span[@id='product-price-22']");
	By addToCartButtonOfSpriteFoamRoller = By.xpath("(//span[text()='Add to Cart'])[4]");
	By cartIcon = By.xpath("//div[@class='minicart-wrapper']/a[1]");
	By proceedToCheckOutButton = By.id("top-cart-btn-checkout");
	By fusionBackPackInCart = By.linkText("Fusion Backpack");
	By fusionBackPack = By.xpath("(//li[@class='product-item'])[1]");
	By foamRoller = By.xpath("(//li[contains(@class,'item product')]/following-sibling::li)[3]");
	
	
	
	public void clickOnBags14() {
		driver.findElement(bags14).click();
	}
	
	public void clickOnFitnessEquipment() {
		driver.findElement(fitnessEquipment11).click();
	}
	
	public void clickOnWatches() {
		driver.findElement(watches9).click();
	}
	
	public void clickOnAddToCartButtonOfFusionBackPack() {
		WebElement fusionBackpack = driver.findElement(fusionBackPack);
		action = new Actions(driver);
		action.moveToElement(fusionBackpack).perform();
		driver.findElement(addToCartButtonForFusionBackPack).click();
	}
	
	public void closeThePopUp() {
		driver.findElement(xButtonOfThePopUp).click();
	}
	
	public void verifyThePriceOfSpriteFoamRoller(String price) {
		String priceOfRoller = driver.findElement(priceOfSpriteFoamRoller).getText();
		Assert.assertEquals(price, priceOfRoller);
	}
	
	public void clickOnAddToCartButton() throws InterruptedException {
		WebElement spiritRoller = driver.findElement(foamRoller);
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(foamRoller));
		action = new Actions(driver);
		action.moveToElement(spiritRoller).perform();
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
	}
	
	public void clickOnCart() {
		driver.findElement(cartIcon).click();
	}
	
	public void clickOnProceedToCheckOutButton() {
		driver.findElement(proceedToCheckOutButton).click();
	}
	
	public void verifyFusionBackPackInCart() {
		String backPack = driver.findElement(fusionBackPackInCart).getText();
		Assert.assertEquals("Fusion Backpack", backPack);
	}
	
}
