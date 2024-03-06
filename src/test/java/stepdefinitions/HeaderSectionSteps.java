package stepdefinitions;
import pages.HeaderSectionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HeaderSectionSteps{

        public static WebDriver driver;
        public HeaderSectionPage headerpage;
        @BeforeMethod
        public void setup(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://qamoviesapp.ccbp.tech");
            headerpage = new HeaderSectionPage(driver);
        }
        @Test(priority = 1)
        public void HomePageTest(){
            headerpage.Username("rahul");
            headerpage.Password("rahul@2021");
            headerpage.clickonLoginButton();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
            Assert.assertTrue(driver.findElement(By.cssSelector("ul.nav-menu-list>:first-child")).isDisplayed());
            Assert.assertTrue(driver.findElement(By.cssSelector("ul.nav-menu-list>:last-child")).isDisplayed());
            Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='profile']")).isDisplayed());

        }
        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

}