package week5.day1;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameAlert {
public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String resultText = driver.findElement(By.id("demo")).getText();
        if(resultText.contains("OK")) {
            System.out.println("User clicked OK - Test Passed");
        } else if(resultText.contains("Cancel")) {
            System.out.println("User clicked Cancel - Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}