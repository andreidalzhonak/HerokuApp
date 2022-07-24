package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagesPageFactory extends BaseFactoryPage {
    @FindBy(xpath = "//*[@id=\"content\"]/div/p/a")
    private WebElement clickButton;
    @FindBy(css = "#flash")
    private WebElement notificationMessage;

    public NotificationMessagesPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATIONMESSAGES);
    }

    public void clickHereButton() {
        clickButton.click();
    }

    public String expectedSuccessfulMessage() {
        String actionSuccessful = notificationMessage.getText();
        return actionSuccessful;
    }
}