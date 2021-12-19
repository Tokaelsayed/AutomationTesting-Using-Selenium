package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoading {

    private  WebDriver driver;

    public DynamicLoading(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clickExample1()
    {
        WebElement element = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        element.click();
    }
}
