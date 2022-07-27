package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.JavaScriptAlertsPageFactory;

public class JavaScriptAlertsPageFactoryTest extends BaseTest {
    @Test
    public void clickForJSAlert() {
        JavaScriptAlertsPageFactory javaScriptAlertsPageFactory = new JavaScriptAlertsPageFactory(driver);
        javaScriptAlertsPageFactory.openJavaScriptAlertPage();
        javaScriptAlertsPageFactory.clickForJSAlertButton();
        Assert.assertEquals(javaScriptAlertsPageFactory.getMessageAlert(), "I am a JS Alert");
    }

    @Test
    public void clickForJSConfirm() {
        JavaScriptAlertsPageFactory javaScriptAlertsPageFactory = new JavaScriptAlertsPageFactory(driver);
        javaScriptAlertsPageFactory.openJavaScriptAlertPage();
        javaScriptAlertsPageFactory.clickForJSConfirmButton();
        Assert.assertEquals(javaScriptAlertsPageFactory.getMessageConfirm(), "I am a JS Confirm");
    }

    @Test
    public void clickForJSPromt() {
        JavaScriptAlertsPageFactory javaScriptAlertsPageFactory = new JavaScriptAlertsPageFactory(driver);
        javaScriptAlertsPageFactory.openJavaScriptAlertPage();
        javaScriptAlertsPageFactory.clickForJSPromtButton();
        javaScriptAlertsPageFactory.getMessagePromt();
        Assert.assertEquals(javaScriptAlertsPageFactory.messageOfPage(), "You entered: Promt alert");
    }

}
