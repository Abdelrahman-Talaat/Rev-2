package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class horizontalSliderPage {
    private WebDriver driver;
    private By sliderLocator= By.xpath("//input[@type='range']");
    private By rangeLocator=By.id("range");
    public horizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnSlider(Keys arrowRight){
        /*driver.findElement(sliderLocator).click();*/
        driver.findElement(sliderLocator).sendKeys(arrowRight);
    }
    public String getRangeValue(){
        return  driver.findElement(rangeLocator).getText();
    }

}
