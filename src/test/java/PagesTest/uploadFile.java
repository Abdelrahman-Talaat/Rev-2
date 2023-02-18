package PagesTest;

import BaseTetst.BaseTest;
import Pages.FileUploadPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class uploadFile extends BaseTest {
    protected HomePage homePage;
    protected FileUploadPage fileUploadPage;
    @Test
    public void FileUploadTest(){
        homePage=new HomePage(driver);
        fileUploadPage=new FileUploadPage(driver);
        fileUploadPage=homePage.clickFileUpload();
        fileUploadPage.chooseFile("E:/testing/certificates/database.pdf");
        fileUploadPage.clickUpload();
        assertTrue(fileUploadPage.checkUploadedFile().contains("database.pdf"));

    }
}
