package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxesTest extends BaseTest {
    @Test
    public void checkbox1IsNotCheckedTest() {
        //Open url of Checkboxes
        driver.get(Urls.CHECKBOXES);

        // check checkboxes1
        WebElement chekboxes1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        Assert.assertFalse(chekboxes1.isSelected());
    }

    @Test
    public void checkbox1CheckedTest() {
        //Open url of Checkboxes
        driver.get(Urls.CHECKBOXES);

        // Click checkboxes 1
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        //Check  checkboxes1
        WebElement chekboxes1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        Assert.assertTrue(chekboxes1.isSelected());
    }


    @Test
    public void checkbox2IsCheckedTest() {
        //Open url of Checkboxes
        driver.get(Urls.CHECKBOXES);

        // check checkboxes2
        WebElement chekboxes2 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        Assert.assertTrue(chekboxes2.isSelected());
    }

    @Test
    public void checkbox2IsNotCheckedTest() {
        //Open url of Checkboxes
        driver.get(Urls.CHECKBOXES);
        // Click checkboxes 2
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
        // check checkboxes2
        WebElement chekboxes2 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        Assert.assertFalse(chekboxes2.isSelected());
    }
}
