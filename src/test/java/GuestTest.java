import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;
    
    @Before
    public void SetUp(){
        guest = new Guest("Gareth");
    }
    
    @Test
    public void hasName(){
        assertEquals("Gareth", guest.getName());
    }


}
