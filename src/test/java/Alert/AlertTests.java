package Alert;

import base.baseTests;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTests extends baseTests {
    @Test
    public void testAcceptAlert()
    {
        AlertPage alertPage = homePage.ClickAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        assertEquals(alertPage.resultText(),"You successfully clicked an alert");

    }
}
