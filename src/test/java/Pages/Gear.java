package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Gear {

	public WebDriver driver;
	public Actions action;
	
	public Gear(WebDriver driver) {
		this.driver = driver;
	}
	
	By bags14 = By.linkText("Bags");
	By fitnessEquipment11 = By.linkText("Fitness Equipment");
	By watches9 = By.linkText("Watches");
	By addToCartButtonForFusionBackPack = By.xpath("//ol[@class='product-items widget-product-grid']/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]");
	By xButtonOfThePopUp = By.xpath("//div[contains(text(),'×')]");
	By priceOfSpriteFoamRoller = By.xpath("//span[@id='product-price-22']");
	By addToCartButtonOfSpriteFoamRoller = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
	By cartIcon = By.xpath("//div[@class='minicart-wrapper']/a[1]");
	By proceedToCheckOutButton = By.id("top-cart-btn-checkout");
	By fusionBackPackInCart = By.linkText("Fusion Backpack");
	By fusionBackPack = By.xpath("//ol[@class='product-items widget-product-grid']/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]");
	By foamRoller = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/a[1]/span[1]/span[1]/img[1]");
	
	
	
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
		action = new Actions(driver);
		action.moveToElement(spiritRoller).perform();
		Thread.sleep(3000);
		driver.findElement(addToCartButtonOfSpriteFoamRoller).click();
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
