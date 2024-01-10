package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AccountsPage {
    WebDriver driver;
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By Accountspage = By.className("avatar-img");
    By UIEelement1 = By.className("account-heading");
    By UIElement2 = By.className("membership-heading");
    By UIElement3 = By.xpath("p[text()='Plan details']");
    By UIElement4 = By.className("logout-button");

    public AccountsPage(WebDriver driver){

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
