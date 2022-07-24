package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddRemoveElementsPageFactory extends BaseFactoryPage {

    @FindBy(xpath = "//*[@id='content']/div/button")
    private WebElement addButton;

    @FindBy(id = "elements")
    private WebElement tableDelete;


    @FindBy(css = "#elements > button:nth-child(1)")
    private WebElement deleteButton;

    public AddRemoveElementsPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openAddElementPage() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS);
    }

    public void clickAddElement() {
        addButton.click();
    }

    public int checkElement() {
        List<WebElement> list = tableDelete.findElements(By.className("added-manually"));
        int ButtonDelete = list.size();
        return ButtonDelete;
    }

    public void pressDeleteButton() {
        deleteButton.click();
    }
}
