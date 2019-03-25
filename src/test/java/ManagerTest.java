import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Frank", "JN223456A", 25000, "Fancy App");
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("Fancy App", manager.getDeptName());
    }

    @Test
    public void hasName(){
        assertEquals("Frank", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JN223456A", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(27000.00, manager.getSalary(),0);
    }

    @Test
    public void canAddBonus(){
        assertEquals(250, manager.payBonus());
    }

    @Test
    public void canChangeName(){
        manager.setName("Ian");
        assertEquals("Ian", manager.getName());
    }

}

