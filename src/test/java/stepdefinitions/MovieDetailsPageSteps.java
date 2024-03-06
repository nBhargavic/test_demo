package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MovieDetailsPage;

import java.time.Duration;

public class MovieDetailsPageSteps {

    public WebDriver driver;
    public MovieDetailsPage moviedetailspage;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        moviedetailspage = new MovieDetailsPage(driver);
    }

    @Test(priority = 1)

    public void MoviesDetailsPage(){
        moviedetailspage.Username("rahul");
        moviedetailspage.Password("rahul@2021");
        moviedetailspage.clickonLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("img[starts-with(@alt='No Time')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("p[text()='No Time to Die']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("p.watch-time")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("p.movie-overview")).isDisplayed());
        driver.findElement(By.className("play-button")).click();
        driver.findElement(By.className("avatar-img")).click();
        driver.findElement(By.className("logout-button")).click();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
