package PagesTest;

import BaseTetst.BaseTest;
import Pages.DynamicLoading;
import Pages.ExampleOnePage;
import Pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class example1LoadingTest extends BaseTest {
    protected HomePage homePage;
    protected DynamicLoading dynamicLoading;
    protected ExampleOnePage exampleOnePage;


    @Test
    public void LoadingTest1() {
        homePage = new HomePage(driver);
        dynamicLoading = new DynamicLoading(driver);
        exampleOnePage = new ExampleOnePage(driver);

       homePage.clickDynamicLoading();
       dynamicLoading.clickExampleOne();
        assertTrue(exampleOnePage.getPageHeader().contains("Example 1: Element on page that is hidden"));
        exampleOnePage.clickStartButton();
        exampleOnePage.loadingWait();
        assertTrue(exampleOnePage.getText2().contains("Hello World!"));
    }
}
