package PagesTest;

import BaseTetst.BaseTest;
import Pages.DynamicLoading;
import Pages.ExampleTwoPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class Example2LoadingTest extends BaseTest {
    protected HomePage homePage;
    protected DynamicLoading dynamicLoading;
    protected ExampleTwoPage exampleTwoPage;
    @Test
    public void loadingTest(){
        homePage=new HomePage(driver);
        dynamicLoading=new DynamicLoading(driver);
        exampleTwoPage=new ExampleTwoPage(driver);
        dynamicLoading=homePage.clickDynamicLoading();
        exampleTwoPage=dynamicLoading.clickExampleTwo();
        assertTrue(exampleTwoPage.getPageHeader().contains("Example 2: Element rendered after the fact"));
        exampleTwoPage.clickStartButton();
        exampleTwoPage.loadingWait();
        assertTrue(exampleTwoPage.getText2().contains("Hello World!"));

    }
}
