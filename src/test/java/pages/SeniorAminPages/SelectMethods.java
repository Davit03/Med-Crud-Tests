package pages.SeniorAminPages;

import testdata.TestDataInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods extends TestDataInformation {
    public static void main(String[] args) {

            Select selectCategoryOfWork = new Select(driver.findElement(By.className("form-control")));
            selectCategoryOfWork.selectByVisibleText("Managerial");
        }


}
