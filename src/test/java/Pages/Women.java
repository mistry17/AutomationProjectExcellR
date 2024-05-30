package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Women {

	public WebDriver driver;
	
	public Women(WebDriver driver) {
		this.driver = driver;
	}
	
	By tops50 = By.linkText("Tops");
	By bottoms25 = By.linkText("Bottoms"); 
	By hoddiesAndSweatShirt = By.linkText("Hoodies & Sweatshirts");
	By pants = By.linkText("Pants");
	By yogaHoddieSize = By.xpath("//ol[@class='product-items widget-product-grid']/li[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]");
	By addToCartButtonYogaHoddie = By.xpath("//ol[1]/li[3]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]");
	By yogaHoddie = By.xpath("//img[@alt='Selene Yoga Hoodie']");
	By colorOfYogaHoddie = By.xpath("//ol[@class='product-items widget-product-grid']/li[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
	
	public void clickOnTop50InWomen() {
		driver.findElement(tops50).click();
	}
	
	public void clickOnBottoms25() {
		driver.findElement(bottoms25).click();
	}
	
	public void clickOnHoddiesAndSweatShirt() {
		driver.findElement(hoddiesAndSweatShirt).click();
	}
	
	public void clickOnPantsInWomen() {
		driver.findElement(pants).click();
	}
	
	public void clickOnSizeOfProduct() {
		driver.findElement(yogaHoddieSize).click();
	}
	
	public void clickOnAddToCartButton() {
		driver.findElement(addToCartButtonYogaHoddie).click();
	}
	
	public void clickOnColorOfYogaHoddie() {
		driver.findElement(colorOfYogaHoddie).click();
	}
}
