package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownList {
    private WebDriver driver;
    private By selectedOptionLocator= By.xpath("//select[@id='dropdown']");
    private By dropDownPageTitle=By.tagName("h3");
    public DropdownList(WebDriver driver){
        this.driver=driver;
    }
    public String verifyDropDownPageTitle(){
        return driver.findElement(dropDownPageTitle).getText();
    }
    public void selectOption(String option){
        Select select=new Select(driver.findElement(selectedOptionLocator));
        select.selectByVisibleText(option);

    }
    public List<String> getSelectedOption(){
        Select select=new Select(driver.findElement(selectedOptionLocator));
        List<WebElement> selectedOptions=select.getAllSelectedOptions();
        return selectedOptions.stream().map(e->e .getText()).collect(Collectors.toList());
    }
}
