package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.inputPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class inputTest extends BaseTest {
    protected HomePage homePage;
    protected inputPage inputPage;

    @Test
    public void inputTest(){
        homePage=new HomePage(driver);
        inputPage=new inputPage(driver);
        inputPage=homePage.clickInputPage();
        inputPage.increaseNumbering(Keys.ARROW_UP);
        inputPage.increaseNumbering(Keys.ARROW_UP);
      /*  assertEquals(inputPage.getAssignedNumber(),"2");*/

            assertEquals(Integer.parseInt(inputPage.getAssignedNumber()),3);


    }
}
