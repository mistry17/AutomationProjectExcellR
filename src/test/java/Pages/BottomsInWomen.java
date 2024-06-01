package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BottomsInWomen {
	
	public WebDriver driver;
	public Select select;
	public WebDriverWait wait;
	
	public BottomsInWomen(WebDriver driver) {
		this.driver = driver;
	}
	
	By categoryDropDown = By.xpath("//div[contains(text(),'Category')]");
	By pantsInCategoryDropDown = By.xpath("//a[contains(.,'Pants 13')]");
	By sizeOfBardotCapri = By.xpath("(//div[@aria-label='29'])[2]");
	By redColorBardotCapri = By.xpath("(//div[@id='option-label-color-93-item-58'])[2]");
	By addToCartBardotCapri = By.xpath("(//span[text()='Add to Cart'])[2]");
	By styleDropDown = By.xpath("//div[contains(text(),'Style')]");
	By leggingsInStyleDropDown = By.xpath("//a[contains(text(),'Leggings')]");
	By materialDropDown = By.xpath("//div[contains(text(),'Material')]");
	By cottonInMaterial = By.xpath("(//a[contains(text(),'Cotton')])[1]");
	By sortByDropDown = By.xpath("(//select[@id='sorter'])[1]");
	By sizeOfBasicCapri = By.xpath("(//div[@class='swatch-option text']/following-sibling::div)[1]");
	By colorOfBasicCapri = By.xpath("(//div[@option-id='49']/following-sibling::div)[1]");
	By addToCartButtonBasicCapri = By.xpath("(//span[text()='Add to Cart'])[1]");
	By sizeOfDrawstringShort = By.xpath("(//div[@aria-label='28'])[3]");
	By colorOfDrawstringShort = By.xpath("(//div[@id='option-label-color-93-item-60'])[2]");
	By addToCartButtonDrawstringShort = By.xpath("(//span[text()='Add to Cart'])[3]");
	// for sorting use price option and select drawstring short product
	
	public void selectLeggingsInStyleDropDown() throws InterruptedException {
		driver.findElement(styleDropDown).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(leggingsInStyleDropDown));
		driver.findElement(leggingsInStyleDropDown).click();
		Thread.sleep(3000);	
	}
	
	public void selectCottonInMaterialDropDown() throws InterruptedException {
		driver.findElement(materialDropDown).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cottonInMaterial));
		Thread.sleep(3000);
		driver.findElement(cottonInMaterial).click();
		Thread.sleep(3000);
	}
	
	public void selectBasicCapriProduct() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(sizeOfBasicCapri));
		driver.findElement(sizeOfBasicCapri).click();
		driver.findElement(colorOfBasicCapri).click();
		driver.findElement(addToCartButtonBasicCapri).click();
	}
	
	public void selectPantsInCategoryDropDownAndAddProduct() {
		driver.findElement(categoryDropDown).click();
		driver.findElement(pantsInCategoryDropDown).click();
		driver.findElement(sizeOfBardotCapri).click();
		driver.findElement(redColorBardotCapri).click();
		driver.findElement(addToCartBardotCapri).click();
	}
	
	public void selectPriceInSortByDropDownAndAddProduct() {
		driver.findElement(sortByDropDown).click();
		WebElement dropDown = driver.findElement(sortByDropDown);
		select = new Select(dropDown);
		select.selectByValue("price");
		driver.findElement(sizeOfDrawstringShort).click();
		driver.findElement(colorOfDrawstringShort).click();
		driver.findElement(addToCartButtonDrawstringShort).click();
	}
	
}

