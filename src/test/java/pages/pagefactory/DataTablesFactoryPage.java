package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablesFactoryPage extends BaseFactoryPage {

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")
    private WebElement firstName;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")
    private WebElement lastName;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), '$')]")
    private WebElement due;

    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']//following-sibling::td[contains(text(), 'www')]")
    private  WebElement webSite;


    public DataTablesFactoryPage(WebDriver driver) {
        super(driver);
    }
    public void openDataTablePage() {
        driver.get(Urls.DATA_TABLES);
    }
    public String findFirstName() {
        String firstNamePeople = firstName.getText();
        return firstNamePeople;
    }
    public String findLastName() {
        String lastNamePeople = lastName.getText();
        return lastNamePeople;
    }
    public String findDue(){
        String DuePeople = due.getText();
        return DuePeople;
    }
    public String findWebSite() {
        String webSitePeople = webSite.getText();
        return webSitePeople;
    }
}
