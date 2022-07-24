package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TyposPageFactory extends BaseFactoryPage{
    @FindBy(css = "#content > div > p:nth-child(3)")
    private WebElement typoText;
    public TyposPageFactory(WebDriver driver) {
        super(driver);
    }
    public void openTyposPage() {
        driver.get(Urls.TYPOS);
    }
    public String checkTypoText() {
        for (int i = 0; i < 6; i++) {
            driver.navigate().refresh();
            String typoMessage = typoText.getText();
            return typoMessage;
        }
        return null;
    }
}
