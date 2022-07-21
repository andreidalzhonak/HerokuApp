package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddremoveElements extends BaseTest {
    @Test
    public void addTwoButtonTest() {
        //Open url of HerokuApp
        driver.get(Urls.ADD_REMOVE_ELEMENTS);

        //Click "Add Element" - 1
        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
        //Click "Add Element" - 2
        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
        //Add check
        WebElement buttonDelete = driver.findElement(By.id("elements"));
        List<WebElement> list = buttonDelete.findElements(By.tagName("button"));
        int countButton = list.size();
        Assert.assertEquals(countButton, 2);

    }
    @Test
    public void deleteButtonTest() {
        //Open url of HerokuApp
        driver.get(Urls.ADD_REMOVE_ELEMENTS);
        //Click "Add Element" - 1
        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
        //Click "Add Element" - 2
        driver.findElement(By.xpath("//*[@id='content']/div/button")).click();
        // Delete 1 element
        driver.findElement(By.cssSelector("#elements > button:nth-child(1)")).click();
        //Add check
        WebElement buttonDelete = driver.findElement(By.id("elements"));
        List<WebElement> list = buttonDelete.findElements(By.tagName("button"));
        int countButton = list.size();
        Assert.assertEquals(countButton, 1);
    }
}
