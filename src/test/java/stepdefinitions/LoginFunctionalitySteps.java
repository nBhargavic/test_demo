package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.Assert;
import io.cucumber.java.After;

public class LoginFunctionalitySteps {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91830\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I am on the login page")
    public void iamonloginpage(){
        driver.get("https://qamoviesapp.ccbp.tech");
    }

    @When("I enter valid username and password")
    public void iEnterValidCredentials(){
        driver.findElement(By.id("username")).sendKeys("rahul");
        driver.findElement(By.id("password")).sendKeys("rahul@2021");
    }

    @And("I click on the login button")
    public void iClickonLoginButton(){
        driver.findElement(By.className("login-button")).click();
    }
    @Then("I should be redirected to the home page")
    public void iShouldbRedirectedtoHomePage(){
        String ExpectedUrl = "https://qamoviesapp.ccbp.tech/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(ExpectedUrl));
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(ExpectedUrl,currentUrl,"Urls do not match");

    }
    @After
    public void tearDown(){
        driver.quit();
    }







}
