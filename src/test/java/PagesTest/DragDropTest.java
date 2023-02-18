package PagesTest;

import BaseTetst.BaseTest;
import Pages.DragDrop;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class DragDropTest extends BaseTest {
    protected HomePage homePage;
    protected DragDrop dragDrop;

    @Test
    public void dragDropTest(){
        homePage=new HomePage(driver);
        dragDrop=new DragDrop(driver);
        var dragDrop=homePage.clickDragDrop();
        assertTrue(dragDrop.getPageHeader().contains("Drag and Drop"));
        dragDrop.dragDrop();
         assertTrue(dragDrop.verifyTextAfterDragDrop().contains("B"));
    }
}
