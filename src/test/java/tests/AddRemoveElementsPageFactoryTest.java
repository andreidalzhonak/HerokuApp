package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.AddRemoveElementsPageFactory;

public class AddRemoveElementsPageFactoryTest extends BaseTest {
    @Test
    public void addTwoButtonTest() {
        AddRemoveElementsPageFactory addRemoveElementsPageFactory = new AddRemoveElementsPageFactory(driver);
        addRemoveElementsPageFactory.openAddElementPage();
        addRemoveElementsPageFactory.clickAddElement();
        addRemoveElementsPageFactory.clickAddElement();
        //Add check
        Assert.assertEquals(addRemoveElementsPageFactory.checkElement(), 2);

    }

    @Test
    public void deleteButtonTest() {
        AddRemoveElementsPageFactory addRemoveElementsPageFactory = new AddRemoveElementsPageFactory(driver);
        addRemoveElementsPageFactory.openAddElementPage();
        addRemoveElementsPageFactory.clickAddElement();
        addRemoveElementsPageFactory.clickAddElement();
        addRemoveElementsPageFactory.pressDeleteButton();
        Assert.assertEquals(addRemoveElementsPageFactory.checkElement(), 1);
    }
}
