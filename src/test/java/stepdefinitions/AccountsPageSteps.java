package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountsPage;

import java.time.Duration;

public class AccountsPageSteps {
    public WebDriver driver;
    public AccountsPage accountspage;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qamoviesapp.ccbp.tech");
        accountspage = new AccountsPage(driver);
    }
    @Test(priority = 17)
    public void AccountsPageSteps(){
        accountspage.Username("rahul");
        accountspage.Password("rahul@2021");
        accountspage.clickonLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        System.out.println(driver.findElement(By.className("account-heading")).getText());
        System.out.println(driver.findElement(By.className("membership-heading")).getText());
        System.out.println(driver.findElement(By.xpath("p[text()='Plan details']")).getText());
        driver.findElement(By.className("logout-button")).click();


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
