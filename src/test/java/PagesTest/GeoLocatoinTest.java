package PagesTest;

import BaseTetst.BaseTest;
import Pages.GeoLocationPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeoLocatoinTest extends BaseTest {
    protected HomePage homePage;
    protected GeoLocationPage geoLocationPage;

    @Test
    public void geoLocationTest(){
        homePage=new HomePage(driver);
        geoLocationPage=new GeoLocationPage(driver);
        geoLocationPage=homePage.clickGeoLocation();
        geoLocationPage.clickButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println("Latitude vale ="+geoLocationPage.getLatValue());


    }
}
