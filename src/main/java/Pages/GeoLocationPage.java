package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeoLocationPage {
    private WebDriver driver;
    private By buttonLocator= By.tagName("button");
    private By latValueLocator=By.xpath("//p[@id='demo']/div[@id='lat-value']");
    private By longValueLocator=By.xpath("//div[@id='long-value']");
    public GeoLocationPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickButton(){
        driver.findElement(buttonLocator).click();
    }
    public double getLatValue(){
        return Double.parseDouble(driver.findElement(latValueLocator).getText());
    }
    public double getLongValue(){
        return Double.parseDouble(driver.findElement(longValueLocator).getText());
    }

}
