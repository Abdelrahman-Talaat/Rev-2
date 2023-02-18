package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFileLocator= By.id("file-upload");
    private By uploadFileLocator=By.id("file-submit");
    private By uploadedFileLocator=By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void chooseFile(String filePath){
      /*  driver.findElement(chooseFileLocator).click();*/
        driver.findElement(chooseFileLocator).sendKeys(filePath);
    }


    public void clickUpload(){
        driver.findElement(uploadFileLocator).click();
    }
    public String checkUploadedFile(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.findElement(uploadedFileLocator).getText();
    }
}
