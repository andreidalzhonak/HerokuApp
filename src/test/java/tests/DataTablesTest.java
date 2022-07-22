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
        //Find firstName
        String firstName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")).getText();

        //Find lastName
        String lastName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")).getText();
        //Check firstName and lastName
        Assert.assertEquals(lastName, "Bach");
        Assert.assertEquals(lastName, "Bach");

    }
    @Test
    public void checkDueAndSiteTest() {
        //Open url of HerokuApp
        driver.get(Urls.DATA_TABLES);
        //Find Due
        String due = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), '$')]")).getText();
        //Find Email
        String webSite = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), 'www')]")).getText();
        //Check Due and Email
        Assert.assertEquals(due, "$51.00");
        Assert.assertEquals(webSite, "http://www.frank.com");

    }
}


