package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class framesPage {
    private WebDriver driver;
    private By clickIframe= By.xpath("//a[@href='/iframe']");
    private By frameBody=By.id("tinymce");
    private By frameLocator=By.id("mce_0_ifr");
    private By increaseIndentButton=By.xpath("//button[@title='Increase indent']");

    public framesPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickIframe(){
        driver.findElement(clickIframe).click();
    }
    public void setData(String data){
        switchIntoFrame();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(frameBody).clear();
        switchToParentFrame();
        driver.findElement(increaseIndentButton).click();
        switchIntoFrame();
        driver.findElement(frameBody).sendKeys(data);
    }

    public String getEnteredData(){
     return   driver.findElement(frameBody).getText();
    }





    public void switchIntoFrame(){
        driver.switchTo().frame(driver.findElement(frameLocator));

    }
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

}
