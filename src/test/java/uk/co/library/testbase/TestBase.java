package uk.co.library.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.Utility;

import java.io.InterruptedIOException;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() throws InterruptedIOException, InterruptedException {
        selectBrowser(browser);
        //new Utility().acceptCookiesAndSwitchToIframe();
        //new Utility().acceptCookiesandSwitchToIframe();

    }




    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
