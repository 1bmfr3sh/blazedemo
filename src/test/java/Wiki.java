import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Mainpage;
import org.example.WikiInfopage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Wiki {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void globalBefore() {
        System.out.println("I am before class");
        System.out.println("Initialising Webdriver..");
        driver = WebDriverManager.chromedriver().create();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Before
    public void before() {

        System.out.println("I am before");
        driver.get("https://en.wikipedia.org/");

    }

    @Test
    public void test1() {
        System.out.println("I am test");
        Mainpage mainpage = new Mainpage(driver);
        mainpage.searchQuery("Rainforest");
        mainpage.selectFirstSearchResult();
        WikiInfopage infopage= new WikiInfopage(driver);


     //   WebElement pageTitle= driver.findElement(By.className());
        // Assert.assertEquals("Rainforest",pageTitle.getText());
      //   String url =
       // Assert.assertTrue("URL did not have rainforest",);

        // Mainpage mainpage = new Mainpage(driver);
    }
    @Test
    public void test2() {
        System.out.println("I am test 2");


    }

    @After
    public void after() {
        System.out.println("I am after");
    }

    @AfterClass
    public static void afterclass() {
        System.out.println("I am after class");
    }
}



//  WebElement searchInput = driver.findElement(By.id("searchInput"));
// searchInput.sendKeys("Bread");
// By searchResult = By.className("suggestions-result");
//  WebElement firstSearchResult = wait.until(ExpectedConditions.elementToBeClickable(searchResult));
//   firstSearchResult.click();