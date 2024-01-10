package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;
import java.util.List;
import java.time.Duration;

public class SearchPageSteps {
    public WebDriver driver;
    public SearchPage searchpage = new SearchPage(driver);
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        searchpage = new SearchPage(driver);
    }
    @Test
    public void SearchPageSteps() {
        searchpage.UserName("rahul");
        searchpage.PasswordName("rahul@2021");
        searchpage.clickonLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//svg[@stroke='currentColor']")).click();
        driver.findElement(By.className("search-input-field")).sendKeys("");
        driver.findElement(By.className("search-input-field")).click();
        List<WebElement> moviescount = driver.findElements(By.className("movie-image"));
        System.out.println(moviescount.size());

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
