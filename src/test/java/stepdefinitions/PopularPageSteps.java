package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PopularPage;

import java.time.Duration;

public class PopularPageSteps {
    public WebDriver driver;
    public PopularPage popularPage;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        popularPage = new PopularPage(driver);
    }

    @Test(priority = 1)
    public void PopularPageUIElem(){
        popularPage.Username("rahul");
        popularPage.Password("rahul@2021");
        popularPage.clickonLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.cssSelector("ul.nav-menu-list>:last-child")).click();
        Assert.assertTrue(driver.findElement(By.className("search-movies-container")).isDisplayed());


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
