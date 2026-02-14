package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // Load URL
        driver.get("http://leaftaps.com/opentaps/");

        // Maximize browser
        driver.manage().window().maximize();

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click Login
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter First Name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswin");

        // Enter Last Name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bharath");

        // Enter Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

        // Enter Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");

        // Click Create Lead button
        driver.findElement(By.className("smallSubmit")).click();

        // Print the Title of the page
        System.out.println("Page Title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

