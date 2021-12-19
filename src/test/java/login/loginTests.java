package login;

import base.baseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class loginTests extends baseTests {
    @Test
    public void testSuccessfullLogin()
    {
      LoginPage loginPage= homePage.ClickFormAuth();
      SecureAreaPage secureAreaPage =loginPage.login("tomsmith","SuperSecretPassword!");
     assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"),

             "Alert text incorrect");
    }
    @Test
    public void visibile()
    {
        LoginPage loginPage= homePage.ClickFormAuth();
    }
}
