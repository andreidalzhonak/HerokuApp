
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.FramesPageFactory;


public class FramesPageFactoryTest extends BaseTest {
    @Test
    public void dragAndDropTest() {
        FramesPageFactory framesPageFactory = new FramesPageFactory(driver);
        framesPageFactory.openFramesPage();
        Assert.assertEquals(framesPageFactory.actionDragAndDrop(), "Dropped!");
    }
}

