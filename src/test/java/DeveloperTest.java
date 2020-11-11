import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Joe", 5678, 18000);
    }

    @Test
    public void hasName(){
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(5678, developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(19000, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(180, developer.payBonus(), 0.01);
    }
}
