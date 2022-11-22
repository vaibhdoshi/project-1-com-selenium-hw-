package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {


    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void UserShouldNavigateToRegisterPageSucessfully() {

        //click on the Register Link
        driver.findElement(By.linkText("Register")).click();
        String expectedText = "Register";
        WebElement actualTextMessageElement = driver.findElement(By.linkText("Register"));
        String actualText = actualTextMessageElement.getText();
        //validate actual and expected
        Assert.assertEquals("verify text", expectedText, actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the Register Link
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        //select female button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vai");
        //Enter last Name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Joshi");
        //Select Day,month and year
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1980");
        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test1234@gmail.com");
        //Enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test1234");
        //enter confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("test1234");
        //Click on Register button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        //Verify the text 'Your registration completed'
        String expectedText="Your registration completed";
        WebElement actualTextMessage =driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualText = actualTextMessage.getText();
        //validate actual and expected
        Assert.assertEquals("Registration successfull", expectedText, actualText);


    }

    @After
    public void tearDown() {

        closeBrowser();
    }


}



