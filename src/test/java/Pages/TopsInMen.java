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
	
	By sortByDropDown = By.xpath("(//select[@id='sorter'])[1]");
	By styleDropDownMen = By.xpath("//div[contains(text(),'Style')]");
	By categoryDropDownMen = By.xpath("//div[contains(text(),'Category')]");
	By tanksInCategoryDropDown = By.xpath("//a[contains(text(),'Tanks')]");
	By sizeOfSinbadFitnessTankProduct = By.xpath("(//div[@aria-label='XL'])[4]");
	By blueColorSinbadFitnessTank = By.xpath("(//div[@id='option-label-color-93-item-50'])[3]");
	By addToCartButtonSinbadFitnessTank = By.xpath("(//span[text()='Add to Cart'])[4]");
	By hoodedInStyleDropDown = By.xpath("//a[contains(text(),'Hooded')]");
	By sizeOfWindJacketInHooded = By.xpath("(//div[@aria-label='XL'])[1]");
	By blackColorOfWindJacket = By.xpath("(//div[@id='option-label-color-93-item-49'])[1]");
	By addToCartButtonWindJacket = By.xpath("//span[text()='Add to Cart']");
	
	// for sort by drop down choose product name and select aero daily fitness tee
	By sizeOfAeroDailyFitnessTee = By.xpath("(//div[@aria-label='L'])[2]");
	By colorOfAeroDailyFitnessTee = By.xpath("//div[@id='option-label-color-93-item-51']");
	By addToCartButtonforAeroDailyFitnessTee = By.xpath("(//span[text()='Add to Cart'])[2]");
	
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
