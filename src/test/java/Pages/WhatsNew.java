package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class WhatsNew {

	public WebDriver driver;
	
	public WhatsNew(WebDriver driver) {
		this.driver = driver;
	}
	
	By jacketsNewInWomen = By.linkText("Jackets");
	By teesNewInMen = By.linkText("Tees");
	By shopNewYogaButton = By.xpath("//span[@class='more button']");
	By neveJacket = By.xpath("//div[@class='products wrapper grid products-grid']/ol[1]/li[3]");
	By addToCartButton = By.id("product-addtocart-button");
	By largeSize = By.id("option-label-size-143-item-169");
	By blueColor = By.id("option-label-color-93-item-50");
	By _quantity = By.id("qty");
	Actions action;
	
	public void clickOnJackets() {
		driver.findElement(jacketsNewInWomen).click();
	}
	
	public void clickOnTees() {
		driver.findElement(teesNewInMen).click();
	}
	
	public void clickOnShopNewYoga() {
		driver.findElement(shopNewYogaButton).click();
	}
	
	public void clickOnTheNeveJacket() {
		driver.findElement(neveJacket).click();
	}
	
	public void clickOnAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	
	public void clickOnBlueColor() {
		driver.findElement(blueColor).click();
	}
	
	public void clickOnLargeSize() {
		driver.findElement(largeSize).click();
	}
	
	public void increaseQunatityByTwo(String quantity) {
		driver.findElement(_quantity).click();
		action = new Actions(driver);
		action.keyDown(Keys.BACK_SPACE);
		action.keyUp(Keys.BACK_SPACE);
		action.sendKeys(quantity).build().perform();
	}
}
