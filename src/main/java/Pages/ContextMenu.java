package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ContextMenu {
    private WebDriver driver;
    private By boxLocator= By.id("hot-spot");

    public ContextMenu(WebDriver driver){
        this.driver=driver;
    }

    public void clickBox(){
        Actions click= new Actions(driver);
        click.moveToElement(driver.findElement(boxLocator)).contextClick().perform();
        }
      public String moveToAlert(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
