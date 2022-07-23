package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest{
    @Test
    public void inputArrowUpTest() {
        //Open url of Inputs
        driver.get(Urls.INPUTS);

        //done Keys.ARROW_UP
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_UP);
        // take values from the fieldNumber
        String fieldNumber = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(fieldNumber, "1");
    }
    @Test
    public void inputArrowDownTest() {
        //Open url of Inputs
        driver.get(Urls.INPUTS);
        //done Keys.ARROW_DOWN
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_DOWN);
        // take values from the fieldNumber
        String fieldNumber = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(fieldNumber, "-1");
    }
}
