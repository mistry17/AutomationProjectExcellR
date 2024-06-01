package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BottomsInMen {

	public WebDriver driver;
	public Select select;
	public JavascriptExecutor js;
	
	public BottomsInMen(WebDriver driver) {
		this.driver=driver;
	}
	
	By sortByDropDown = By.xpath("(//label[@class='sorter-label']/following-sibling::select)[1]");
	By nextPageButton = By.xpath("(//li[@class='item pages-item-next']//a)[2]");
	By sizeOfAetherGymPant = By.xpath("(//div[text()='32'])[2]");
	By colorOfAetherGymPant = By.xpath("//div[@option-id='51']/following-sibling::div[1]");
	By addToCartButtonForAetherGymPant = By.xpath("(//button[contains(@class,'action tocart')]//span)[2]");
	By colorDropDownBottomsMen = By.xpath("//div[contains(text(),'Color')]");
	By redColorInColorDropDown = By.xpath("//a[@aria-label='Red']//div[1]");
	By sizeOfLonaYogaShortInRed = By.xpath("(//div[@index='2']/following-sibling::div)[3]");
	By addToCartButtonForLonaYogaShort = By.xpath("(//button[@title='Add to Cart']//span)[3]");
	By climateDropDown = By.xpath("//div[contains(text(),'Climate')]");
	By allWeatherOptionInClimateDropDown = By.xpath("//a[contains(text(),'All-Weather')]");
	By colorOfLonaYogaPants = By.xpath("(//div[@id='option-label-color-93-item-50']/following-sibling::div)[3]");
	
	// select product name in dropdown and select a product
	
	By sizeOfCaesarWarmUpPants = By.xpath("(//div[@aria-label='33'])[4]");
	By colorOfCaesarWarmUpPants = By.xpath("(//div[@id='option-label-color-93-item-49'])[3]");
	By addToCartButtonForCaesarWarmUpPants = By.xpath("(//span[text()='Add to Cart'])[4]");
	
	

	public void clickOnNextPageButtonPresentAtTheBottom() {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(nextPageButton).click();
	}
	
	public void addAetherGymPantToCart() {
		driver.findElement(sizeOfAetherGymPant).click();
		driver.findElement(colorOfAetherGymPant).click();
		driver.findElement(addToCartButtonForAetherGymPant).click();
	}
	
	public void clickOnColorDropDownAndSelectRedColor() {
		driver.findElement(colorDropDownBottomsMen).click();
		driver.findElement(redColorInColorDropDown).click();
	}
	
	public void addLonaYogaPantsInCart() {
		driver.findElement(sizeOfLonaYogaShortInRed).click();
		driver.findElement(addToCartButtonForLonaYogaShort).click();
	}
	
	public void clickOnClimateDropDownAndSelectAllWeather() {
		driver.findElement(climateDropDown).click();
		driver.findElement(allWeatherOptionInClimateDropDown).click();
	}
	
	public void addProductForAllClimatesInCart() {
		driver.findElement(sizeOfLonaYogaShortInRed).click();
		driver.findElement(colorOfLonaYogaPants).click();
		driver.findElement(addToCartButtonForLonaYogaShort).click();
	}
	
	public void selectProductNameInSortByDropDown() {
		driver.findElement(sortByDropDown).click();
		WebElement sortingDropDown = driver.findElement(sortByDropDown);
		select = new Select(sortingDropDown);
		select.selectByIndex(1);
	}
	
	public void addProductAfterSortingByProductsName() {
		driver.findElement(sizeOfCaesarWarmUpPants).click();
		driver.findElement(colorOfCaesarWarmUpPants).click();
		driver.findElement(addToCartButtonForCaesarWarmUpPants).click();
	}
}
