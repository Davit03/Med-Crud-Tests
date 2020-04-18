package pages.SeniorAminPages;

import testdata.TestDataInformation;
import org.openqa.selenium.By;

public class SeniorAdminProfilePage extends TestDataInformation {

    // Headers
    private By profilePageHeader = By.xpath("//div[@class='page_header ng-binding']");

    // Fields
    private By userFirstNameField = By.xpath("//div[@class='profile-info']//div[1]//span[2]//div[1]//input[1]");
    private By userLastNameField = By.xpath("//div[@class='main-form-blocks']//div[2]//span[1]");


    // Buttons
    private By userProfileMenuButton = By.xpath("//div[@class='integration-menu-icon']");
    private By userProfileMapButton = By.xpath("//div[@class='medsu-menu medsu-menu-show']//div[6]//a[1]");
    private By logOutButton = By.xpath("//div[13]//a[1]");

    // Messages
    private By userProfileEmail = By.xpath("//body[@class='home container-fluid ng-scope']//div[@class='right-side hidden-xs hidden-sm']//div[@class='basic_information_right']//div//div[@class='col-xs-12 slight_margin']//div[1]//span[1]");

    // Void Methods
    public void clickOnTheUserProfileMenuButton() {
        driver.findElement(userProfileMenuButton).click();
    }

    public void clickOnTheLogOutButton() {
        driver.findElement(logOutButton).click();
    }

    public void clickOnTheMapButton() {
        driver.findElement(userProfileMapButton).click();
    }


    // String Methods
    public String userProfileHeader() {
        String g = driver.findElement(profilePageHeader).getText();
        return g;
    }


    public SeniorAdminProfilePage LogOut() throws InterruptedException {
        this.clickOnTheUserProfileMenuButton();
        getWaitTime();
        this.clickOnTheLogOutButton();
        return this;
    }

    public SeniorAdminProfilePage OpenMap() throws InterruptedException {
        this.clickOnTheUserProfileMenuButton();
        getWaitTime();
        this.clickOnTheMapButton();
        getWaitTime();
        return this;
    }


}
