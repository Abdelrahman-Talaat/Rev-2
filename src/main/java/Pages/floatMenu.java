package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class floatMenu {
    private WebDriver driver;
    private By homeMenuLocator=By.xpath("//a[@href='#home']");
    public floatMenu (WebDriver driver){
        this.driver=driver;
    }
    public void scrollDown() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
        /*Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_END);
    */
}
public String checkHomeMenuBar(){
        return driver.findElement(homeMenuLocator).getText();
}


}
