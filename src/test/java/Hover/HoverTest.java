package Hover;

import base.baseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;

import static org.testng.Assert.*;

public class HoverTest extends baseTests {
    @Test
    public void testHover()
    {
        HoverPage hoverPage =homePage.ClickHover();
        HoverPage.FigureCaption caption =hoverPage.HoveroverFigure(1);
        assertTrue(caption.isCaptiondisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title incorrect");
        assertEquals(caption.getlink(),"View profile","caption link text incorrect");
        assertTrue(caption.getlink().endsWith("/users/1"),"Link incorrect");
    }
}
