package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.floatMenu;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class floatMenuTest extends BaseTest {
    protected HomePage homePage;
    protected floatMenu floatMenu;
    @Test
    public void floatMenuTest(){
        homePage=new HomePage(driver);
        floatMenu=new floatMenu(driver);
        floatMenu=homePage.clickFloatMenu();
        floatMenu.scrollDown();
        assertTrue(floatMenu.checkHomeMenuBar().contains("Home"));
    }
}
