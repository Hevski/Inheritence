import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Cheryl", "KH456738S", 10000);
    }

    @Test
    public void hasName(){
        assertEquals("Cheryl", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("KH456738S", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(10000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(12000.00, databaseAdmin.getSalary(),0);
    }

    @Test
    public void canAddBonus(){
        assertEquals(100, databaseAdmin.payBonus());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Jim");
        assertEquals("Jim", databaseAdmin.getName());
    }
}
