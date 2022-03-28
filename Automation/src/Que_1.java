import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Que_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("a")).click();

		WebElement emailAddress = driver.findElement(By.id("email_create"));
		emailAddress.sendKeys("abhishek.kumar@gmail.com");

		driver.findElement(By.id("SubmitCreate")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='id_gender']")).click();

		// Filling the registration form

		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Abhishek");

		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Kumar");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Qwerty");

//		Selecting DOB from Dropdown	
		Select dropDownDays = new Select(driver.findElement(By.id("days")));
		dropDownDays.selectByVisibleText("9  ");

		Select dropDownMonths = new Select(driver.findElement(By.id("months")));
		dropDownMonths.selectByVisibleText("March ");

		Select dropDownYears = new Select(driver.findElement(By.id("years")));
		dropDownYears.selectByVisibleText("1999  ");

		WebElement firstNameAddress = driver.findElement(By.id("firstname"));
		firstNameAddress.sendKeys("Abhishek");

		WebElement lastNameAddress = driver.findElement(By.id("firstname"));
		lastNameAddress.sendKeys("Kumar");

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("To The New");

		WebElement companyAddress = driver.findElement(By.id("address1"));
		companyAddress.sendKeys("NSL Techzone IT SEZ, Noida");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Noida");

		// Selecting State and country via Dropdown
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		Thread.sleep(3000);

		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Idaho");

		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00001");

		WebElement contact = driver.findElement(By.id("phone_mobile"));
		contact.sendKeys("9521868743");

		WebElement aliasAddress = driver.findElement(By.id("alias"));
		aliasAddress.sendKeys("Noida");

		driver.findElement(By.id("submitAccount")).click();
	}

}