package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By modalWindowTitleLocator = By.xpath("//div[@class='modal-title']/h3");
    private By closeButtonLocator=By.xpath("//div[@class='modal-footer']");
    private By modalWindowBodyLocator=By.xpath("//div[@class='modal-body']/p");

    public EntryAdPage(WebDriver driver){
        this.driver=driver;
    }
    public String getModalWindowHeader(){
        return driver.findElement(modalWindowTitleLocator).getText();
    }
    public void clickClose(){
        driver.findElement(closeButtonLocator).click();
    }
    public String getWindowBodyContent(){
        return driver.findElement(modalWindowBodyLocator).getText();
    }
}
