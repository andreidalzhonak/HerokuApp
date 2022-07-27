package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListPageFactory extends BaseFactoryPage {
    @FindBy(id = "dropdown")
    private WebElement elementDropDown;
    @FindBy(id = "dropdown")
    private WebElement dropDownList;

    @FindBy(xpath = "//select[@id='dropdown']/option[@value='1']")
    private WebElement firstSelectOption1;

    @FindBy(xpath = "//select[@id='dropdown']/option[@value='2']")
    private WebElement twoSelectOption2;

    public DropdownListPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openDropDownListPage() {
        driver.get(Urls.DROPDOWNLIST);
    }

    public int getDropDown() {
        Select selectOption = new Select(dropDownList);
        List<WebElement> elementCount = selectOption.getOptions();
        return elementCount.size();
    }

    public boolean clickFirstSelect() {
        dropDownList.click();
        firstSelectOption1.click();
        boolean firstSelect = firstSelectOption1.isSelected();
        return firstSelect;
    }

    public boolean clickTwoSelect() {
        dropDownList.click();
        twoSelectOption2.click();
        boolean twoSelect = twoSelectOption2.isSelected();
        return twoSelect;
    }
}



