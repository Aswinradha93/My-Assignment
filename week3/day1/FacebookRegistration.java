package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

	    // Launch Browser
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    // Load URL
	    driver.get("https://en-gb.facebook.com/");

	    // Click Create new account
	    driver.findElement(By.linkText("Create new account")).click();

	    // Enter First Name
	    driver.findElement(By.name("firstname")).sendKeys("Aswin");

	    // Enter Surname
	    driver.findElement(By.name("lastname")).sendKeys("Bharath");

	    // Enter Mobile number
	    driver.findElement(By.name("reg_email__")).sendKeys("9876543210");

	    // Enter New Password
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");

	    // Handle Date of Birth - Day
	    Select day = new Select(driver.findElement(By.id("day")));
	    day.selectByValue("17");

	    // Month
	    Select month = new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText("Feb");

	    // Year
	    Select year = new Select(driver.findElement(By.id("year")));
	    year.selectByValue("1995");

	    // Select Gender (Male)
	    driver.findElement(By.xpath("//input[@value='2']")).click();

	    System.out.println("Facebook Registration Form Filled Successfully");

	    // Close Browser
	    driver.quit();
	}
}
