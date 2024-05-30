package Cases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BottomsInMen;
import Pages.BottomsInWomen;
import Pages.CreateNewAcc;
import Pages.Gear;
import Pages.Home;
import Pages.Men;
import Pages.ReviewsAndPayment;
import Pages.Sale;
import Pages.Shipping;
import Pages.SignIn;
import Pages.TopsInMen;
import Pages.TopsInWomen;
import Pages.WhatsNew;
import Pages.Women;

public class TestCases {

	public WebDriver driver;
	public Home home;
	public CreateNewAcc acc;
	public SignIn signIn;
	public Women women;
	public WhatsNew whatsNew;
	public JavascriptExecutor js;
	public TopsInWomen topsInWomen;
	public BottomsInWomen bottomsInWomen;
	public TopsInMen topsInMen;
	public Men men;
	public BottomsInMen bottomsInMen;
	public Gear gear;
	public Sale sale;
	public Shipping shipping;
	public ReviewsAndPayment reviewAndPayment;
	public boolean testPassed = true;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	//1
	@Test
	public void createAnAccount() {
		try{
			home = new Home(driver);
			home.clickOnCreateAccount();
			acc = new CreateNewAcc(driver);
			acc.enterFirstName("Dharmik");
			acc.enterLastName("Mistry");
			acc.enterEmailAddress("dharmik@gmail.com");
			acc.enterPassword("Dharmik17");
			acc.enterConfirmPassword("Dharmik17");
			acc.clickOnCreateAccountButton();
			}
		catch(Exception e) {
			testPassed = false;
			e.printStackTrace();
		}
	}
	
	//2
//	@Test
	public void createAnAccountWithoutLastName() throws InterruptedException {
		try{
			home = new Home(driver);
		home = new Home(driver);
		home.clickOnCreateAccount();
		acc = new CreateNewAcc(driver);
		acc.enterFirstName("Dharmik");
		acc.enterEmailAddress("dharmik@gmail.com");
		acc.enterPassword("Dharmik17");
		acc.enterConfirmPassword("Dharmik17");
		Thread.sleep(3000);
		acc.clickOnCreateAccountButton();
	}
		catch(Exception e) {
			testPassed = false;
			e.printStackTrace();
		}
	}
	
	//3
	@Test
	public void signInWithValidCredentials() {
		try{
		home = new Home(driver);
		home.clickOnSignIn();
		signIn = new SignIn(driver);
		signIn.enterEmail("dharmik@gmail.com");
		signIn.enterPassword("Dharmik17");
		signIn.clickSignInButton();
		}
		catch(Exception e) {
			testPassed = false;
			e.printStackTrace();
		}
	}
	
	
	//4
	@Test
	public void signInWithoutPassword() {
		try {
			home = new Home(driver);
			home.clickOnSignIn();
			signIn = new SignIn(driver);
			signIn.enterEmail("dharmik@gmail.com");
			signIn.enterPassword("");
			Thread.sleep(4000);
			signIn.clickSignInButton();
			Thread.sleep(4000);
		}
		catch(Exception e) {
			testPassed = false;
			e.printStackTrace();
		}
	}
	
	//5
	@Test
	public void clickOnWhatsNewThenClickJacketAndAddProduct() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWhatsNew();
		whatsNew = new WhatsNew(driver);
		whatsNew.clickOnJackets();
		whatsNew.clickOnTheNeveJacket();
		whatsNew.clickOnLargeSize();
		whatsNew.clickOnBlueColor();
		whatsNew.increaseQunatityByTwo("2");
		whatsNew.clickOnAddToCartButton();
	}
	
	//6
	@Test
	public void closeThePopUpOnTheHomePage() {
		home = new Home(driver);
		home.clickOnCrossIconOfPopUp();
	}
	
	//7
	@Test
	public void clickOnWomenAndAddProductToCart() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		Thread.sleep(3000);
		women = new Women(driver);
		women.clickOnSizeOfProduct();
		women.clickOnColorOfYogaHoddie();
		women.clickOnAddToCartButton();
	}
	
	//8
	@Test
	public void selectProductAddTOCartInTop50Women() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnTop50InWomen();
		topsInWomen = new TopsInWomen(driver);
		topsInWomen.addProduct();
	}
	
	//9
	@Test
	public void selectProductInJacketInStyleDropDown() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnTop50InWomen();
		topsInWomen = new TopsInWomen(driver);
		topsInWomen.selectStyleDropDown();
		topsInWomen.selectJacket();
		topsInWomen.selectElementShellProduct();
	}
	
	//10
	@Test
	public void selectYesInEcoCollectionDropDownAndAddAProduct() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnTop50InWomen();
		topsInWomen = new TopsInWomen(driver);
		topsInWomen.selectEcoCollectionAndSelectYes();
		topsInWomen.addFitnessTankInCart();
	}
	
	//11
	@Test(priority=1)
	public void selectLeggingsInStyleAndCottonInMaterialDropDownAndAddProductToCart() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnBottoms25();
		bottomsInWomen = new BottomsInWomen(driver);
		bottomsInWomen.selectLeggingsInStyleDropDown();
		bottomsInWomen.selectCottonInMaterialDropDown();
		bottomsInWomen.selectBasicCapriProduct();
		
	}
	
	//12
	@Test
	public void selectPantsInCategoryDropDownAndAddProductInCart() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnBottoms25();
		bottomsInWomen = new BottomsInWomen(driver);
		bottomsInWomen.selectPantsInCategoryDropDownAndAddProduct();
	}
	
	//13
	@Test
	public void selectPriceInSortByDropDownAndAddProductInCart() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnWomenDropDown();
		women = new Women(driver);
		women.clickOnBottoms25();
		bottomsInWomen = new BottomsInWomen(driver);
		bottomsInWomen.selectPriceInSortByDropDownAndAddProduct();
	}
	
	//14
	@Test
	public void addProductFromTankInCategoryDropDown() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectTops48();
		topsInMen = new TopsInMen(driver);
		topsInMen.selectTanksInCategoryDropDownAndCategoryInTopsMen();
		topsInMen.addProductFromTanksInCategoryDropDown();
	}

	//15
	@Test
	public void addProductFromHoddedInStyleDropDown() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectTops48();
		topsInMen = new TopsInMen(driver);
		topsInMen.selectHoodedInStyleAndStyleDropDownInTopsMen();
		topsInMen.addProductFromHoodedInStyleDropDown();
	}
	
	//16
	@Test
	public void addProductAfterSortingByProductName() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectTops48();
		topsInMen = new TopsInMen(driver);
		topsInMen.selectProductNameInSortByDropDown();
		topsInMen.addAeroDailyFitnessTeeInCartPresentInProductName();
	}
	
	
		//17
		@Test
		public void addHeroHoddieInCart() {
			signInWithValidCredentials();
			home = new Home(driver);
			home.clickOnMenDropDown();
			men = new Men(driver);
			men.addHeroHoodieInTheCart();
		}
		
	//18
	@Test	
	public void addProductPresentOnPage2InBottomsMen() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectBottoms24();
		bottomsInMen = new BottomsInMen(driver);
		bottomsInMen.clickOnNextPageButtonPresentAtTheBottom();
		bottomsInMen.addAetherGymPantToCart();
	}
	
	//19
	@Test
	public void addProductWithRedColor() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectBottoms24();
		bottomsInMen = new BottomsInMen(driver);
		bottomsInMen.clickOnColorDropDownAndSelectRedColor();
		bottomsInMen.addLonaYogaPantsInCart();
	}
	
	//20
	@Test
	public void addProductWhereAllClimateInWeatherDropDownIsSelected() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectBottoms24();
		bottomsInMen = new BottomsInMen(driver);
		bottomsInMen.clickOnClimateDropDownAndSelectAllWeather();
		bottomsInMen.addProductForAllClimatesInCart();
	}
	
	//21
	@Test
	public void addProductAfterSortingByProductsName() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnMenDropDown();
		men = new Men(driver);
		men.selectBottoms24();
		bottomsInMen = new BottomsInMen(driver);
		bottomsInMen.selectProductNameInSortByDropDown();
		bottomsInMen.addProductAfterSortingByProductsName();
		Thread.sleep(3000);
	}
	
	//22
	@Test
	public void AddProductPresentOnGearPageAndVerify() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnGearDropDown();
		gear = new Gear(driver);
		gear.clickOnAddToCartButtonOfFusionBackPack();
		gear.clickOnCart();
		Thread.sleep(3000);
		gear.verifyFusionBackPackInCart();
	}
	
	//23
	@Test
	public void closeThePopUpOnGearPage() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnGearDropDown();
		gear = new Gear(driver);
		gear.closeThePopUp();
	}
	
	//24
	@Test
	public void addProductFromFitnessEquipmentAndVerifyThePriceOfIt() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnGearDropDown();
		gear = new Gear(driver);
		gear.clickOnFitnessEquipment();
		gear.closeThePopUp();
		gear.clickOnAddToCartButton();
		gear.verifyThePriceOfSpriteFoamRoller("$19.00");
	}
	
	//25
	@Test
	public void addProductFromWomensSaleAfterSortingByPrice() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnSale();
		sale = new Sale(driver);
		sale.selectShopWomensDealButton();
		sale.selectPriceInSortByDropDown();
		sale.selectTiffanyFitnessTeeInPrice();
	}
	
	//26
	@Test
	public void addProductFromWomensDeal() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnSale();
		sale = new Sale(driver);
		sale.selectShopWomensDealButton();
		sale.selectAntoniaRacerTankInWomensSale();
	}
	
	//27
	@Test
	public void clickOnMensDealAndAProduct() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnSale();
		sale = new Sale(driver);
		sale.clickOnShopMensDealImage();
		sale.addFitnessShortInCart();
	}
	
	//28
	@Test
	public void addProductFromMensDealWithPrice20DollarPriceRange() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnSale();
		sale = new Sale(driver);
		sale.clickOnShopMensDealImage();
		sale.selectPriceDropDownAndSelect20Dollar();
		sale.selectGymShortIn20DollarPrice();
	}
	
	//29
	@Test
	public void provideShippingDetailsAndPayForProductsInCart() throws InterruptedException {
		signInWithValidCredentials();
		home = new Home(driver);
		home.clickOnCartIconAndProceedToCheckOutButton();
//		Thread.sleep(3000);
		shipping = new Shipping(driver);
		shipping.clickOnNextButton();
		reviewAndPayment = new ReviewsAndPayment(driver);
		reviewAndPayment.clickOnPlaceOrderButton();
	}
	
	//30
	@Test
	public void searchProductAndAddToCart() {
		signInWithValidCredentials();
		home = new Home(driver);
		home.search("Gym");
		home.selectGymTeesInSearchOption();
		home.addProductToCart();
	}
	
	
	@AfterTest
	public void closeBrowser() {
		if(testPassed==true) {
		driver.quit();
		}
	}
}
