package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        //Open url of Inputs
        driver.get(Urls.NOTIFICATIONMESSAGES);

        //Click here
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
        // Check Message
        String actionSuccessful = driver.findElement(By.cssSelector("#flash")).getText();
        System.out.println(actionSuccessful);
        Assert.assertEquals(actionSuccessful, "Action successful\n" + "×");
    }
}
