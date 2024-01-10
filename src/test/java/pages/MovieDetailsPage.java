package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovieDetailsPage {
    WebDriver driver;
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By ClickonAnymovie = By.xpath("img[starts-with(@alt='No Time')]");
    By UiElementsPresent0 = By.xpath("p[text()='No Time to Die']");
    By UiElementsPresent1 = By.cssSelector("p.watch-time");
    By UiElementsPresent2 = By.cssSelector("p.movie-overview");
    By UiElementsPresent3 = By.className("play-button");
    By ClickonAccount = By.className("avatar-img");
    By LogoutButton = By.className("logout-button");


    public  MovieDetailsPage(WebDriver driver){
        this.driver = driver;

    }
    public void clickonLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void Username(String username){
        driver.findElement(UserName).sendKeys(username);

    }
    public void Password(String password)    {
        driver.findElement(PasswordName).sendKeys(password);
    }
    public void clickonAnyMovie(){
        driver.findElement(ClickonAnymovie).click();
    }
    public void UiElement0(){
        driver.findElement(UiElementsPresent0).isDisplayed();
    }




}
