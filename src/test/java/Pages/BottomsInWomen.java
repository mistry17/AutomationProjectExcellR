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
	By pantsInCategoryDropDown = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ol[1]/li[1]/a[1]");
	By sizeOfBardotCapri = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
	By redColorBardotCapri = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");
	By addToCartBardotCapri = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[6]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By styleDropDown = By.xpath("//div[contains(text(),'Style')]");
	By leggingsInStyleDropDown = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ol[1]/li[5]/a[1]");
	By materialDropDown = By.xpath("//div[contains(text(),'Material')]");
	By cottonInMaterial = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[6]/div[2]/ol[1]/li[1]/a[1]");
	By sortByDropDown = By.xpath("//div[@class='column main']/div[2]/div[4]/select[1]");
	By sizeOfBasicCapri = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
	By colorOfBasicCapri = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
	By addToCartButtonBasicCapri = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By sizeOfDrawstringShort = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
	By colorOfDrawstringShort = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]");
	By addToCartButtonDrawstringShort = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
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

