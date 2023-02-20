package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   private WebDriver driver;
    private By welcomeMessageLocator= By.xpath("//h1[@class='heading']");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getWelcomeMessage(){
        return driver.findElement(welcomeMessageLocator).getText();
    }

    public formAuthenticationPage clicklogin(){
        clickLink("//a[@href='/login']");
        return new formAuthenticationPage(driver);
    }
    public DropdownList clickDropDown(){
        clickLink("//a[@href='/dropdown']");
        return new DropdownList(driver);
    }
    public statusCodePage clickStatusCode(){
        clickLink("//a[@href='/status_codes']");
        return new statusCodePage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("//a[@href='/key_presses']");
        return new KeyPressesPage(driver);
    }
    public ContextMenu clickContextMenue(){
        clickLink("//a[@href='/context_menu']");
        return new ContextMenu(driver);
    }
    public DragDrop clickDragDrop(){
        clickLink("//a[@href='/drag_and_drop']");
        return new DragDrop(driver);
    }
    public DynamicLoading clickDynamicLoading(){
        clickLink("//a[@href='/dynamic_loading']");
        return new DynamicLoading(driver);
    }
    public EntryAdPage clickEntryAd(){
        clickLink("//a[@href='/entry_ad']");
        return new EntryAdPage(driver);
    }
   public FileDownload clickFileDownload(){
        clickLink("//a[@href='/download']");
        return new FileDownload(driver);
   }
   public FileUploadPage clickFileUpload(){
        clickLink("//a[@href='/upload']");
        return new FileUploadPage(driver);
   }
   public floatMenu clickFloatMenu(){
        clickLink("//a[@href='/floating_menu']");
        return new floatMenu(driver);
   }
   public framesPage clickFrames(){
        clickLink("//a[@href='/frames']");
        return new framesPage(driver);
   }
   public GeoLocationPage clickGeoLocation(){
        clickLink("//a[@href='/geolocation']");
        return new GeoLocationPage(driver);
   }
   public horizontalSliderPage clickHorizontalSlider(){
        clickLink("//a[@href='/horizontal_slider']");
        return new horizontalSliderPage(driver);
   }
    public void clickLink(String linkLocator){
        driver.findElement(By.xpath(linkLocator)).click();
    }
}
