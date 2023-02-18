package Pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By getPageTitle= By.tagName("h3");
    private By enterData=By.id("target");
    private By getData=By.id("result");
    public KeyPressesPage (WebDriver driver){
        this.driver=driver;
    }
    public String getPageTitle(){
        return driver.findElement(getPageTitle).getText();
    }
    public void setEnterData(String inputData){
        driver.findElement(enterData).sendKeys(inputData);
    }
    public String getData(){
        return driver.findElement(getData).getText();
    }

}
