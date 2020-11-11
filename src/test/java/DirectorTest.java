import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("May",1122, 30000, "Sales", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("May", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1122, director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000);
        assertEquals(32000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }
}
