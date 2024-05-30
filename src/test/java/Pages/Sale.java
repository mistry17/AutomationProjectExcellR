package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sale {
	
	public WebDriver driver;
	
	public Sale(WebDriver driver) {
		this.driver = driver;
	}
	
	By shopWomensDealButton = By.xpath("//span[contains(text(),'Shop Women’s Deals')]");
	By sizeOfAntoniaRacerTankInWomenSale = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]");
	By colorOfAntoniaRacerTankInWomenSale = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
	By addToCartButtonForAntoniaRacerTankInWomenSale = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By mensBargainPicture = By.xpath("//span[contains(text(),'Stretch your budget with active attire')]");
	By sizeOfFitnessShort = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
	By colorOfFitnessShort = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
	By addToCartButtonOfFitnessShort = By.xpath("//ol[@class='products list items product-items']/li[2]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By priceDropDownInMaleSale = By.xpath("//div[text()='Price']");
	By twentyDollarPriceInPriceDropdownMensSale = By.xpath("//span[text()='$20.00']");
	By sizeOfGymShortInPrice20Dollars = By.xpath("//div[@id='option-label-size-143-item-178']");
	By blackColorOfGymShortInPrice20Dollars = By.xpath("//div[@id='option-label-color-93-item-49']");
	By addToCartButtonForGymShort = By.xpath("//span[contains(text(),'Add to Cart')]");
	By sortByDropDown = By.xpath("//div[@class='columns']/div[1]/div[2]/div[4]/select[1]");
	By priceInSortByDropDown = By.xpath("//div[@class='columns']/div[1]/div[2]/div[4]/select[1]/option[3]");
	By sizeOfTiffanyFitnessTee = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]");
	By colorOfTiffanyFitnessTee = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]");
	By addToCartButtonOfTiffanyFitnessTee = By.xpath("//ol[@class='products list items product-items']/li[3]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
	
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
