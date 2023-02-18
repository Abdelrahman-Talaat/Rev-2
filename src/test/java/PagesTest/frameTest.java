package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.framesPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class frameTest extends BaseTest {
    protected HomePage homePage;
    protected framesPage framesPage;
    @Test
    public void frameTest(){
        homePage=new HomePage(driver);
        framesPage=new framesPage(driver);
        framesPage=homePage.clickFrames();
        framesPage.clickIframe();
        framesPage.setData("Hello");
        assertTrue(framesPage.getEnteredData().contains("Hello"));
    }
}
