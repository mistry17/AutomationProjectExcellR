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
	
	By sortByDropDown = By.xpath("//div[@class='column main']/div[2]/div[4]/select[1]");
	By nextPageButton = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[4]/div[2]/ul[1]/li[3]/a[1]");
	By sizeOfAetherGymPant = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By colorOfAetherGymPant = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");
	By addToCartButtonForAetherGymPant = By.xpath("//ol[@class=@class='products list items product-items']/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By colorDropDownBottomsMen = By.xpath("//div[contains(text(),'Color')]");
	By redColorInColorDropDown = By.xpath("//div[@class='filter-options']/div[5]/div[2]/div[1]/div[1]/a[8]/div[1]");
	By sizeOfLonaYogaShortInRed = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]");
	By addToCartButtonForLonaYogaShort = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By climateDropDown = By.xpath("//div[contains(text(),'Climate')]");
	By allWeatherOptionInClimateDropDown = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/ol[1]/li[1]/a[1]");
	By colorOfLonaYogaPants = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]");
	
	// select product name in dropdown and select a product
	
	By sizeOfCaesarWarmUpPants = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]");
	By colorOfCaesarWarmUpPants = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
	By addToCartButtonForCaesarWarmUpPants = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
	

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
