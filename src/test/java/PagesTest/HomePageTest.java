package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class HomePageTest extends BaseTest {
     protected HomePage homePage;
    @Test
    public void homePage(){
        homePage=new HomePage(driver);
       assertEquals(homePage.getWelcomeMessage(),"Welcome to the-internet");
    }
}
