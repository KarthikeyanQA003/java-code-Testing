package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionexample {
	String name="karthik";
	boolean value=false;
  @Test
  public void f() {
	  Assert.assertEquals(name, "karthik");
	
	  Assert.assertFalse(value,"this is true");
  }
 

}
