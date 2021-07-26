package functionaltests;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pagedriver.PageDriver;

import java.io.IOException;
import java.util.List;

public class HomePageTests extends PageDriver {

    public static final String[] EXPECTED_MENU_ICONS = {"Home", "Calendar", "Contacts", "Companies", "Deals",
            "Tasks", "Cases", "Calls", "Documents", "Email", "Campaigns", "Forms"};

    @BeforeClass
    public void performLoginTests() throws IOException {
        loginPage().emailField().sendKeys("anishanal4669@gmail.com");
        loginPage().passwordField().sendKeys("Selenium@123");
        loginPage().submitButton().click();
        Assert.assertTrue(homePage().headerElement().isDisplayed());
    }

    @Test
    public void validateMenuIcons() throws IOException {
        List<WebElement> menuElements = homePage().menuIcons();
        for (int i = 0; i < menuElements.size(); i++) {
            Assert.assertEquals(menuElements.get(i).getText(), EXPECTED_MENU_ICONS[i]);
        }
    }
}
