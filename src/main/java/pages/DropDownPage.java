package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {

    private  WebDriver driver;
    private By dropdown= By.id("dropdown");

    public DropDownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Selectfromdropdown(String option)
    {
        Select dropdownElement = new Select(driver.findElement(dropdown));
        dropdownElement.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions()
    {
     List<WebElement> elements= findDropdownElement().getAllSelectedOptions();
     //Collecting texts from all selected web Elements.
     return elements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropdownElement()
    {
        return new Select(driver.findElement(dropdown));
    }

}
