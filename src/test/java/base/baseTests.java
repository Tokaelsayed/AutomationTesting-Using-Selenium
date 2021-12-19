package base;


import com.sun.java.swing.plaf.windows.WindowsDesktopManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utilies.windowManager;

import pages.LoginPage;
import pages.SecureAreaPage;

import java.util.List;

public class baseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass //to make this method run first
    public void setup()
    {
    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");

    homePage=new HomePage(driver);

    }
    @AfterClass
    public void teardown()
    {
        driver.quit();

    }
    public windowManager getWindowManager()
    {
        return new windowManager(driver);
    }

}
