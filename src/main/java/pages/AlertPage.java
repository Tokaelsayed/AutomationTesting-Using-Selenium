package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private  WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By results=By.id("result");
    public AlertPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void triggerAlert()
    {
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public void DismisstAlert()
    {
        driver.switchTo().alert().dismiss();
    }
    public String resultText()
    {
        System.out.println(driver.findElement(results).getText());
      return driver.findElement(results).getText();
    }
}
