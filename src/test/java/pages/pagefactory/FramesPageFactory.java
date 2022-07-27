
package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FramesPageFactory extends BaseFactoryPage {

    @FindBy(id = "draggable")
    private WebElement Drag;

    @FindBy(id = "droppable")
    private WebElement Drop;

    @FindBy(css = "#content > iframe")
    private WebElement iFrame;

    @FindBy(css = "#droppable > p")
    private WebElement textDropped;

    public FramesPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openFramesPage() {
        driver.get(Urls.FRAMES);
    }

    public String actionDragAndDrop() {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(iFrame);
        actions.dragAndDrop(Drag, Drop).build().perform();
        String a = Drop.getText();
        return a;
    }
}
