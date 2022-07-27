package pages.pagefactory;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPageFactory extends BaseFactoryPage {
    @FindBy(id = "file-upload")
    private WebElement choseFail;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadFiles;

    public FileUploadPageFactory(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(Urls.FILEUPLOAD);
    }

    public void addPage() {
        String path = System.getProperty("user.dir").concat("/src/test/resources/Screenshot_1.jpg");
        choseFail.sendKeys(path);
    }

    public void clickUpload() {
        uploadButton.click();
    }

    public String checkFile() {
        String fileName = uploadFiles.getText();
        return fileName;
    }
}
