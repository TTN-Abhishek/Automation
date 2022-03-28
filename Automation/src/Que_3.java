import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que_3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement departureCity = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		departureCity.sendKeys("Delhi (DEL)");
		
		WebElement arrivalCity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrivalCity.sendKeys("Pondicherry (PNY)");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
}