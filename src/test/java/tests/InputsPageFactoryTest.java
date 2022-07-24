package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.InputsPageFactory;

public class InputsPageFactoryTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        InputsPageFactory inputsPageFactory = new InputsPageFactory(driver);
        inputsPageFactory.openInputsPage();
        inputsPageFactory.ArrowUp();
        Assert.assertEquals(inputsPageFactory.numberInField(), "1");
    }

    @Test
    public void inputArrowDownTest() {
        InputsPageFactory inputsPageFactory = new InputsPageFactory(driver);
        inputsPageFactory.openInputsPage();
        inputsPageFactory.ArrowDown();
        Assert.assertEquals(inputsPageFactory.numberInField(), "-1");
    }
}
