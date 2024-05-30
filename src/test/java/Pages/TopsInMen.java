package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TopsInMen {

	public WebDriver driver;
	public Select select;
	
	public TopsInMen(WebDriver driver) {
		this.driver = driver;
	}
	
	By sortByDropDown = By.xpath("//div[@class='column main']/div[2]/div[4]/select[1]");
	By styleDropDownMen = By.xpath("//div[contains(text(),'Style')]");
	By categoryDropDownMen = By.xpath("//div[contains(text(),'Category')]");
	By tanksInCategoryDropDown = By.xpath("//div[@class='sidebar sidebar-main']/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[4]");
	By sizeOfSinbadFitnessTankProduct = By.xpath("//div[@class='products wrapper grid products-grid']/ol[1]/li[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]");
	By blueColorSinbadFitnessTank = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
	By addToCartButtonSinbadFitnessTank = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By hoodedInStyleDropDown = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ol[1]/li[4]/a[1]");
	By sizeOfWindJacketInHooded = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]");
	By blackColorOfWindJacket = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
	By addToCartButtonWindJacket = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
	// for sort by drop down choose product name and select aero daily fitness tee
	By sizeOfAeroDailyFitnessTee = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]");
	By colorOfAeroDailyFitnessTee = By.xpath("//div[@id='option-label-color-93-item-51']");
	By addToCartButtonforAeroDailyFitnessTee = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
	public void selectTanksInCategoryDropDownAndCategoryInTopsMen() {
		driver.findElement(categoryDropDownMen).click();
		driver.findElement(tanksInCategoryDropDown).click();
	}
	
	public void addProductFromTanksInCategoryDropDown() {
		driver.findElement(sizeOfSinbadFitnessTankProduct).click();
		driver.findElement(blueColorSinbadFitnessTank).click();
		driver.findElement(addToCartButtonSinbadFitnessTank).click();
	}
	
	public void selectHoodedInStyleAndStyleDropDownInTopsMen() {
		driver.findElement(styleDropDownMen).click();
		driver.findElement(hoodedInStyleDropDown).click();
	}
	
	public void addProductFromHoodedInStyleDropDown() {
		driver.findElement(sizeOfWindJacketInHooded).click();
		driver.findElement(blackColorOfWindJacket).click();
		driver.findElement(addToCartButtonWindJacket).click();
	}
	
	public void selectProductNameInSortByDropDown() {
		WebElement productNameInSortByDropDown = driver.findElement(sortByDropDown);
		select = new Select(productNameInSortByDropDown);
		select.selectByIndex(1);
	}
	
	public void addAeroDailyFitnessTeeInCartPresentInProductName() {
		driver.findElement(sizeOfAeroDailyFitnessTee).click();
		driver.findElement(colorOfAeroDailyFitnessTee).click();
		driver.findElement(addToCartButtonforAeroDailyFitnessTee).click();
	}
}
