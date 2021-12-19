package Navigation;

import base.baseTests;
import org.testng.annotations.Test;

public class navigationTest extends baseTests {

    @Test
    public void testNavigator()
    {
      homePage.ClickDynamicLoading().clickExample1();
      getWindowManager().goBack();
      getWindowManager().refreshPage();
      getWindowManager().goForward();
      getWindowManager().goTo("https://google.com");

    }
}
