package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class HomePageSteps {
    public static WebDriver driver;
    public HomePage homepage = new HomePage(driver);
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        homepage = new HomePage(driver);
    }
    @Test(priority = 1)
    public void HomePageSteps(){
        homepage.Username("rahul");
        homepage.Password("rahul@2021");
        homepage.clickonLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        Assert.assertTrue(driver.findElement(By.xpath("h1[text()='Trending Now']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("h1[text()='Originals']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("home-movie-play-button")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='App']>*")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("contact-us-paragraph")).isDisplayed());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
