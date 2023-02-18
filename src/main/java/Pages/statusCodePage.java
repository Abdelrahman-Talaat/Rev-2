package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class statusCodePage {
    private WebDriver driver;
    private By verifyPage= By.tagName("h3");
    private By clickStatus200=By.xpath("//a[@href='status_codes/200']");
    private By statusCode200PageContent=By.tagName("p");
    public statusCodePage(WebDriver driver){
        this.driver=driver;
    }
    public String getPageTitle(){
        return driver.findElement(verifyPage).getText();
    }
    public void clickstatus200(){
        driver.findElement(clickStatus200).click();
    }
    public String getStatus200PageContent(){
        return driver.findElement(statusCode200PageContent).getText();
    }

}
