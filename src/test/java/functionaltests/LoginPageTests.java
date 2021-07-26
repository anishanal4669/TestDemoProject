package functionaltests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pagedriver.PageDriver;

import java.io.IOException;

public class LoginPageTests extends PageDriver {

    @Test(priority = 0)
    public void validateEmailFieldTest() throws IOException {
        Assert.assertTrue(loginPage().emailField().isDisplayed());
    }

    @Test(priority = 1)
    public void validatePasswordFieldTest() throws IOException {
        Assert.assertTrue(loginPage().passwordField().isDisplayed());
    }

    @Test(priority = 2)
    public void validateSubmitButtonFieldTest() throws IOException {
        Assert.assertTrue(loginPage().submitButton().isDisplayed());
    }

    @Test(priority = 3)
    public void performLoginTests() throws IOException {
        loginPage().emailField().sendKeys("anishanal4669@gmail.com");
        loginPage().passwordField().sendKeys("Selenium@123");
        loginPage().submitButton().click();
        Assert.assertTrue(homePage().headerElement().isDisplayed());
    }

}
