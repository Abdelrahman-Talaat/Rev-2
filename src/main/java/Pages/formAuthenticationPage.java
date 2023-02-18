package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formAuthenticationPage {
    private WebDriver driver;
    private By userNameLocator= By.xpath("//input[@name='username']");
    private By passwordLocator=By.xpath("//input[@name='password']");
    private By submitButtonLocator=By.xpath("//button[@type='submit']");
    private By messageLocator  = By.id("flash");
     public formAuthenticationPage(WebDriver driver){
         this.driver=driver;
     }
     public void enterUserName(String userName){
         driver.findElement(userNameLocator).sendKeys(userName);
     }
     public void enterPassword(String password){
         driver.findElement(passwordLocator).sendKeys(password);
     }
     public void clickSubmitButton(){
         driver.findElement(submitButtonLocator).click();
     }
     public String verifyLoginProcess(){
       return   driver.findElement(messageLocator).getText();
     }

}
