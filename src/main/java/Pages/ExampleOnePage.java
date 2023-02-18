package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class ExampleOnePage {
    public WebDriver driver;
    private By pageHeaderLocator= By.xpath("//div[@class='example']/h4");
    private By startButtonLocator=By.tagName("button");
    private By loadingImgLocator=By.id("loading");
    private By textLocator=By.id("finish");
    public ExampleOnePage(WebDriver driver){
        this.driver=driver;
    }
    public String getPageHeader(){
        return driver.findElement(pageHeaderLocator).getText();
    }
    public void clickStartButton(){
        driver.findElement(startButtonLocator).click();

    }
    public void loadingWait() {
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImgLocator)));

        }
       public String getText2(){
        return driver.findElement(textLocator).getText();
    }
    }

