package testdata;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestDataInformation {

    protected static WebDriver driver;

    protected String senioradminusername = "senior.admin@medsu.net";
    protected String testadminusername = "test.admin@medsu.net";
    protected String testappraiserusername = "test.appraiser@medsu.net";
    protected String leadappraisernusername = "lead.appraiser@medsu.net";
    protected String responsibleofficerusername = "responsible.officer@medsu.net";
    protected String paidmemberusername = "paid.member@medsu.net";
    protected String freememberusername = "free.member@medsu.net";
    protected String paodgonefreememberusername = "paid.gone.free.member@medsu.net";
    protected String userpassword = "Pwd12345";


    protected static void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    protected static WebDriver getWaitTime() throws InterruptedException {
        Thread.sleep(2000);
        return driver;
    }
    protected static WebDriver getWaitTime2() throws InterruptedException {
        Thread.sleep(20000);
        return driver;
    }


}


