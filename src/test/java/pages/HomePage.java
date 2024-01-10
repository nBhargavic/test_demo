package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    WebDriver driver;
    By LoginButton = By.className("login-button");
    By UserName = By.id("usernameInput");
    By PasswordName = By.id("passwordInput");
    By Text1 = By.xpath("h1[text()='Trending Now']");
    By Text2 = By.xpath("h1[text()='Originals']");
    By PlayButoon = By.className("home-movie-play-button");
    By MoviesDisplayed =By.cssSelector("div[class='App']>*");
    By ContactSection = By.className("contact-us-paragraph");

    public HomePage(WebDriver driver){

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

    //checking texts of headings of home section
    public void HeadingText1(){
        driver.findElement(Text1).isDisplayed();
    }
    public void HeadingText2(){
        driver.findElement(Text2).isDisplayed();
    }
    // Test whether the play button is displayed or not
    public void PlayButtonTest(){
        driver.findElement(PlayButoon).isDisplayed();
    }
    //Test whether the Movies are displayed, in the corresponding movies sections
    public void MoviesDisplayedTest(){
        driver.findElement(MoviesDisplayed).isDisplayed();
    }
    //Test the Contact Us Section
    public void ContactUssection(){
        driver.findElement(ContactSection).isDisplayed();
    }

    public void TearDown() {
        driver.close();
    }

}
