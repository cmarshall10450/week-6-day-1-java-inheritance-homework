package example.codeclan.com.employeestartpoint;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 31/10/2017.
 */

public class DirectorTest {

  @Test
  public void directorHasBudget() {
    Director director = new Director(1, "Wilma", "AB123456C", 30000.00, "IT", 200000.00);
    assertEquals(200000.00, director.getBudget(), 0.01);
  }

}
