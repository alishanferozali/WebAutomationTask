import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Olx {
    public static WebDriver driver;

    @BeforeSuite(description = "Initialising Web driver with Chrome driver")
    public void initializeDriver(){
        driver = Helper.initializeDriverAndOpenBrowser();
    }
    @AfterSuite(description = "Quit web driver")
    public void quitDriver(){
        Helper.quitBrowser(driver);
    }
}
