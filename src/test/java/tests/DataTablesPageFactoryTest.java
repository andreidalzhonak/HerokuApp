package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.DataTablesFactoryPage;

public class DataTablesPageFactoryTest extends BaseTest {
    @Test
    public void checkNameTest() {
        DataTablesFactoryPage dataTablesFactoryPage = new DataTablesFactoryPage(driver);
        dataTablesFactoryPage.openDataTablePage();
        dataTablesFactoryPage.findFirstName();
        dataTablesFactoryPage.findLastName();
        Assert.assertEquals(dataTablesFactoryPage.findFirstName(), "Frank");
        Assert.assertEquals(dataTablesFactoryPage.findLastName(), "Bach");
    }
    @Test
    public void checkDueAndSiteTest() {
        DataTablesFactoryPage dataTablesFactoryPage = new DataTablesFactoryPage(driver);
        dataTablesFactoryPage.openDataTablePage();
        dataTablesFactoryPage.findDue();
        dataTablesFactoryPage.findWebSite();
        Assert.assertEquals(dataTablesFactoryPage.findDue(), "$51.00");
        Assert.assertEquals(dataTablesFactoryPage.findDue(), "http://www.frank.com");
    }
}


