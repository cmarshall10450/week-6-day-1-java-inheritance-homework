package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by chris on 31/10/2017.
 */

public class ManagerTest {

  Manager manager;

  @Before
  public void before() {
    manager = new Manager(1, "Wilma", "AB123456C", 30000.00, "IT");
  }

  

}
