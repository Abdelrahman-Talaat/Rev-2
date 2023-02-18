package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.KeyPressesPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class KeyPressesTest extends BaseTest {

    protected HomePage homePage;
    protected KeyPressesPage keyPressesPage;
    @Test
    public void keyPressesTest(){
        String data="A";
        homePage=new HomePage(driver);
        keyPressesPage=new KeyPressesPage(driver);
        var keyPressesPage=homePage.clickKeyPresses();
        assertTrue(keyPressesPage.getPageTitle().contains("Key Presses"));
        keyPressesPage.setEnterData(data);
        assertTrue(keyPressesPage.getData().contains("You entered: "+data));
    }
}
