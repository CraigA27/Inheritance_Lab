import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", 1234, 20000, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Rob");
        assertEquals("Rob", manager.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(1234, manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(21000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus());
    }
}
