import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jill", 5566, 18000);
    }

    @Test
    public void hasName(){
        assertEquals("Jill", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(5566, databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(19000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(180, databaseAdmin.payBonus(), 0.01);
    }
}
