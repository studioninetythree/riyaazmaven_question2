package za.ac.cput.riyaazmaven;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.ExpectedException;
import org.junit.runners.model.TestTimedOutException;


/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{

    private App app1;
    private App app2;
    private int x[] = {5, 10};
    private int y[] = {5, 10};
    ExpectedException ex = ExpectedException.none();

    public void testFloat()
    {
        assertEquals(304.1, App.getf1(), 0.05f);
    }

    public void testInteger()
    {
        assertEquals(5,App.getinterger1());
    }


    public void testObjects()
    {
        App app1 = new App();


        assertEquals(App.getinterger1(),App.getf1());
    }

    public void testIsTrue()
    {
        assertEquals(false,App.isTrue());
    }

    public void testIsFalse()
    {
        assertEquals(true, App.isFalse());
    }

    public void testIsNull()
    {

        assertNull("null okay ", App.s1());
    }

    public void testIsNotNull()
    {
        String s = "";
        assertNotNull(s);
    }


    @org.junit.Test
    public void testObject()
    {
        if(App.s1() == null)
        {
            fail("Object should not be null");
        }
    }


    @Before
    public void beforeIdentity() throws Exception
    {
        App app1 =  new App();
        App app2 = new App();

        app2 = app1;
    }

    @Test
    public void testIdentity() throws Exception
    {
        Assert.assertSame(app1, app2);
    }

    @Test
    public void testException() throws Exception
    {
        ex.expect(TestTimedOutException.class);
    }

    @Test
    public void testArrayContent()
    {
        Assert.assertArrayEquals(x, y);
    }

}
