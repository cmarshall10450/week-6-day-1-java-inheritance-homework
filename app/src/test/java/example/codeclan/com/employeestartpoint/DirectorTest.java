package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 31/10/2017.
 */

public class DirectorTest {

  Director director;


  @Before
  public void before() {
    director = new Director(1, "Wilma", "AB123456C", 30000.00, "IT", 200000.00);
  }

  @Test
  public void directorHasBudget() {
    assertEquals(200000.00, director.getBudget(), 0.01);
  }

  @Test
  public void canRaiseSalary() {
    director.raiseSalary(1000.0);
    assertEquals(31000.00, director.getSalary(), 0.01);
  }

  @Test
  public void canSetEmployeeName() {
    director.setName("Betty");
    assertEquals("Betty", director.getName());
  }

}
