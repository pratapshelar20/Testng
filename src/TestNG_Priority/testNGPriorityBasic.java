package TestNG_Priority;

import org.testng.annotations.Test;

public class testNGPriorityBasic {
	@Test(priority=2)
	  public void verifyTitle() {

		  System.out.println("Verify Title method");
	  }
	  @Test(priority=1)
	  public void abcd() {
		  System.out.println("abcd method");  }
	  @Test(priority=3)
	  public void abc() {
		  System.out.println("abc method");  }
}
