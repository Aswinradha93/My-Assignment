package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize browser
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Accounts tab
        driver.findElement(By.linkText("Accounts")).click();

        // Click Create Account
        driver.findElement(By.linkText("Create Account")).click();

        // Enter Account Name
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Account");

        // Enter Description
        driver.findElement(By.name("description"))
              .sendKeys("Selenium Automation Tester.");

        // Enter Number Of Employees
        driver.findElement(By.id("numberEmployees")).sendKeys("50");

        // Enter Site Name
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

        // Click Create Account button
        driver.findElement(By.className("smallSubmit")).click();

        // Print Title
        System.out.println("Page Title is: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}
