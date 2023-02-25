package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.hoversPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class HoversTest extends BaseTest {
    protected HomePage homePage;
    protected hoversPage hoversPage;

    @Test
    public void hover(){
        homePage=new HomePage(driver);
        hoversPage=new hoversPage(driver);
        hoversPage=homePage.clickHovers();
        hoversPage.hoverToFigure();
        assertEquals(hoversPage.getFigureData(),"name: user1");

    }
}
