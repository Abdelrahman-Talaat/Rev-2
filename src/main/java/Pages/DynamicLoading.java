package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
   private WebDriver driver;
    private By clickExampleOneLocator= By.xpath("//a[@href='/dynamic_loading/1']");
    private By clickExampleTwoLocator= By.xpath("//a[@href='/dynamic_loading/2']");

    public DynamicLoading (WebDriver driver){
        this.driver=driver;
    }
    public ExampleOnePage clickExampleOne(){
        driver.findElement(clickExampleOneLocator).click();
        return new ExampleOnePage(driver);
    }
    public ExampleTwoPage clickExampleTwo(){
        driver.findElement(clickExampleTwoLocator).click();
        return new ExampleTwoPage(driver);
    }
}
