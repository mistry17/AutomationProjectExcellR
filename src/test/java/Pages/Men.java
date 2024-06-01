package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Men {

	public WebDriver driver;
	
	public Men(WebDriver driver) {
		this.driver = driver;
	}
	
	By tops48 = By.linkText("Tops");
	By bottoms24 = By.xpath("//a[contains(text(),'Bottoms')]");
	By shopPerformanceButton = By.xpath("//span[@class='more button']");
	By tanks = By.linkText("Tanks");
	By shorts = By.linkText("Shorts");
	By sizeArgusTank = By.xpath("(//div[@option-id='168']/following-sibling::div)[1]");
	By sizeOfHeroHoddieInMen = By.xpath("(//div[text()='M'])[2]");
	By colorOfHeroHoddieInMen = By.xpath("(//div[@aria-label='Black']/following-sibling::div)[1]");
	By addToCartButtonForHeroHoodie = By.xpath("(//span[text()='Add to Cart'])[2]");
	
	
	public void selectTops48() {
		driver.findElement(tops48).click();
	}
	
	public void selectBottoms24() {
		driver.findElement(bottoms24).click();;
	}
	
	public void clickOnShopPerformanceButton() {
		driver.findElement(shopPerformanceButton).click();
	}
	
	public void clickOnTanksInMen() {
		driver.findElement(tanks).click();
	}
	
	public void clickOnShortsInMen() {
		driver.findElement(shorts).click();
	}
	
	public void addHeroHoodieInTheCart() {
		driver.findElement(sizeOfHeroHoddieInMen).click();
		driver.findElement(colorOfHeroHoddieInMen).click();
		driver.findElement(addToCartButtonForHeroHoodie).click();
	}
	

}
