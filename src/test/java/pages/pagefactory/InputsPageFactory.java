package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputsPageFactory extends BaseFactoryPage {

    @FindBy(xpath = "//input[@type='number']")
    private WebElement inputField;

    public InputsPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(Urls.INPUTS);
    }

    public void ArrowUp() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void ArrowDown() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String numberInField() {
        String fieldNumber = inputField.getAttribute("value");
        return fieldNumber;
    }

}
