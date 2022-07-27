package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.DropdownListPageFactory;


public class DropdownListPageFactoryPageTest extends BaseTest {
    @Test
    public void takeAllElementsDropDown() {
        DropdownListPageFactory dropdownListPageFactory = new DropdownListPageFactory(driver);
        dropdownListPageFactory.openDropDownListPage();
        dropdownListPageFactory.getDropDown();
        Assert.assertEquals(dropdownListPageFactory.getDropDown(), 3);
    }

    @Test
    public void selectFirstElementsDropDown() {
        DropdownListPageFactory dropdownListPageFactory = new DropdownListPageFactory(driver);
        dropdownListPageFactory.openDropDownListPage();
        Assert.assertTrue(dropdownListPageFactory.clickFirstSelect());
    }

    @Test
    public void selectTwoElementsDropDown() {
        DropdownListPageFactory dropdownListPageFactory = new DropdownListPageFactory(driver);
        dropdownListPageFactory.openDropDownListPage();
        Assert.assertTrue(dropdownListPageFactory.clickTwoSelect());
    }
}
