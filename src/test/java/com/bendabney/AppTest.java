package com.bendabney;

import static org.junit.Assert.assertTrue;
import com.bendabney.MyThing;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldGetString()
    {
        MyThing cut = new MyThing("Ben");
        String actual = cut.getString();
        assertTrue(actual.equals("hi"));
    }
    @Test
    public void shouldGetPrivate()
    {
        MyThing cut = new MyThing("Ben");
        String actual = cut.getHidden();
        assertTrue(actual.equals("hi"));
    }
}
