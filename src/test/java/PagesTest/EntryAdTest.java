package PagesTest;

import BaseTetst.BaseTest;
import Pages.EntryAdPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class EntryAdTest extends BaseTest {
    protected HomePage homePage;
    protected EntryAdPage entryAdPage;

    @Test(priority= 1)
    public void EntryAdTest(){
        homePage=new HomePage(driver);
        entryAdPage=new EntryAdPage(driver);
        entryAdPage=homePage.clickEntryAd();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
          /*  assertTrue(entryAdPage.getModalWindowHeader().contains("This is a modal window"));*/
        assertTrue(entryAdPage.getWindowBodyContent().contains("It's commonly used to encourage"));
        entryAdPage.clickClose();

    }
}
