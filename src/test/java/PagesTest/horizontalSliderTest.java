package PagesTest;

import BaseTetst.BaseTest;
import Pages.HomePage;
import Pages.horizontalSliderPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class horizontalSliderTest extends BaseTest {
    protected HomePage homePage;
    protected horizontalSliderPage horizontalSliderPage;

    @Test
    public void horizontalSlider(){
        homePage=new HomePage(driver);
        horizontalSliderPage=new horizontalSliderPage(driver);
        horizontalSliderPage=homePage.clickHorizontalSlider();
        horizontalSliderPage.clickOnSlider(Keys.ARROW_RIGHT);
        horizontalSliderPage.clickOnSlider(Keys.ARROW_RIGHT);
        assertEquals(horizontalSliderPage.getRangeValue(),"1");

    }
}
