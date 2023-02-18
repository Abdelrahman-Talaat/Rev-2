package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTwoPage {
    private WebDriver driver;
    private By pageHeaderLocator= By.xpath("//div[@class='example']/h4");
    private By startButtonLocator=By.tagName("button");
    private By loadingImgLocator=By.id("loading");
    private By textLocator=By.id("finish");
    public ExampleTwoPage(WebDriver driver){
        this.driver=driver;
    }

    public String getPageHeader(){
        return driver.findElement(pageHeaderLocator).getText();
    }
    public void clickStartButton(){
        driver.findElement(startButtonLocator).click();

    }
    public void loadingWait() {
        FluentWait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingImgLocator)));

    }
    public String getText2(){
        return driver.findElement(textLocator).getText();
    }
}

