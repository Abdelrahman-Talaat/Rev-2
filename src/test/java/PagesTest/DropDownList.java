package PagesTest;

import BaseTetst.BaseTest;
import Pages.DropdownList;
import Pages.HomePage;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DropDownList extends BaseTest {
    protected HomePage homePage;
    protected DropdownList dropdownList;
    @Test
    public void DropdownList(){
        homePage=new HomePage(driver);
        dropdownList=new DropdownList(driver);
        var dropdownList=homePage.clickDropDown();
        assertTrue(dropdownList.verifyDropDownPageTitle().contains("Dropdown List"));
        dropdownList.selectOption("Option 1");
        assertTrue(dropdownList.getSelectedOption().contains("Option 1"));
    }
}
