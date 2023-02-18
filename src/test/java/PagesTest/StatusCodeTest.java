package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.statusCodePage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class StatusCodeTest extends BaseTest {
    protected HomePage homePage;
    protected statusCodePage statusCodePage;
    @Test
    public void StatusCodeTest(){
        homePage=new HomePage(driver);
        statusCodePage=new statusCodePage(driver);
        var statusCodePage=homePage.clickStatusCode();
       assertTrue(statusCodePage.getPageTitle().contains("Status Codes"));
       statusCodePage.clickstatus200();
       assertTrue(statusCodePage.getStatus200PageContent().contains("This page returned a 200 status code."));
    }
}
