package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class infinteScrollPage {
    private WebDriver driver;
    private By pageHeader = By.tagName("h3");
    private By pageBody=By.cssSelector("body");

    public  infinteScrollPage(WebDriver driver){
        this.driver=driver;
    }
    public String verifyPageHeader(){
        return driver.findElement(pageHeader).getText();
    }
    public void scrollDown(){
        driver.findElement(pageBody).sendKeys(Keys.CONTROL,Keys.END);
    }

}
