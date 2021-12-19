package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollPage {

    private  WebDriver driver;
    private By table = By.id("large-table");

    public ScrollPage(WebDriver driver)
    {
        this.driver=driver;
    }
    //Function to scroll over the table in javascript
    public void scrollTotable()
    {
        WebElement tableElement=driver.findElement(table);
        String script="arguments[0].scrollIntoView();";
        //Class selenium provides to execute JS
        ( (JavascriptExecutor)driver).executeScript(script,tableElement);
    }
}
