package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.formAuthenticationPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class formAuthenticationTest extends BaseTest {
    protected HomePage homePage;
    protected formAuthenticationPage formAuthenticationPage;
    @Test
    public void loginPage(){
        homePage=new HomePage(driver);
        formAuthenticationPage=new formAuthenticationPage(driver);
        var formAuthentication=homePage.clicklogin();
        formAuthentication.enterUserName("tomsmith");
        formAuthentication.enterPassword("SuperSecretPassword!");
        formAuthentication.clickSubmitButton();
        assertEquals(formAuthentication.verifyLoginProcess(),"You logged into a secure area!\n" +
                "×");

    }
}
