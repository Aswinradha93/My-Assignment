package week5.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class IRCTCWindowHandling {
public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.irctc.co.in/");
        driver.findElement(By.linkText("FLIGHTS")).click();
        Set<String> allWindows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<String>(allWindows);
        driver.switchTo().window(windowList.get(1));
        String childTitle = driver.getTitle();
        System.out.println("Flights Window Title: " + childTitle);
        driver.switchTo().window(windowList.get(0));
        String parentTitle = driver.getTitle();
        System.out.println("Parent Window Title: " + parentTitle);
        driver.close();
}
}
