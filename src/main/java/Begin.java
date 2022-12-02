import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Begin {
    public static void main(String[] args) {
        System.out.println("Initialising Webdriver..");
        WebDriver driver = WebDriverManager.chromedriver().create();
        System.out.println("Navigating to ebay");
        driver.get("https://google.com");
        WebElement searchInputField = driver.findElement(By.cssSelector("title=Search"));
        searchInputField.sendKeys("Rainforest");

        System.out.println("closing the driver");
        driver.close();
    }
}
