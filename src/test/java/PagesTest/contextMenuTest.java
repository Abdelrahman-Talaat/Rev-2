package PagesTest;

import BaseTetst.BaseTest;
import Pages.ContextMenu;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class contextMenuTest extends BaseTest {
    protected HomePage homePage;
    protected ContextMenu contextMenu;

    @Test
    public void contextTest(){
        homePage=new HomePage(driver);
        contextMenu=new ContextMenu(driver);
        var contextMenu=homePage.clickContextMenue();
        contextMenu.clickBox();
        assertTrue(contextMenu.moveToAlert().contains("You selected a context menu"));
        contextMenu.acceptAlert();
    }
}
