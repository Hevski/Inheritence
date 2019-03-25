import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Ian", "KZ76493A", 12000);
    }

    @Test
    public void hasName(){
        assertEquals("Ian", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("KZ76493A", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(12000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2000.00);
        assertEquals(14000.00, developer.getSalary(),0);
    }

    @Test
    public void canAddBonus(){
        assertEquals(120, developer.payBonus());
    }

    @Test
    public void canChangeName(){
        developer.setName("Helen");
        assertEquals("Helen", developer.getName());
    }
}
