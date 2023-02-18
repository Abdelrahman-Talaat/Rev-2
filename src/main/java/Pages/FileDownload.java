package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownload {
    private WebDriver driver;
    private By fileTxtLocator= By.xpath("//a[@href='download/file.txt']");

    public FileDownload(WebDriver driver){
        this.driver=driver;
    }
    public void downloadFileTxt(){
        driver.findElement(fileTxtLocator).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
