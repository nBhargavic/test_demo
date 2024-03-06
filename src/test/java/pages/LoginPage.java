package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By WebsiteLogo = By.className("login-website-logo");
    By HeadingText = By.tagName("h1");
    By UsernameLabelText = By.tagName("label");
    By PasswordLabelText = By.partialLinkText("PASSWO");
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");

    public LoginPage(WebDriver driver){

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
}
