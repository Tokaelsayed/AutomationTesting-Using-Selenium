package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver ;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public LoginPage ClickFormAuth()
    {
     ClickLink("Form Authentication");
      return new LoginPage(driver);
    }
    public DropDownPage ClickDropDown()
    {
        ClickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoverPage ClickHover()
    {
        ClickLink("Hovers");
        return new HoverPage(driver);

    }
    public DynamicLoading ClickDynamicLoading()
    {
        ClickLink("Dynamic Loading");
        return new DynamicLoading(driver);
    }
    public AlertPage ClickAlerts()
    {
        ClickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }
    public FrameLink Clickframe()
    {
        ClickLink("WYSIWYG Editor");
        return new FrameLink(driver);
    }
    public ScrollPage ClickLarge()
    {
        ClickLink("Large & Deep DOM");
        return  new ScrollPage(driver);
    }

    private void ClickLink(String txt)
    {
        driver.findElement(By.linkText(txt)).click();
    }



}
