import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Helper {
    //Method to initialize the web-driver
    public static WebDriver initializeDriverAndOpenBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver;
    }
    //method to quit the web-driver
    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
    //method to open the OLX URL and then select categories and then filter values
    public static void openMobilePageAndFilterValue(WebDriver driver, String uRL, String categoriesXPath, String mobileAndTabletXPath, String mobileXPath, String popUpWindow, String closeButton, String filterMinFieldID, String filterMaxFieldID, String minValue, String maxValue) throws InterruptedException {
        Actions action = new Actions(driver);
        driver.get(uRL);
        Thread.sleep(5000);
        driver.findElement(By.xpath(categoriesXPath)).click();
        Thread.sleep(3000);
        WebElement getMobileAndTabletElement=driver.findElement((By.xpath(mobileAndTabletXPath)));
        action.moveToElement(getMobileAndTabletElement).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath(mobileXPath)).click();
        if(driver.findElements(By.id(popUpWindow)).size()>0){
            driver.findElement(By.xpath(closeButton)).click();
        }
        Thread.sleep(5000);
        driver.findElement(By.id(filterMaxFieldID)).clear();
        driver.findElement(By.id(filterMaxFieldID)).sendKeys(maxValue);
        Thread.sleep(3000);
        driver.findElement(By.id(filterMinFieldID)).sendKeys(minValue);
        Thread.sleep(5000);
    }
    //Method to open the links of desired search
    public static String checkCategoryAndRange(WebDriver driver, String getMobileLinkClassName, int indexOfMobileLink, String getBreadCrumbXPath, String getAmountXPath, String breadCrumbExpectedMessage, String minAmount, String maxAmount, String validationMessage) throws InterruptedException {
        driver.findElements(By.className(getMobileLinkClassName)).get(indexOfMobileLink).click();
        Thread.sleep(5000);
        if(!(driver.findElement(By.xpath(getBreadCrumbXPath)).getText()).equals(breadCrumbExpectedMessage)){
            validationMessage = "Category is not mobile";
            return validationMessage;
        }else{
            String getAmount = driver.findElement(By.xpath(getAmountXPath)).getText();
            int minAmountInt = convertStringAmountToInt(minAmount);
            int maxAmountInt = convertStringAmountToInt(maxAmount);
            int actualAmountInt = convertStringAmountToInt(getAmount);
            if(actualAmountInt < minAmountInt || actualAmountInt > maxAmountInt){
                validationMessage = "Amount is not in the filtered range";
                return validationMessage;
            }

        }
        return validationMessage;
    }
    public static int convertStringAmountToInt(String amount){
        if(amount.contains(",")){
            amount=amount.replaceAll(",","");
        }
        if(amount.contains("₨ ")){
            amount=amount.replaceAll("₨ ","");
        }
        return Integer.parseInt(amount);
    }

}
