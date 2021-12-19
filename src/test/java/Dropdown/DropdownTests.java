package Dropdown;

import base.baseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends baseTests {

    @Test
    public void testSelectedOpyion()
    {
        DropDownPage dropdownpage=homePage.ClickDropDown();
        String option="Option 1";
        dropdownpage.Selectfromdropdown(option);
        List<String> selectedOptions=dropdownpage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");

    }

}
