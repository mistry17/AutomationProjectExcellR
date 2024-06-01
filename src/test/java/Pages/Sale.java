package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sale {
	
	public WebDriver driver;
	
	public Sale(WebDriver driver) {
		this.driver = driver;
	}
	
	By shopWomensDealButton = By.xpath("//span[contains(text(),'Shop Women’s Deals')]");
	By sizeOfAntoniaRacerTankInWomenSale = By.xpath("(//div[@aria-label='M'])[2]");
	By colorOfAntoniaRacerTankInWomenSale = By.xpath("(//div[@id='option-label-color-93-item-49'])[1]");
	By addToCartButtonForAntoniaRacerTankInWomenSale = By.xpath("(//span[text()='Add to Cart'])[4]");
	By mensBargainPicture = By.xpath("//span[contains(text(),'Stretch your budget with active attire')]");
	By sizeOfFitnessShort = By.xpath("(//div[@aria-label='32'])[2]");
	By colorOfFitnessShort = By.xpath("(//div[@id='option-label-color-93-item-49'])[2]");
	By addToCartButtonOfFitnessShort = By.xpath("(//span[text()='Add to Cart'])[2]");
	By priceDropDownInMaleSale = By.xpath("//div[text()='Price']");
	By twentyDollarPriceInPriceDropdownMensSale = By.xpath("//span[text()='$20.00']");
	By sizeOfGymShortInPrice20Dollars = By.xpath("//div[@id='option-label-size-143-item-178']");
	By blackColorOfGymShortInPrice20Dollars = By.xpath("//div[@id='option-label-color-93-item-49']");
	By addToCartButtonForGymShort = By.xpath("//span[contains(text(),'Add to Cart')]");
	By sortByDropDown = By.xpath("(//select[@id='sorter'])[1]");
	By priceInSortByDropDown = By.xpath("(//option[@value='price'])[1]");
	By sizeOfTiffanyFitnessTee = By.xpath("(//div[@option-id='166']/following-sibling::div)[1]");
	By colorOfTiffanyFitnessTee = By.xpath("//div[@aria-label='Red']/following-sibling::div[1]");
	By addToCartButtonOfTiffanyFitnessTee = By.xpath("(//span[text()='Add to Cart'])[3]");
	
	
	public void selectShopWomensDealButton() {
		driver.findElement(shopWomensDealButton).click();
	}
	
	public void selectPriceInSortByDropDown() {
		driver.findElement(sortByDropDown).click();
		driver.findElement(priceInSortByDropDown).click();
	}
	
	public void selectTiffanyFitnessTeeInPrice() {
		driver.findElement(sizeOfTiffanyFitnessTee).click();
		driver.findElement(colorOfTiffanyFitnessTee).click();
		driver.findElement(addToCartButtonOfTiffanyFitnessTee).click();
	}
	
	public void selectAntoniaRacerTankInWomensSale() {
		driver.findElement(sizeOfAntoniaRacerTankInWomenSale).click();
		driver.findElement(colorOfAntoniaRacerTankInWomenSale).click();
		driver.findElement(addToCartButtonForAntoniaRacerTankInWomenSale).click();
	}
	
	public void clickOnShopMensDealImage() {
		driver.findElement(mensBargainPicture).click();
	}
	
	public void addFitnessShortInCart() {
		driver.findElement(sizeOfFitnessShort).click();
		driver.findElement(colorOfFitnessShort).click();
		driver.findElement(addToCartButtonOfFitnessShort).click();
	}
	
	public void selectPriceDropDownAndSelect20Dollar() {
		driver.findElement(priceDropDownInMaleSale).click();
		driver.findElement(twentyDollarPriceInPriceDropdownMensSale).click();
	}
	
	public void selectGymShortIn20DollarPrice() {
		driver.findElement(sizeOfGymShortInPrice20Dollars).click();
		driver.findElement(blackColorOfGymShortInPrice20Dollars).click();
		driver.findElement(addToCartButtonForGymShort).click();
	}
}
