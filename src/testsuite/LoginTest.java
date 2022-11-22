package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSucessfully() {

        //Find log in and click on login link
        driver.findElement(By.linkText("Log in")).click();
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldLoginSucessfullyWithValidCredentials() {
        //click on the login link
        driver.findElement(By.linkText("Log in")).click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("test1234@gmail.com");
        //enter valid password
        driver.findElement(By.name("Password")).sendKeys("test1234");
        //Click on 'Login button'
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //verify the 'Log out' text is display
        String expectedMessage = "Log out";
        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[text()='Log out']"));
        String actualMessage = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @Test
    public void verifyTheErrorMessage() {
        //click on the login link
        driver.findElement(By.linkText("Log in")).click();
        //enter invalid username
        driver.findElement(By.id("Email")).sendKeys("test12@gmail.com");
        //enter invalid password
        driver.findElement(By.name("Password")).sendKeys("test12");
        //Click on 'Login button'
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //verify the error message
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        //Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("Login was unsuccessful,Please correct the errors and try again.No customer account found", expectedMessage, actualMessage);


    }

    @After
    public void tearDown() {

        closeBrowser();
    }


}
