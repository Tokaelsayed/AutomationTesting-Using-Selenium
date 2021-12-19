package JavaScript;

import base.baseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ScrollPage;

public class javascriptTest extends baseTests {
    @Test
    public void testscrollToTable()
    {
        homePage.ClickLarge().scrollTotable();
    }
}
