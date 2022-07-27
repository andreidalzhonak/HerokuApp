package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPageFactory extends BaseFactoryPage {
    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
    private WebElement clickForJsAlert;

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
    private WebElement clickForJsConfirm;

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/button")
    private WebElement clickForJsPromt;

    @FindBy(id = "result")
    private WebElement message;


    public JavaScriptAlertsPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openJavaScriptAlertPage() {
        driver.get(Urls.JAVASCRIPTALERTS);
    }

    public void clickForJSAlertButton() {
        clickForJsAlert.click();
    }

    public void clickForJSConfirmButton() {
        clickForJsConfirm.click();
    }

    public void clickForJSPromtButton() {
        clickForJsPromt.click();
    }

    public String getMessageAlert() {
        Alert alert = driver.switchTo().alert();
        String messageJsAlert = alert.getText();
        alert.accept();
        return messageJsAlert;
    }

    public String getMessageConfirm() {
        Alert alert = driver.switchTo().alert();
        String messageJsConfirm = alert.getText();
        alert.dismiss();
        return messageJsConfirm;
    }

    public void getMessagePromt() {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Promt alert");
        alert.accept();
    }

    public String messageOfPage() {
        String messageResult = message.getText();
        return messageResult;
    }
}

