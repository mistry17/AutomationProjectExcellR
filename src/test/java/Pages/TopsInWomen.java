package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopsInWomen {

	public WebDriver driver;
	
	public TopsInWomen(WebDriver driver) {
		this.driver=driver;
	}
	
	By nonaFitnessTank = By.xpath("//img[@alt='Nona Fitness Tank']");
	By fitnessTankSize = By.xpath("(//div[@aria-label='XS'])[6]");
	By redColor = By.xpath("(//div[@id='option-label-color-93-item-58'])[2]");
	By addToCartButtonTank = By.xpath("(//span[text()='Add to Cart'])[6]");
	By styleDropDown = By.xpath("//div[contains(text(),'Style')]");
	By jacketsInStyle = By.xpath("//a[contains(text(),'Jacket ')]");
	By ecoCollectionDropDown = By.xpath("//div[contains(text(),'Eco Collection')]");
	By yesInEcoCollection = By.xpath("(//a[contains(text(),'Yes')])[1]");
	By sizeOfElementShell = By.xpath("(//div[@aria-label='XL'])[4]");
	By colorofElementShell = By.xpath("(//div[@id='option-label-color-93-item-56'])[2]");
	By addToCartButton = By.xpath("(//span[text()='Add to Cart'])[4]");
	By sizeOfFitnessTankEcoCollection = By.xpath("(//div[@class='swatch-option text'])[3]");
	By colorOfFitnessTankEcoCollection = By.xpath("(//div[@id='option-label-color-93-item-57'])[1]");
	By addToCartButtonFitnessTank = By.xpath("(//span[text()='Add to Cart'])[1]");
	
	public void addProduct() {
		driver.findElement(fitnessTankSize).click();
		driver.findElement(redColor).click();
		driver.findElement(addToCartButtonTank).click();
	}
	
	public void selectStyleDropDown() {
		driver.findElement(styleDropDown).click();
	}
	
	public void selectJacket() {
		driver.findElement(jacketsInStyle).click();
	}
	
	public void selectElementShellProduct() {
		driver.findElement(sizeOfElementShell).click();
		driver.findElement(colorofElementShell).click();
		driver.findElement(addToCartButton).click();
	}
	
	public void selectEcoCollectionAndSelectYes() {
		driver.findElement(ecoCollectionDropDown).click();
		driver.findElement(yesInEcoCollection).click();
	}
	
	public void addFitnessTankInCart() {
		driver.findElement(sizeOfFitnessTankEcoCollection).click();
		driver.findElement(colorOfFitnessTankEcoCollection).click();
		driver.findElement(addToCartButtonFitnessTank).click();
	}
}
