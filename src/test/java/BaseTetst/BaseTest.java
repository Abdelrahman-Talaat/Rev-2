package BaseTetst;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    @BeforeClass
      public void setUp(){
        WebDriverManager.chromedriver().setup();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");




    }
/*
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
*/

}
