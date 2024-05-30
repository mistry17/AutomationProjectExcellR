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
	By sizeArgusTank = By.xpath("//body/div[2]/main[1]/div[4]/div[1]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]");
	By sizeOfHeroHoddieInMen = By.xpath("//ol[@class='product-items widget-product-grid']/li[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]");
	By colorOfHeroHoddieInMen = By.xpath("//ol[@class='product-items widget-product-grid']/li[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
	By addToCartButtonForHeroHoodie = By.xpath("//ol[@class='product-items widget-product-grid']/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
	
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
