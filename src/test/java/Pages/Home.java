package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	public WebDriver driver;
	public Actions action;
	public String totalProducts;
	public WebDriverWait wait;
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	By signIn = By.xpath("//a[contains(text(),'Sign In')]"); 
	By createAnAccount = By.linkText("Create an Account");
	By cartIcon = By.linkText("My Cart");
	By whatsNew = By.xpath("//a[@id='ui-id-3']/span[1]");
	By womenDropDown = By.xpath("//a[@id='ui-id-4']");
	By menDropDown = By.xpath("//span[text()='Men']");
	By gearDropDown = By.xpath("//span[text()='Gear']");
	By trainingDropDown = By.xpath("//span[text()='Training']");
	By sale = By.xpath("//span[text()='Sale']");
	By closeIconOnPopUp = By.xpath("//div[@class='ea-stickybox-hide']");
	By cart = By.xpath("//header/div[2]/div[1]/a[1]");
	By proceedToCheckOutButton = By.id("top-cart-btn-checkout");
	By numberBesideCart = By.xpath("//span[@class='counter-number']");
	By searchBox = By.xpath("//input[@id='search']");
	By gymTeesSearchOption = By.xpath("//span[contains(text(),'gym tee')]");
	By sizeOfZoltanGymTee = By.xpath("(//div[@thumb-width='110']/following-sibling::div)[3]");
	By colorOfZoltanGymTee = By.xpath("(//div[@class='swatch-option color']/following-sibling::div)[2]");
	By addToCartButtonZoltanGymTee = By.xpath("(//span[text()='Add to Cart'])[1]");
	
	public void addProductToCart() {
		driver.findElement(sizeOfZoltanGymTee).click();
		driver.findElement(colorOfZoltanGymTee).click();
		driver.findElement(addToCartButtonZoltanGymTee).click();
	}
	
	public void search(String product) {
		driver.findElement(searchBox).sendKeys(product);
	}
	
	public void selectGymTeesInSearchOption() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'gym tee')]")));
		driver.findElement(gymTeesSearchOption).click();
	}
	
	public void getNumberOfProductsInCart() {
		totalProducts = driver.findElement(numberBesideCart).getText();
	}
	
	public void clickOnCartIconAndProceedToCheckOutButton() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[2]/div[1]/a[1]")));
		driver.findElement(cart).click();
		driver.findElement(proceedToCheckOutButton).click();
	}
	
	public void clickOnCreateAccount() {
		driver.findElement(createAnAccount).click();
	}
	
	public void clickOnSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void clickOnWhatsNew() {
		driver.findElement(whatsNew).click();
	}
	
	public void clickOnWomenDropDown() {
		driver.findElement(womenDropDown).click();
	}
	
	public void clickOnMenDropDown() {
		driver.findElement(menDropDown).click();
	}
	
	public void clickOnGearDropDown() {
		driver.findElement(gearDropDown).click();
	}
	
	public void clickOnTrainingDropDown() {
		driver.findElement(trainingDropDown).click();
	}
	
	public void clickOnSale() {
		driver.findElement(sale).click();
	}
	
//	public void selectTopsInWomenDropDown() {
//		action = new Actions(driver);
//		action.moveToElement((WebElement) womenDropDown).perform();
//		driver.findElement(topsInWomen).click();
//	}
//	
//	public void selectBottomInWomenDropDown() {
//		action.moveToElement((WebElement)womenDropDown).perform();
//		driver.findElement(bottomsInWomen).click();
//	}
//	
//	public void selectTopsInMenDropDown() {
//		action.moveToElement((WebElement) menDropDown).perform();
//		driver.findElement(topsInMen).click();
//	}
//	
//	public void selectBottomInMenDropDown() {
//		action.moveToElement((WebElement)menDropDown).perform();
//		driver.findElement(bottomsInMen).click();
//	}
//	
//	public void selectBagsInGear() {
//		action.moveToElement((WebElement)gearDropDown).perform();
//		driver.findElement(bagsInGear).click();
//	}
//	
//	public void selectFitnessEqipmentInGear() {
//		action.moveToElement((WebElement)gearDropDown).perform();
//		driver.findElement(fitnessEquipmentInGear).click();
//	}
//	
//	public void selectFitnessWatchesInGear() {
//		action.moveToElement((WebElement)gearDropDown).perform();
//		driver.findElement(watchesInGear).click();
//	}
	
	public void selectSale() {
		driver.findElement(sale).click();
	}
	
//	public void selectJacketsInTopsForWomen() {
//		action.moveToElement((WebElement) womenDropDown).perform();
//		action.moveToElement((WebElement)topsInWomen).perform();
//		driver.findElement(jacketsInTopsWomen).click();
//	}
//	
//	public void selectPantsInBottomsForWomen() {
//		action.moveToElement((WebElement) womenDropDown).perform();
//		action.moveToElement((WebElement)bottomsInWomen).perform();
//		driver.findElement(pantsInBottomsWomen).click();
//	}
//	
//	public void selectJacketsInTopsForMen() {
//		action.moveToElement((WebElement) menDropDown).perform();
//		action.moveToElement((WebElement)topsInMen).perform();
//		driver.findElement(jacketsInTopsMen).click();
//	}
//	
//	public void selectPantsInBottomsForMen() {
//		action.moveToElement((WebElement) menDropDown).perform();
//		action.moveToElement((WebElement)bottomsInMen).perform();
//		driver.findElement(pantsInBottomsMen).click();
//	}
	
	public void clickOnCrossIconOfPopUp() {
		driver.findElement(closeIconOnPopUp).click();
	}
	
}
