package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By Search = By.xpath("//svg[@stroke='currentColor']");
    By SearchInputField = By.className("search-input-field");
    By SearchButton = By.className("search-button");
    By movieslist = By.className("movie-image");

    public SearchPage(WebDriver driver){

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

    //Test the Search functionality by searching with some movie names and the count of movies displayed
    public void SearchTest(){
        driver.findElement(Search).click();
    }
    public void SearchInputf(String input){
        driver.findElement(SearchInputField).sendKeys(input);
    }
    public void SearchButtonTest(){
        driver.findElement(SearchButton).isDisplayed();
    }
    //close the browser window
    public void TearDown() {
        driver.close();
    }

}
