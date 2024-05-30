package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopsInWomen {

	public WebDriver driver;
	
	public TopsInWomen(WebDriver driver) {
		this.driver=driver;
	}
	
	By nonaFitnessTank = By.xpath("//img[@alt='Nona Fitness Tank']");
	By fitnessTankSize = By.xpath("//ol[1]/li[6]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By redColor = By.xpath("//ol[1]/li[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");
	By addToCartButtonTank = By.xpath("//ol[1]/li[6]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By styleDropDown = By.xpath("//div[contains(text(),'Style')]");
	By jacketsInStyle = By.xpath("//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ol[1]/li[2]/a[1]");
	By ecoCollectionDropDown = By.xpath("//div[contains(text(),'Eco Collection')]");
	By yesInEcoCollection = By.xpath("//main[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[6]/div[2]/ol[1]/li[1]/a[1]");
	By sizeOfElementShell = By.xpath("//div[@class='swatch-opt-1348']/div[1]/div[1]/div[5]");
	By colorofElementShell = By.xpath("//ol[@class='products list items product-items']/li[4]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]");
	By addToCartButton = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[4]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]");
	By sizeOfFitnessTankEcoCollection = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]");
	By colorOfFitnessTankEcoCollection = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]");
	By addToCartButtonFitnessTank = By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
	
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
