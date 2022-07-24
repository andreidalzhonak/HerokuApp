package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.CheckboxesPageFactory;

public class CheckBoxesPageFactoryTest extends BaseTest {
    @Test
    public void checkbox1IsNotCheckedTest() {
        CheckboxesPageFactory checkboxesPageFactory = new CheckboxesPageFactory(driver);
        checkboxesPageFactory.openCheckboxesPage();
        Assert.assertFalse(checkboxesPageFactory.Checkboxes());
    }

    @Test
    public void checkbox1CheckedTest() {
        CheckboxesPageFactory checkboxesPageFactory = new CheckboxesPageFactory(driver);
        checkboxesPageFactory.openCheckboxesPage();
        checkboxesPageFactory.clickCheckboxes();
        Assert.assertTrue(checkboxesPageFactory.Checkboxes());
    }


    @Test
    public void checkbox2IsCheckedTest() {
        CheckboxesPageFactory checkboxesPageFactory = new CheckboxesPageFactory(driver);
        checkboxesPageFactory.openCheckboxesPage();
        Assert.assertTrue(checkboxesPageFactory.CheckboxesTwo());
    }

    @Test
    public void checkbox2IsNotCheckedTest() {
        CheckboxesPageFactory checkboxesPageFactory = new CheckboxesPageFactory(driver);
        checkboxesPageFactory.openCheckboxesPage();
        checkboxesPageFactory.clickCheckboxesTwo();
        Assert.assertFalse(checkboxesPageFactory.CheckboxesTwo());
    }
}
