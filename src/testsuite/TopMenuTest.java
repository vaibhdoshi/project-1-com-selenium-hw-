package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrL = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrL);

    }

    @Test
    public void userShouldNavigateToComputerSucessfully() {
        //click on the 'computers tab'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        String expectedText = "Computers";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the 'Electronics tab'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        String expectedText = "Electronics";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText, actualText);

    }

    @Test

    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the 'Apparel tab'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        String expectedText = "Apparel";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText, actualText);


    }

    @Test

    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

    //click on the 'Digital downloads tab'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        String expectedText = "Digital downloads";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText, actualText);

    }

    @Test

    public void userShouldNavigateToBooksPageSuccessfully() {

        //click on the 'Book tab'
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        String expectedText = "Books";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        String expectedText = "Jewelry";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText,actualText);
    }



    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        String expectedText = "Gift Cards";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText,actualText);

    }

    @After
    public void tearDown() {

        closeBrowser();
    }

}
