package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPageFactory extends BaseFactoryPage {

    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(1)")
    private WebElement checkboxes;
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(3)")
    private WebElement checkboxes1;

    public CheckboxesPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(Urls.CHECKBOXES);
    }

    public boolean Checkboxes() {
        boolean selectChekboxes = checkboxes.isSelected();
        return selectChekboxes;
    }

    public void clickCheckboxes() {
        checkboxes.click();
    }

    public boolean CheckboxesTwo() {
        boolean selectChekboxesTwo = checkboxes1.isSelected();
        return selectChekboxesTwo;
    }

    public void clickCheckboxesTwo() {
        checkboxes1.click();
    }
}
