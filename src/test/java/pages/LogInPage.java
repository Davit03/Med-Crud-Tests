package pages;

import testdata.TestDataInformation;
import org.openqa.selenium.By;

public class LogInPage extends TestDataInformation {

    // Headers
    private By logInPageHeader = By.xpath("//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 login_title']");

    // Fields
    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");

    // Links


    // Buttons
    private By logInButton = By.xpath("//input[@class='btn login_button login_color']");

    // Messages
    private By userProfileAvatar = By.xpath("//*[@id=\"__next\"]/div/header/div/div[2]/div/div[1]/div[2]/span");

    // Void Methods
    public void typeInEmailField(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(logInButton).click();
    }

    // String Methods
    public String logInPageHeader() {
        String t = driver.findElement(logInPageHeader).getText();
        return t;
    }

    public LogInPage logIn(String email, String password) throws InterruptedException {
        this.typeInEmailField(email);
        getWaitTime();
        this.typeInPasswordField(password);
        getWaitTime();
        this.clickOnLoginButton();
        return this;
    }

}
