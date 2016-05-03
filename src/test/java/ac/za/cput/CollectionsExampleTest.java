package ac.za.cput;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

/**
 *
 */
public class CollectionsExampleTest extends TestCase{

    public void testListExample()throws Exception
    {
        ListExample list = new ListExample();
        String result = list.getCar(2);

        Assert.assertEquals("Ford Focus RS",result);

    }

    public void testMapExample()throws Exception
    {
        MapExample map = new MapExample();
        String result = map.getStudent("Cyclopse");

        Assert.assertEquals("Scott Summers",result);

    }

    public void testSetExample()throws Exception
    {
        SetExample set = new SetExample();
        String result = set.getNumber(27);

        Assert.assertEquals("The number you picked is in the list",result);

    }

}