package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.TyposPageFactory;

public class TyposPageFactoryTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        TyposPageFactory typosPageFactory = new TyposPageFactory(driver);
        typosPageFactory.openTyposPage();
        Assert.assertEquals(typosPageFactory.checkTypoText(), "Sometimes you'll see a typo, other times you won't.");
    }
}

