package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        //Open url of Inputs
        driver.get(Urls.TYPOS);

        // check Typo Text
        for (int i = 0; i < 6; i++) {
            driver.navigate().refresh();
            String checkTypoText = driver.findElement(By.cssSelector("#content > div > p:nth-child(3)")).getText();
            Assert.assertEquals(checkTypoText, "Sometimes you'll see a typo, other times you won't.");
        }
    }
}
