package tests;

import pages.LogInPage;
import pages.SeniorAminPages.SeniorAdminMapPage;
import pages.SeniorAminPages.SeniorAdminProfilePage;
import testdata.TestDataInformation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CrudTest extends TestDataInformation {


    @Before
    public void setUP() {
        beforeMethod();
        driver.get("");
    }
    // Section 1

    @Test
    public void crudTestInForSection1() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection1();
        getWaitTime();
        s.CrudForSection1();
        getWaitTime();
        s.uploadFiles();
        getWaitTime();
        s.selectMethod();
        getWaitTime();
        driver.navigate().refresh();
        getWaitTime();
        // Assert.assertEquals("Test1", s.getTitleText());
//        Assert.assertEquals("Test2", s.getDetailOfWorkText());
//        Assert.assertEquals("Test3", s.getLengthOfTimeText());
//        Assert.assertEquals("Test4", s.getPracticeSettingText());
//        Assert.assertEquals("Test5", s.getQualificationText());
        Assert.assertEquals("Managerial", s.getCategoryOfWorkText());
        Assert.assertEquals("Ad Hoc", s.getFrequencyText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();


    }

    // Section 2

    @Test
    public void crudTestForSection2() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection2();
        getWaitTime();
        s.CrudForSection2();
        getWaitTime();
        s.uploadFiles2();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection2();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWorkText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 3

    @Test
    public void crudTestForSection3() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection3();
        getWaitTime();
        s.CrudForSection3();
        getWaitTime();
        s.uploadFiles3();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection3();
        getWaitTime();
        Assert.assertEquals("Academic", s.getCPDTypeText());
        Assert.assertEquals("In Progress", s.getCPDProgressText());
        Assert.assertEquals("Cross Role", s.getScopeOfWorkText());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 4

    @Test
    public void crudTestForSection4() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection4();
        getWaitTime();
        s.CrudForSection4();
        getWaitTime();
        s.uploadFiles4();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection4();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWork4Text());
        Assert.assertEquals("Audit", s.getImprovementActivity4Text());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 5

    @Test
    public void crudTestForSection5() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection5();
        getWaitTime();
        s.CrudForSection5();
        getWaitTime();
        s.uploadFiles5();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection5();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWork5Text());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 6

    @Test
    public void crudTestForSection6() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection6();
        getWaitTime();
        s.CrudForSection6();
        getWaitTime();
        s.uploadFiles6();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection6();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWork6Text());
        Assert.assertEquals("Patient", s.getTypeOfFeedback6Text());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 7

    @Test
    public void crudTestForSection7() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection7();
        getWaitTime();
        s.CrudForSection7();
        getWaitTime();
        s.uploadFiles7();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection7();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWork7Text());
        Assert.assertEquals("Complaint", s.getTypeOfComplaintOrCompliment7Text());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }

    // Section 10

    @Test
    public void crudTestForSection10() throws InterruptedException {
        LogInPage log = new LogInPage();
        Assert.assertEquals("Login", log.logInPageHeader());
        log.logIn(senioradminusername, userpassword);
        getWaitTime();
        SeniorAdminProfilePage login = new SeniorAdminProfilePage();
        Assert.assertEquals("Profile", login.userProfileHeader());
        getWaitTime();
        Assert.assertEquals("senior.admin@medsu.net", senioradminusername);
        getWaitTime();
        login.OpenMap();
        getWaitTime();
        driver.get("https://dev:dev@map1.medsu.net/my-map");
        getWaitTime();
        SeniorAdminMapPage s = new SeniorAdminMapPage();
        s.OpenSection10();
        getWaitTime();
        s.CrudForSection10();
        getWaitTime();
        s.uploadFiles10();
        getWaitTime();
        driver.navigate().refresh();
        s.OpenSection10();
        getWaitTime();
        Assert.assertEquals("Cross Role", s.getScopeOfWork10Text());
        Assert.assertEquals("1.bmp", s.getItem1Text());
        Assert.assertEquals("2.doc", s.getItem2Text());
        Assert.assertEquals("3.docx", s.getItem3Text());
        Assert.assertEquals("4.gif", s.getItem4Text());
        Assert.assertEquals("5.heic", s.getItem5Text());
        Assert.assertEquals("6.jpg", s.getItem6Text());
        Assert.assertEquals("7.key", s.getItem7Text());
        Assert.assertEquals("8.mov", s.getItem8Text());
        Assert.assertEquals("9.mp3", s.getItem9Text());
        Assert.assertEquals("10.mp4", s.getItem10Text());
        Assert.assertEquals("11.numbers", s.getItem11Text());
        Assert.assertEquals("12.pages", s.getItem12Text());
        Assert.assertEquals("13.pdf", s.getItem13Text());
        Assert.assertEquals("14.png", s.getItem14Text());
        Assert.assertEquals("15.ppt", s.getItem15Text());
        Assert.assertEquals("16.pptx", s.getItem16Text());
        Assert.assertEquals("17.txt", s.getItem17Text());
        Assert.assertEquals("18.xls", s.getItem18Text());
        Assert.assertEquals("19.xlsx", s.getItem19Text());
        getWaitTime();
        s.deleteItem();

    }
    @After
    public void tearDown() throws InterruptedException {
        getWaitTime();
        driver.quit();
    }
}
