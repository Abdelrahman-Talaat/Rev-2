package PagesTest;

import BaseTetst.BaseTest;
import Pages.FileDownload;
import Pages.HomePage;
import org.testng.annotations.Test;

public class downloaFileTest extends BaseTest {
    protected HomePage homePage;
    protected FileDownload fileDownload;
    @Test
    public void FileDownloadTest(){
        homePage=new HomePage(driver);
        fileDownload=new FileDownload(driver);
        fileDownload=homePage.clickFileDownload();
        fileDownload.downloadFileTxt();
    }
}
