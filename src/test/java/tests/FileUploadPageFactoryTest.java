package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pagefactory.FileUploadPageFactory;

public class FileUploadPageFactoryTest extends BaseTest {
    @Test
    public void uploadPageTest() {
        FileUploadPageFactory fileUploadPageFactory = new FileUploadPageFactory(driver);
        fileUploadPageFactory.openFileUploadPage();
        fileUploadPageFactory.addPage();
        fileUploadPageFactory.clickUpload();
        Assert.assertEquals(fileUploadPageFactory.checkFile(), "Screenshot_1.jpg");
    }

}
