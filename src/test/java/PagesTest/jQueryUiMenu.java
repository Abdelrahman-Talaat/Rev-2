package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.jQueryUiMenuPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class jQueryUiMenu extends BaseTest {
    protected HomePage homePage;
    protected jQueryUiMenuPage jQueryUiMenuPage;

    @Test
    public void jQueryUiTest(){
        homePage=new HomePage(driver);
        jQueryUiMenuPage=new jQueryUiMenuPage(driver);
        jQueryUiMenuPage=homePage.clickJqueryUiPage();
        jQueryUiMenuPage.clickEnable();
        jQueryUiMenuPage.backToJqueryPage();
        assertEquals(jQueryUiMenuPage.getPageTitle(),"JQuery UI");
        jQueryUiMenuPage.clickMenu();
        assertEquals(jQueryUiMenuPage.getPageTitle(),"JQueryUI - Menu");
    }
}
