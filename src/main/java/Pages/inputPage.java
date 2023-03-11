package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class inputPage {
    private WebDriver driver;
    private By numberBox= By.xpath("//input[@type='number']");

    public inputPage(WebDriver driver){
        this.driver=driver;
    }
    public  void increaseNumbering(Keys arrowUp){
        driver.findElement(numberBox).sendKeys(arrowUp);
    }
    public String getAssignedNumber(){
        return (driver.findElement(numberBox).getText());
    }
}
