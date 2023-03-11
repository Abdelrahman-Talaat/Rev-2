package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class jQueryUiMenuPage {
    private WebDriver driver;
    private By clickEnableLocator= By.xpath("//li[@id='ui-id-3']/a[@href='#']");
    private By clickDownloads=By.xpath("//li[@id='ui-id-4']");
    private By downloadPdf=By.xpath("//a[@href='/download/jqueryui/menu/menu.pdf']");
    private By downloadCSV=By.xpath("//a[@href='/download/jqueryui/menu/menu.csv']");
    private By downloadExcel=By.xpath("//a[@href='/download/jqueryui/menu/menu.xls']");
    private By backToJqueryUi=By.xpath("//a[@href='/jqueryui']");
    private By jQueryUiPageRedirection=By.tagName("h3");
    private By redirectionToMenuPageLocator=By.xpath("//a[@href='/jqueryui/menu']");
     public jQueryUiMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickEnable(){
        driver.findElement(clickEnableLocator).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    public void clickDownloads(){
        driver.findElement(clickDownloads).click();

    }
    public void downloadPdf(){
        driver.findElement(downloadPdf).click();
    }
    public void downloadCSV(){
        driver.findElement(downloadCSV).click();
    }
    public void downloadExcel(){
        driver.findElement(downloadExcel).click();
    }
    public void backToJqueryPage(){
        driver.findElement(backToJqueryUi).click();
    }
    public String getPageTitle(){
         return driver.findElement(jQueryUiPageRedirection).getText();
    }
    public void clickMenu(){
         driver.findElement(redirectionToMenuPageLocator).click();
    }



}
