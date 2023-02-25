package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class hoversPage {
    private WebDriver driver;
    private By figureLocator= By.xpath("//div[1]/img");
    private  By figureDataLocator=By.xpath("//div[1]/div/h5");

    public hoversPage(WebDriver driver){
        this.driver=driver;
    }
    public void hoverToFigure(){
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(figureLocator)).perform();
    }
    public String getFigureData(){
        return driver.findElement(figureDataLocator).getText();
    }
}
