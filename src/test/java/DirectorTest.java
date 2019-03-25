import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Heather", "LM678409D", 100000, "All", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Heather", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("LM678409D", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2000.00);
        assertEquals(102000.00, director.getSalary(),0);
    }

    @Test
    public void canAddBonus(){
        assertEquals(2000, director.payBonus());
    }

    @Test
    public void canGetDepartmentName(){
        assertEquals("All", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(500000.00, director.getBudget(), 0);
    }

    @Test
    public void canChangeName(){
        director.setName("Angus");
        assertEquals("Angus", director.getName());
    }


}
