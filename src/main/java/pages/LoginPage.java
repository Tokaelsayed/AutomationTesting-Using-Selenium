package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


    private  WebDriver driver;
    private By username= By.id("username");
    private By password = By.id("password");
    private By Login = By.cssSelector("#login button");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public SecureAreaPage login(String name,String pass)
    {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(Login).click();
        return new SecureAreaPage(driver);
    }
}
