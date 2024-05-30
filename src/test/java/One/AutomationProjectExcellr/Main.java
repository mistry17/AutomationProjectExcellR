package One.AutomationProjectExcellr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();
		WebElement tops = driver.findElement(By.xpath("//a[@id='ui-id-9']//span[1]"));
		tops.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
