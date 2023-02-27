package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.infinteScrollPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class infiniteScrollTest extends BaseTest {
    protected HomePage homePage;
    protected infinteScrollPage infinteScrollPage;

    @Test
    public void ScrollTest(){
        homePage=new HomePage(driver);
        infinteScrollPage=new infinteScrollPage(driver);
        infinteScrollPage=homePage.clickInfiniteScroll();
        infinteScrollPage.scrollDown();
        assertEquals(infinteScrollPage.verifyPageHeader(),"Infinite Scroll");

    }
}
