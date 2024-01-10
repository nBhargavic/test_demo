package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularPage {
    WebDriver driver;
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By NavBarofPopular = By.cssSelector("ul.nav-menu-list>:last-child");
    By moviesUIElem = By.className("search-movies-container");


    public PopularPage(WebDriver driver){
        this.driver = driver;

    }
    public void clickonLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void Username(String username){
        driver.findElement(UserName).sendKeys(username);

    }
    public void Password(String password){
        driver.findElement(PasswordName).sendKeys(password);
    }

    public boolean isNavBarElementsDisplayed1(String Popular){
        return driver.findElement(NavBarofPopular).isDisplayed();
    }


}
