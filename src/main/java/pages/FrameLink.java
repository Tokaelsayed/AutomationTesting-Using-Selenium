package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameLink {
    private  WebDriver driver;
    private String editorIframeID="mce_0_ifr";
    private By textArea= By.id("tinymce");

    public FrameLink(WebDriver driver) {
        this.driver=driver;
    }
    //switch to iframe
    private void switchToEditArea()
    {
        driver.switchTo().frame(editorIframeID);
    }
    //Exit from Iframe
    private void switchToMainArea()
    {
        driver.switchTo().parentFrame();

    }
    public void clearTextArea()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

}
