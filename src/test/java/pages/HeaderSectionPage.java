package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderSectionPage {
    WebDriver driver;
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By LoginButton = By.className("login-button");
    //navbar elements
    By NavBarofHome = By.cssSelector("ul.nav-menu-list>:first-child");
    By NavBarofPopular = By.cssSelector("ul.nav-menu-list>:last-child");
    By NavBarofAccount = By.xpath("//img[@alt='profile']");

    public HeaderSectionPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickonLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void enterUserName(String username){
        driver.findElement(UserName).sendKeys(username);
    }
    public void enterPasswordName(String password){
        driver.findElement(PasswordName).sendKeys(password);
    }
    public boolean isNavBarElementsDisplayed0(String home){
        return driver.findElement(NavBarofHome).isDisplayed();
    }
    public boolean isNavBarElementsDisplayed1(String Popular){
        return driver.findElement(NavBarofPopular).isDisplayed();
    }
    public boolean isNavBarElementsDisplayed2(String Account){
        return driver.findElement(NavBarofAccount).isDisplayed();
    }

}
