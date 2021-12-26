import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateOlxTestCases extends Olx{
    public static String expectedResult = "Category is mobile and price is in between the filtered range";
    @Test(priority = 1, description = "Check 1st link")
    public void firstLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,0,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "First link have validation issue");
    }
    @Test(priority = 2, description = "Check 2nd link")
    public void SecondLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,1,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "Second link have validation issue");
    }
    @Test(priority = 3, description = "Check 3rd link")
    public void thirdLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,2,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "Third link have validation issue");
    }
    @Test(priority = 4, description = "Check 4th link")
    public void fourthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,3,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "Fourth link have validation issue");
    }
    @Test(priority = 5, description = "Check 5th link")
    public void fifthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,4,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "Fifth link have validation issue");
    }
    @Test(priority = 6, description = "Check 6th link")
    public void sixthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,5,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "sixth link have validation issue");
    }
    @Test(priority = 7, description = "Check 7th link")
    public void seventhLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,6,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "seventh link have validation issue");
    }
    @Test(priority = 8, description = "Check 8th link")
    public void eighthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,7,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "eighth link have validation issue");
    }
    @Test(priority = 9, description = "Check 9th link")
    public void ninthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,8,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "ninth link have validation issue");
    }
    @Test(priority = 10, description = "Check 10th link")
    public void tenthLink() throws InterruptedException {
        Helper.openMobilePageAndFilterValue(driver,PageElements.uRL,PageElements.categoriesXPath,PageElements.mobileAndTabletsXPath,PageElements.mobileXPath,PageElements.popUpWindowID,PageElements.popUpWindowButtonXPath,PageElements.rangeFilterMinFieldID,PageElements.rangeFilterMaxFieldID,PageElements.minValue,PageElements.maxValue);
        String getValidationMessage = Helper.checkCategoryAndRange(driver,PageElements.mobileLinkClassName,9,PageElements.categoryBreadCrumbXPath,PageElements.AmountXPath,PageElements.breadCrumbMessage,PageElements.minValue,PageElements.maxValue, expectedResult);
        Assert.assertEquals(getValidationMessage,expectedResult, "Tenth link have validation issue");
    }

}
