package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTablesTest extends BaseTest {
    @Test
    public void checkNameTest() {
        //Open url of HerokuApp
        driver.get(Urls.DATA_TABLES);
        //Check firstName
        String firstName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[contains(text(), 'Frank')]")).getText();
        Assert.assertEquals(firstName, "Frank");
        //Check firstName
        String lastName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[contains(text(), 'Bach')]")).getText();
        Assert.assertEquals(lastName, "Bach");
    }
    @Test
    public void checkDueAndSiteTest() {
        //Open url of HerokuApp
        driver.get(Urls.DATA_TABLES);
        //Check firstName
        String due = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), '$')]")).getText();
        Assert.assertEquals(due, "$51.00");
        //Check firstName
        String webSite = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), 'frank')]")).getText();
        Assert.assertEquals(webSite, "http://www.frank.com");
    }
}


