package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.NotificationMessagesPageFactory;

public class NotificationMessagesPageFactoryTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        NotificationMessagesPageFactory notificationMessagesPageFactory = new NotificationMessagesPageFactory(driver);
        notificationMessagesPageFactory.openNotificationMessagePage();
        notificationMessagesPageFactory.clickHereButton();
        Assert.assertEquals(notificationMessagesPageFactory.expectedSuccessfulMessage(), "Action successful\n" + "×");
    }
}
