package pages.SeniorAminPages;

import testdata.TestDataInformation;
import org.openqa.selenium.By;

import java.time.Instant;

public class SeniorAdminMapPage extends TestDataInformation {


    //Links
    private By firstSectionLink = By.xpath("//span[contains(text(),'1. Scope of Work')]");

    // Section 2 links
    private By secondSectionLink = By.xpath("//span[contains(text(),'2. Current PDP')]");

    // Section 3 Links
    private By thirdSectionLink = By.xpath("//span[contains(text(),'3. Record of CPD')]");

    // Section 4 links
    private By fourthSectionLink = By.xpath("//*[@id=\"sections-menu-wrapper\"]/ul/li[4]/div/span[2]");

    // Section 5 links
    private By fifthSectionLink = By.xpath("//*[@id=\"sections-menu-wrapper\"]/ul/li[5]/div/span[2]");

    // Section 6 links
    private By sixthSectionLink = By.xpath("//*[@id=\"sections-menu-wrapper\"]/ul/li[6]/div/span[2]");

    // Section 7 links
    private By seventhSectionLink = By.xpath("//*[@id=\"sections-menu-wrapper\"]/ul/li[7]/div/span[2]");

    // Section 10 links
    private By tenthSectionLink = By.xpath("//*[@id=\"sections-menu-wrapper\"]/ul/li[10]/div/span[2]");


    // Section 1 Fields
    private By titleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[2]//div[1]//textarea[1]");
    private By categoryOfWorkField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]");
    private By categoryOfWorkItem = By.xpath("//div[contains(text(),'Managerial')]");
    private By frequencyField = By.xpath("//*[@id=\"section-1\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]");
    private By frequencyFieldItem = By.xpath("//div[contains(text(),'Ad Hoc')]");
    private By detailOfWorkField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[4]//div[1]//div[1]//textarea[1]");
    private By lengthOfTimeInRoleField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[5]//div[1]//div[1]//textarea[1]");
    private By practiceSettingField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[6]//div[1]//div[2]//textarea[1]");
    private By qualificationField = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[7]//div[1]//div[2]//textarea[1]");

    // Section 2 Fields
    private By titleField2 = By.xpath("//div[@class='repeat-container']//div[1]//div[2]//div[2]//div[1]//textarea[1]");
    private By scopeOfWorkField = By.xpath("//*[@id=\"section-3\"]/div/div/div/div[2]/div[4]/div[2]/div[2]/div[1]");
    private By scopeOfWorkItem = By.xpath("//div[@class='select-item']");
    private By developmentGoalField = By.xpath("//div[@class='full-width custom-form-control']//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By actionPlanField = By.xpath("//div[5]//div[2]//textarea[1]");
    private By outcomeMeasureField = By.xpath("//div[6]//div[2]//textarea[1]");
    private By estimatedTimeCommitmentField = By.xpath("//p[@class='input-group']//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By targetDataField = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-datetime']");
    private By selectData = By.xpath("//button[@class='btn btn-default btn-sm']//span[@class='ng-binding'][contains(text(),'10')]");
    private By pleaseElaborateOnThisField = By.xpath("//div[10]//div[1]//div[2]//textarea[1]");
    private By reflectiveEvaluationField = By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");

    // Section 3 fields
    private By cpdActivityTitleField = By.xpath("//textarea[@name='sec3_activity_title']");
    private By cpdHourField = By.xpath("//*[@id=\"section-3\"]/div/div/div/div[2]/div[2]/div[2]/div[2]/input");
    private By cpdTypeField = By.xpath("//div[@id='check-cpd-type']//div[@class='select-selected'][contains(text(),'- None -')]");
    private By cpdTypeItem = By.xpath("//div[contains(text(),'Academic')]");
    private By cpdActivityDateField = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-isolate-scope ng-empty ng-valid-datetime']");
    private By selectCpdActivityDate = By.xpath("//button[@class='btn btn-sm btn-info ng-binding ng-scope']");
    private By cpdProgressField = By.xpath("//*[@id=\"section-3\"]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[1]");
    private By selectCpdProgressItem = By.xpath("//div[contains(text(),'In Progress')]");
    private By scopeOfWorkField3 = By.xpath("//div[@class='custom-form-control custom-select scope-of-work-select ng-isolate-scope']//div[@class='select-selected']");
    private By selectScopeOfWorkField3 = By.xpath("//div[contains(text(),'Cross Role')]");
    private By descriptionField = By.xpath("//div[@class='custom-form-control']//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By reflectiveEvaluation = By.xpath("//div[@class='col-sm-12 custom-form-control']//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
    private By gmpDomainsCheckBox = By.xpath("//div[@class='row col-md-12 col-xs-12']//div[1]//div[2]//label[1]");
    private By summaryReflectionField = By.xpath("//*[@id=\"section-3\"]/div/div[2]/textarea");
    private By appraisersCommentsField = By.xpath("//*[@id=\"section-wrapper\"]/form/div[3]/div/div/div/div[2]/textarea");

    // Select 4 fields
    private By titleField4 = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[2]/div/textarea");
    private By scopeOfWork4Field = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[3]/div[2]/div[1]");
    private By scopeOfWorkField4Item = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]");
    private By improvementActivityField = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[1]");
    private By selectInImprovementActivityField = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[2]/div/div[2]");
    private By activityDateField = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[4]/div[2]/div[2]/p/input");
    private By selectActivityDate = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[4]/div[2]/div[2]/p/ul/li[2]/span[1]/button[1]");
    private By descriptionOfActivityField = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[5]/div/textarea");
    private By reflectiveEvaluation4Field = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[6]/div/div[2]/textarea");
    private By gmpDomains4Field = By.xpath("//*[@id=\"section-4\"]/div/div/div/div[2]/div[7]/div[2]/div/div[1]/div[2]/label");
    private By summaryReflective4Field = By.xpath("//*[@id=\"section-4\"]/div/div/div[2]/textarea");
    private By appraisersComments4Field = By.xpath("//*[@id=\"section-wrapper\"]/form/div[3]/div/div/div/div[2]/textarea");

    // Select 5 fields
    private By title5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[2]/div/div/textarea");
    private By scopeOfWork5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[3]/div[2]/div[1]");
    private By scopeOfWorkField5Item = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]");
    private By date5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[4]/div/div[2]/p/input");
    private By select5Date = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[4]/div/div[2]/p/ul/li[2]/span[1]/button[1]");
    private By description5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[5]/div/div[2]/textarea");
    private By reflectiveEvaluation5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[6]/div/div[2]/textarea");
    private By gmpDomains5Field = By.xpath("//*[@id=\"section-5\"]/div/div/div/div[2]/div[7]/div[2]/div/div[1]/div[2]/label");
    private By summaryReflective5Field = By.xpath("//*[@id=\"section-5\"]/div/div[2]/textarea");
    private By appraisersComments5Field = By.xpath("//*[@id=\"section-wrapper\"]/form/div[4]/div/div/div/div[2]/textarea");

    // Select 6 fields
    private By title6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[2]/div/textarea");
    private By scopeOfWork6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[3]/div[2]/div[1]");
    private By scopeOfWorkField6Item = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]");
    private By typeOfFeedback6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[1]");
    private By selectTypeOfFeedback6Item = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[4]/div[1]/div[2]/div[2]/div/div[2]");
    private By date6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[4]/div[2]/div/p/input");
    private By select6Date = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[4]/div[2]/div/p/ul/li[2]/span[1]/button[1]");
    private By description6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[5]/div/div/textarea");
    private By reflectiveEvaluation6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[6]/div/div[2]/textarea");
    private By gmpDomains6Field = By.xpath("//*[@id=\"section-6\"]/div/div/div/div[2]/div[7]/div[2]/div/div[1]/div[2]/label");
    private By appraisersComments6Field = By.xpath("//*[@id=\"section-wrapper\"]/form/div[2]/div/div/div/div[2]/textarea");

    // Select 7 fields
    private By title7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[2]/div/div/textarea");
    private By scopeOfWork7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[3]/div[2]/div[1]");
    private By scopeOfWorkField7Item = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]");
    private By typeOfComplaintOrCompliment7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[4]/div[1]/div/div[1]");
    private By selectTypeOfCompliment7Item = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div[2]");
    private By date7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[4]/div[2]/div/p/input");
    private By select7Date = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[4]/div[2]/div/p/ul/li[2]/span[1]/button[1]");
    private By description7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[5]/div/div/textarea");
    private By reflectiveEvaluation7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[6]/div/div[2]/textarea");
    private By gmpDomains7Field = By.xpath("//*[@id=\"section-7\"]/div/div/div[2]/div[7]/div[2]/div/div[1]/div[2]/label");
    private By summaryReflection7Field = By.xpath("//*[@id=\"section-7\"]/div/div[2]/textarea");
    private By appraisersComments7Field = By.xpath("//*[@id=\"section-wrapper\"]/form/div[4]/div/div/div/div[2]/textarea");

    // Select 10 fields
    private By title10Field = By.xpath("//*[@id=\"section-10\"]/div/div/div[2]/div[2]/div/input");
    private By scopeOfWork10Field = By.xpath("//*[@id=\"section-10\"]/div/div/div[2]/div[3]/div[2]/div[1]");
    private By scopeOfWorkField10Item = By.xpath("//*[@id=\"section-10\"]/div/div/div[2]/div[3]/div[2]/div[2]/div/div[2]");
    private By description10Field = By.xpath("//*[@id=\"section-10\"]/div/div/div[2]/div[4]/div/textarea");
    private By appraisersComments10Field = By.xpath("//*[@id=\"section-wrapper\"]/form/div/div[2]/div/div/div/div[2]/textarea");


    //Buttons
    private By sectionMenuButton = By.xpath("//div[@class='selected-menu flex']");
    private By addNewItemButton = By.xpath("//div[@class='add-item-button ng-scope']");
    private By removeItemButton = By.xpath("//div[@class='delete_item']");
    private By deleteConfirmButton = By.xpath("//button[@class='ng-btn ng-btn-green success']");

    // Section 3 Buttons
    private By radioButtonYes = By.xpath("//div[@class='row mb-20']//div[1]//div[1]//label[1]");
    private By checkBoxOne = By.xpath("//div[@class='row col-md-12 col-xs-12']//div[1]//div[2]//label[1]");


    // Files
    private By file1 = By.xpath("//a[contains(text(),'1.bmp')]");
    private By file2 = By.xpath("//a[contains(text(),'2.doc')]");
    private By file3 = By.xpath("//a[contains(text(),'3.docx')]");
    private By file4 = By.xpath("//a[contains(text(),'4.gif')]");
    private By file5 = By.xpath("//a[contains(text(),'5.heic')]");
    private By file6 = By.xpath("//a[contains(text(),'6.jpg')]");
    private By file7 = By.xpath("//a[contains(text(),'7.key')]");
    private By file8 = By.xpath("//a[contains(text(),'8.mov')]");
    private By file9 = By.xpath("//a[contains(text(),'9.mp3')]");
    private By file10 = By.xpath("//a[contains(text(),'10.mp4')]");
    private By file11 = By.xpath("//a[contains(text(),'11.numbers')]");
    private By file12 = By.xpath("//a[contains(text(),'12.pages')]");
    private By file13 = By.xpath("//a[contains(text(),'13.pdf')]");
    private By file14 = By.xpath("//a[contains(text(),'14.png')]");
    private By file15 = By.xpath("//a[contains(text(),'15.ppt')]");
    private By file16 = By.xpath("//a[contains(text(),'16.pptx')]");
    private By file17 = By.xpath("//a[contains(text(),'17.txt')]");
    private By file18 = By.xpath("//a[contains(text(),'18.xls')]");
    private By file19 = By.xpath("//a[contains(text(),'19.xlsx')]");
    private Instant wait;

    // Void Methods
    public void clickOnTheFirstSectionLink() {
        driver.findElement(firstSectionLink).click();
    }

    public void clickOnSectionMenuButton() {
        driver.findElement(sectionMenuButton).click();
    }

    public void clickOnTheAddNewItemButton() {
        driver.findElement(addNewItemButton).click();
    }

    public void clickOnTheRemoveItemButton() {
        driver.findElement(removeItemButton).click();
    }

    public void clickOnTheConfirmDeleteButton() {
        driver.findElement(deleteConfirmButton).click();
    }


    public void typeInTitleField(String text) {
        driver.findElement(titleField).clear();
        driver.findElement(titleField).sendKeys(text);
    }

    public String getTitleText() {
        String q = driver.findElement(titleField).getText();
        return q;
    }

    public String getDetailOfWorkText() {
        String r = driver.findElement(detailOfWorkField).getText();
        return r;
    }

    public String getLengthOfTimeText() {
        String y = driver.findElement(lengthOfTimeInRoleField).getText();
        return y;
    }

    public String getPracticeSettingText() {
        String u = driver.findElement(practiceSettingField).getText();
        return u;
    }

    public String getQualificationText() {
        String i = driver.findElement(qualificationField).getText();
        return i;
    }

    public String getCategoryOfWorkText() {
        String o = driver.findElement(categoryOfWorkField).getText();
        return o;
    }

    public String getFrequencyText() {
        String p = driver.findElement(frequencyField).getText();
        return p;
    }

    public String getItem1Text() {
        String l = driver.findElement(file1).getText();
        return l;
    }

    public String getItem2Text() {
        String k = driver.findElement(file2).getText();
        return k;
    }

    public String getItem3Text() {
        String jk = driver.findElement(file3).getText();
        return jk;
    }

    public String getItem4Text() {
        String mm = driver.findElement(file4).getText();
        return mm;
    }

    public String getItem5Text() {
        String bb = driver.findElement(file5).getText();
        return bb;
    }

    public String getItem6Text() {
        String ff = driver.findElement(file6).getText();
        return ff;
    }

    public String getItem7Text() {
        String cc = driver.findElement(file7).getText();
        return cc;
    }

    public String getItem8Text() {
        String xx = driver.findElement(file8).getText();
        return xx;
    }

    public String getItem9Text() {
        String zz = driver.findElement(file9).getText();
        return zz;
    }

    public String getItem10Text() {
        String aa = driver.findElement(file10).getText();
        return aa;
    }

    public String getItem11Text() {
        String qq = driver.findElement(file11).getText();
        return qq;
    }

    public String getItem12Text() {
        String ww = driver.findElement(file12).getText();
        return ww;
    }

    public String getItem13Text() {
        String ee = driver.findElement(file13).getText();
        return ee;
    }

    public String getItem14Text() {
        String rr = driver.findElement(file14).getText();
        return rr;
    }

    public String getItem15Text() {
        String tt = driver.findElement(file15).getText();
        return tt;
    }

    public String getItem16Text() {
        String yy = driver.findElement(file16).getText();
        return yy;
    }

    public String getItem17Text() {
        String uu = driver.findElement(file17).getText();
        return uu;
    }

    public String getItem18Text() {
        String ii = driver.findElement(file18).getText();
        return ii;
    }

    public String getItem19Text() {
        String oo = driver.findElement(file19).getText();
        return oo;
    }


    public void selectItemInCategoryOfWorkField() throws InterruptedException {
        driver.findElement(categoryOfWorkField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(categoryOfWorkItem).click();
    }

    public void selectItemInFrequencyField() throws InterruptedException {
        driver.findElement(frequencyField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(frequencyFieldItem).click();
    }

    public void typeInDetailOfWorkField(String text) {
        driver.findElement(detailOfWorkField).clear();
        driver.findElement(detailOfWorkField).sendKeys(text);
    }

    public void typeInLengthOfTimeInRoleField(String text) {
        driver.findElement(lengthOfTimeInRoleField).clear();
        driver.findElement(lengthOfTimeInRoleField).sendKeys(text);
    }

    public void typeInPracticeSettingField(String text) {
        driver.findElement(practiceSettingField).clear();
        driver.findElement(practiceSettingField).sendKeys(text);
    }

    public void typeInQualificationField(String text) {
        driver.findElement(qualificationField).clear();
        driver.findElement(qualificationField).sendKeys(text);
    }

    public SeniorAdminMapPage OpenSection1() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnTheFirstSectionLink();
        return this;
    }

    public SeniorAdminMapPage deleteItem() throws InterruptedException {
        this.clickOnTheRemoveItemButton();
        getWaitTime();
        this.clickOnTheConfirmDeleteButton();
        getWaitTime();
        return this;
    }

    public SeniorAdminMapPage CrudForSection1() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.clickOnTheFirstSectionLink();
        getWaitTime();
        this.typeInTitleField("Test1");
        getWaitTime();
        this.typeInDetailOfWorkField("Test2");
        getWaitTime();
        this.typeInLengthOfTimeInRoleField("Test3");
        getWaitTime();
        this.typeInPracticeSettingField("Test4");
        getWaitTime();
        this.typeInQualificationField("Test5");
        getWaitTime();
        return this;

    }

    public SeniorAdminMapPage selectMethod() throws InterruptedException {
        this.selectItemInCategoryOfWorkField();
        getWaitTime();
        this.selectItemInFrequencyField();
        return this;
    }


    public void uploadFiles() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-1 > div > div > div:nth-child(1) > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }

    ////// Section 2  //////////////////////////////////////////////////////////////////////////////////////////////

    public void clickOnSecondSectionLink() {
        driver.findElement(secondSectionLink).click();
    }

    public SeniorAdminMapPage OpenSection2() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnSecondSectionLink();
        return this;
    }

    public void typeInTitleField2(String text) {
        driver.findElement(titleField2).clear();
        driver.findElement(titleField2).sendKeys(text);
    }

    public void selectScopeOfWorkField() throws InterruptedException {
        driver.findElement(scopeOfWorkField).click();
        getWaitTime();
        getWaitTime();
        driver.findElement(scopeOfWorkItem).click();
    }

    public void typeInDevelopmentGoalField(String text) throws InterruptedException {
        driver.findElement(developmentGoalField).clear();
        driver.findElement(developmentGoalField).sendKeys(text);
    }

    public void typeInActionPlan(String text) throws InterruptedException {
        driver.findElement(actionPlanField).clear();
        driver.findElement(actionPlanField).sendKeys(text);
    }

    public void typeInOutcomeMeasureField(String text) throws InterruptedException {
        driver.findElement(outcomeMeasureField).clear();
        driver.findElement(outcomeMeasureField).sendKeys(text);
    }

    public void typeInEstimatedTimeCommitment(String text) throws InterruptedException {
        driver.findElement(estimatedTimeCommitmentField).clear();
        driver.findElement(estimatedTimeCommitmentField).sendKeys(text);
    }

    public void selectData() throws InterruptedException {
        driver.findElement(targetDataField).click();
        driver.findElement(selectData).click();
    }

    public void clickOnRadioButtonYes() throws InterruptedException {
        driver.findElement(radioButtonYes).click();
    }

    public void typeInPleaseElOnThisField(String text) throws InterruptedException {
        driver.findElement(pleaseElaborateOnThisField).clear();
        driver.findElement(pleaseElaborateOnThisField).sendKeys(text);
    }

    public void typeInReflectiveEvaluationField(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluationField).clear();
        driver.findElement(reflectiveEvaluationField).sendKeys(text);
    }

    public void clickOnRadioButton() throws InterruptedException {
        driver.findElement(radioButtonYes).click();

    }

    public void clickOnRadioButton2() throws InterruptedException {
        driver.findElement(checkBoxOne).click();

    }

    public String getCPDTypeText() throws InterruptedException {
        String te = driver.findElement(cpdTypeItem).getText();
        return te;
    }

    public String getCPDProgressText() throws InterruptedException {
        String te = driver.findElement(cpdProgressField).getText();
        return te;
    }

    public String getScopeOfWorkText() throws InterruptedException {
        String te = driver.findElement(scopeOfWorkField).getText();
        return te;
    }

    public void uploadFiles2() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-2 > div > div > div > div.section-container > div:nth-child(15) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }


    public SeniorAdminMapPage CrudForSection2() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField2("Test1");
        getWaitTime();
        this.selectScopeOfWorkField();
        getWaitTime();
        this.typeInDevelopmentGoalField("Test2");
        getWaitTime();
        this.typeInActionPlan("Test3");
        getWaitTime();
        this.typeInOutcomeMeasureField("Test4");
        getWaitTime();
        this.typeInEstimatedTimeCommitment("Test5");
        getWaitTime();
        this.selectData();
        getWaitTime();
        this.clickOnRadioButtonYes();
        getWaitTime();
        this.typeInPleaseElOnThisField("Test6");
        getWaitTime();
        this.typeInReflectiveEvaluationField("Test7");
        getWaitTime();
        this.clickOnRadioButton();
        getWaitTime();
        this.clickOnRadioButton2();
        getWaitTime();
        return this;
    }

    // Section 3 ///////////////////////////////////////////////////

    public void typeInCPDActivityTitleField(String text) throws InterruptedException {
        driver.findElement(cpdActivityTitleField).clear();
        driver.findElement(cpdActivityTitleField).sendKeys(text);
    }

    public void typeInCPDHourField(String text) throws InterruptedException {
        driver.findElement(cpdHourField).clear();
        getWaitTime();
        driver.findElement(cpdHourField).sendKeys(text);
    }

    public void selectInCPDTypeField() throws InterruptedException {
        driver.findElement(cpdTypeField).click();
        driver.findElement(cpdTypeItem).click();
        getWaitTime();
        getWaitTime();
    }

    public void selectActivityDate() throws InterruptedException {
        driver.findElement(cpdActivityDateField).click();
        driver.findElement(selectCpdActivityDate).click();
        getWaitTime();
    }

    public void selectCPDProgressField() throws InterruptedException {
        driver.findElement(cpdProgressField).click();
        driver.findElement(selectCpdProgressItem).click();
    }

    public void selectScopeOfWork() throws InterruptedException {
        driver.findElement(scopeOfWorkField3).click();
        driver.findElement(selectScopeOfWorkField3).click();
    }

    public void typeInDescriptionField(String text) throws InterruptedException {
        driver.findElement(descriptionField).clear();
        driver.findElement(descriptionField).sendKeys(text);
    }

    public void typeInReflectiveEvaluationField3(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluation).clear();
        driver.findElement(reflectiveEvaluation).sendKeys(text);
    }

    public void typeInSummaryReflectionField(String text) throws InterruptedException {
        driver.findElement(summaryReflectionField).clear();
        driver.findElement(summaryReflectionField).sendKeys(text);
    }

    public void typeInAppraisersCommentsField(String text) throws InterruptedException {
        driver.findElement(appraisersCommentsField).clear();
        driver.findElement(appraisersCommentsField).sendKeys(text);
    }

    public void clickOnGMPDomainsCheckBox() throws InterruptedException {
        driver.findElement(gmpDomainsCheckBox).click();
    }

    public void clickOnThirdSectionLink() {
        driver.findElement(thirdSectionLink).click();
    }

    public SeniorAdminMapPage OpenSection3() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnThirdSectionLink();
        return this;
    }

    public void uploadFiles3() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-3 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }

    public SeniorAdminMapPage CrudForSection3() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInCPDActivityTitleField("Test1");
        getWaitTime();
        this.typeInCPDHourField("2");
        getWaitTime();
        this.selectInCPDTypeField();
        getWaitTime();
        this.selectActivityDate();
        getWaitTime();
        this.selectCPDProgressField();
        getWaitTime();
        this.selectScopeOfWork();
        getWaitTime();
        this.typeInDescriptionField("Test3");
        getWaitTime();
        this.typeInReflectiveEvaluationField3("Test4");
        getWaitTime();
        this.typeInSummaryReflectionField("Test5");
        getWaitTime();
        this.typeInAppraisersCommentsField("Test6");
        getWaitTime();
        this.clickOnGMPDomainsCheckBox();
        getWaitTime();
        return this;
    }

    // Section 4 ////////////////////////////////////////////////////////////////////////////////

    public void typeInTitleField4(String text) throws InterruptedException {
        driver.findElement(titleField4).clear();
        driver.findElement(titleField4).sendKeys(text);
    }

    public void selectInScopeOfWork4() throws InterruptedException {
        driver.findElement(scopeOfWork4Field).click();
        driver.findElement(scopeOfWorkField4Item).click();
        getWaitTime();
    }

    public void selectImprovementActivity() throws InterruptedException {
        driver.findElement(improvementActivityField).click();
        driver.findElement(selectInImprovementActivityField).click();
        getWaitTime();
    }

    public void selectActivityDate4() throws InterruptedException {
        driver.findElement(activityDateField).click();
        driver.findElement(selectActivityDate).click();
    }

    public void typeInDescriptionOfActivityField4(String text) throws InterruptedException {
        driver.findElement(descriptionOfActivityField).clear();
        driver.findElement(descriptionOfActivityField).sendKeys(text);
    }

    public void typeInReflectiveEvaluation4Field(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluation4Field).clear();
        driver.findElement(reflectiveEvaluation4Field).sendKeys(text);
    }

    public void selectGMPDomainsCheckBox() throws InterruptedException {
        driver.findElement(gmpDomains4Field).click();

    }

    public void typeInSummaryReflection4Field(String text) throws InterruptedException {
        driver.findElement(summaryReflective4Field).clear();
        driver.findElement(summaryReflective4Field).sendKeys(text);
    }

    public void typeInAppraisersComments4Field(String text) throws InterruptedException {
        driver.findElement(appraisersComments4Field).clear();
        driver.findElement(appraisersComments4Field).sendKeys(text);
    }

    public void clickOnFourthSectionLink() {
        driver.findElement(fourthSectionLink).click();
    }

    public String getScopeOfWork4Text() throws InterruptedException {
        String te = driver.findElement(scopeOfWork4Field).getText();
        return te;
    }

    public String getImprovementActivity4Text() throws InterruptedException {
        String te = driver.findElement(improvementActivityField).getText();
        return te;
    }

    public SeniorAdminMapPage OpenSection4() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnFourthSectionLink();
        return this;
    }

    public void uploadFiles4() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-4 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime2();
    }

    public SeniorAdminMapPage CrudForSection4() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField4("Test1");
        getWaitTime();
        this.selectInScopeOfWork4();
        getWaitTime();
        this.selectImprovementActivity();
        getWaitTime();
        this.selectActivityDate4();
        getWaitTime();
        this.typeInDescriptionOfActivityField4("Test3");
        getWaitTime();
        this.typeInReflectiveEvaluation4Field("Test4");
        getWaitTime();
        this.selectGMPDomainsCheckBox();
        getWaitTime();
        this.typeInSummaryReflection4Field("Test6");
        getWaitTime();
        this.typeInAppraisersComments4Field("Test6");
        getWaitTime();
        return this;
    }

    // Section 5 ////////////////////////////////////////////////////////////////////////////////

    public void typeInTitleField5(String text) throws InterruptedException {
        driver.findElement(title5Field).clear();
        driver.findElement(title5Field).sendKeys(text);
    }

    public void selectInScopeOfWork5() throws InterruptedException {
        driver.findElement(scopeOfWork5Field).click();
        driver.findElement(scopeOfWorkField5Item).click();
        getWaitTime();
    }

    public void selectDate5() throws InterruptedException {
        driver.findElement(date5Field).click();
        driver.findElement(select5Date).click();
    }

    public void typeInDescription5Field(String text) throws InterruptedException {
        driver.findElement(description5Field).clear();
        driver.findElement(description5Field).sendKeys(text);
    }

    public void typeInReflectiveEvaluation5Field(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluation5Field).clear();
        driver.findElement(reflectiveEvaluation5Field).sendKeys(text);
    }

    public void selectGMPDomains5CheckBox() throws InterruptedException {
        driver.findElement(gmpDomains5Field).click();

    }

    public void typeInSummaryReflection5Field(String text) throws InterruptedException {
        driver.findElement(summaryReflective5Field).clear();
        driver.findElement(summaryReflective5Field).sendKeys(text);
    }

    public void typeInAppraisersComments5Field(String text) throws InterruptedException {
        driver.findElement(appraisersComments5Field).clear();
        driver.findElement(appraisersComments5Field).sendKeys(text);
    }


    public void clickOnFifthSection5Link() {
        driver.findElement(fifthSectionLink).click();
    }

    public String getScopeOfWork5Text() throws InterruptedException {
        String te = driver.findElement(scopeOfWork5Field).getText();
        return te;
    }

    public SeniorAdminMapPage OpenSection5() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnFifthSection5Link();
        return this;
    }

    public void uploadFiles5() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime();
    }

    public SeniorAdminMapPage CrudForSection5() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField5("Test1");
        getWaitTime();
        this.selectInScopeOfWork5();
        getWaitTime();
        this.selectDate5();
        getWaitTime();
        this.typeInDescription5Field("Test3");
        getWaitTime();
        this.typeInReflectiveEvaluation5Field("Test4");
        getWaitTime();
        this.selectGMPDomains5CheckBox();
        getWaitTime();
        this.typeInSummaryReflection5Field("Test6");
        getWaitTime();
        this.typeInAppraisersComments5Field("Test6");
        getWaitTime();
        return this;
    }

    // Section 6 ////////////////////////////////////////////////////////////////////////////////

    public void typeInTitleField6(String text) throws InterruptedException {
        driver.findElement(title6Field).clear();
        driver.findElement(title6Field).sendKeys(text);
    }

    public void selectInScopeOfWork6() throws InterruptedException {
        driver.findElement(scopeOfWork6Field).click();
        driver.findElement(scopeOfWorkField6Item).click();
        getWaitTime();
    }

    public void selectInFeedbackField6() throws InterruptedException {
        driver.findElement(typeOfFeedback6Field).click();
        driver.findElement(selectTypeOfFeedback6Item).click();
        getWaitTime();
    }

    public void selectDate6() throws InterruptedException {
        driver.findElement(date6Field).click();
        driver.findElement(select6Date).click();
    }

    public void typeInDescription6Field(String text) throws InterruptedException {
        driver.findElement(description6Field).clear();
        driver.findElement(description6Field).sendKeys(text);
    }

    public void typeInReflectiveEvaluation6Field(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluation6Field).clear();
        driver.findElement(reflectiveEvaluation6Field).sendKeys(text);
    }

    public void selectGMPDomains6CheckBox() throws InterruptedException {
        driver.findElement(gmpDomains6Field).click();

    }

    public void typeInAppraisersComments6Field(String text) throws InterruptedException {
        driver.findElement(appraisersComments6Field).clear();
        driver.findElement(appraisersComments6Field).sendKeys(text);
    }


    public void clickOnSixthSection6Link() {
        driver.findElement(sixthSectionLink).click();
    }

    public String getScopeOfWork6Text() throws InterruptedException {
        String te = driver.findElement(scopeOfWork6Field).getText();
        return te;
    }

    public String getTypeOfFeedback6Text() throws InterruptedException {
        String te = driver.findElement(typeOfFeedback6Field).getText();
        return te;
    }

    public SeniorAdminMapPage OpenSection6() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnSixthSection6Link();
        return this;
    }

    public void uploadFiles6() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-6 > div > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime();
    }

    public SeniorAdminMapPage CrudForSection6() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField6("Test1");
        getWaitTime();
        this.selectInScopeOfWork6();
        getWaitTime();
        this.selectInFeedbackField6();
        getWaitTime();
        this.selectDate6();
        getWaitTime();
        this.typeInDescription6Field("Test2");
        getWaitTime();
        this.typeInReflectiveEvaluation6Field("Test3");
        getWaitTime();
        this.selectGMPDomains6CheckBox();
        getWaitTime();
        this.typeInAppraisersComments6Field("Test6");
        getWaitTime();
        return this;
    }

    // Section 7 ////////////////////////////////////////////////////////////////////////////////

    public void typeInTitleField7(String text) throws InterruptedException {
        driver.findElement(title7Field).clear();
        driver.findElement(title7Field).sendKeys(text);
    }

    public void selectInScopeOfWork7() throws InterruptedException {
        driver.findElement(scopeOfWork7Field).click();
        driver.findElement(scopeOfWorkField7Item).click();
        getWaitTime();
    }

    public void setSelectTypeOfCompliment7Item() throws InterruptedException {
        driver.findElement(typeOfComplaintOrCompliment7Field).click();
        driver.findElement(selectTypeOfCompliment7Item).click();
        getWaitTime();
    }

    public void selectDate7() throws InterruptedException {
        driver.findElement(date7Field).click();
        driver.findElement(select7Date).click();
    }

    public void typeInDescription7Field(String text) throws InterruptedException {
        driver.findElement(description7Field).clear();
        driver.findElement(description7Field).sendKeys(text);
    }

    public void typeInReflectiveEvaluation7Field(String text) throws InterruptedException {
        driver.findElement(reflectiveEvaluation7Field).clear();
        driver.findElement(reflectiveEvaluation7Field).sendKeys(text);
    }

    public void selectGMPDomains7CheckBox() throws InterruptedException {
        driver.findElement(gmpDomains7Field).click();

    }

    public void typeInSummaryReflection7Field(String text) throws InterruptedException {
        driver.findElement(summaryReflection7Field).clear();
        driver.findElement(summaryReflection7Field).sendKeys(text);
    }

    public void typeInAppraisersComments7Field(String text) throws InterruptedException {
        driver.findElement(appraisersComments7Field).clear();
        driver.findElement(appraisersComments7Field).sendKeys(text);
    }


    public void clickOnSeventhSection7Link() {
        driver.findElement(seventhSectionLink).click();
    }

    public String getScopeOfWork7Text() throws InterruptedException {
        String te = driver.findElement(scopeOfWork7Field).getText();
        return te;
    }

    public String getTypeOfComplaintOrCompliment7Text() throws InterruptedException {
        String te = driver.findElement(typeOfComplaintOrCompliment7Field).getText();
        return te;
    }

    public SeniorAdminMapPage OpenSection7() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnSeventhSection7Link();
        return this;
    }

    public void uploadFiles7() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-7 > div > div > div.section-container > div:nth-child(10) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime();
    }

    public SeniorAdminMapPage CrudForSection7() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField7("Test1");
        getWaitTime();
        this.selectInScopeOfWork7();
        getWaitTime();
        this.setSelectTypeOfCompliment7Item();
        getWaitTime();
        this.selectDate7();
        getWaitTime();
        this.typeInDescription7Field("Test2");
        getWaitTime();
        this.typeInReflectiveEvaluation7Field("Test3");
        getWaitTime();
        this.selectGMPDomains7CheckBox();
        getWaitTime();
        this.typeInSummaryReflection7Field("Test4");
        getWaitTime();
        this.typeInAppraisersComments7Field("Test5");
        getWaitTime();
        return this;
    }

    // Section 10 ////////////////////////////////////////////////////////////////////////////////

    public void typeInTitleField10(String text) throws InterruptedException {
        driver.findElement(title10Field).clear();
        driver.findElement(title10Field).sendKeys(text);
    }

    public void selectInScopeOfWork10() throws InterruptedException {
        driver.findElement(scopeOfWork10Field).click();
        driver.findElement(scopeOfWorkField10Item).click();
        getWaitTime();
    }

    public void typeInDescription10Field(String text) throws InterruptedException {
        driver.findElement(description10Field).clear();
        driver.findElement(description10Field).sendKeys(text);
    }

    public void typeInAppraisersComments10Field(String text) throws InterruptedException {
        driver.findElement(appraisersComments10Field).clear();
        driver.findElement(appraisersComments10Field).sendKeys(text);
    }


    public void clickOnTenthSection10Link() {
        driver.findElement(tenthSectionLink).click();
    }

    public String getScopeOfWork10Text() throws InterruptedException {
        String te = driver.findElement(scopeOfWork10Field).getText();
        return te;
    }

    public SeniorAdminMapPage OpenSection10() throws InterruptedException {
        this.clickOnSectionMenuButton();
        getWaitTime();
        this.clickOnTenthSection10Link();
        return this;
    }

    public void uploadFiles10() throws InterruptedException {
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/1.bmp");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/2.doc");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/3.docx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/4.gif");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/5.heic");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/6.jpg");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/7.key");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/8.mov");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/9.mp3");
        getWaitTime();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/10.mp4");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/11.numbers");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/12.pages");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/13.pdf");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/14.png");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/15.ppt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/16.pptx");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/17.txt");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/18.xls");
        getWaitTime2();
        driver.findElement(By.cssSelector("#section-10 > div > div > div.section-container > div:nth-child(7) > div > div > div > input[type=file]")).sendKeys("/home/qa/IdeaProjects/MedSu/src/test/java/files/19.xlsx");
        getWaitTime();
    }

    public SeniorAdminMapPage CrudForSection10() throws InterruptedException {
        this.clickOnTheAddNewItemButton();
        getWaitTime();
        this.typeInTitleField10("Test1");
        getWaitTime();
        this.selectInScopeOfWork10();
        getWaitTime();
        this.typeInDescription10Field("Test2");
        getWaitTime();
        this.typeInAppraisersComments10Field("Test3");
        getWaitTime();
        return this;
    }

}

