package ParallelTextExecutionClass;

import org.testng.annotations.Test;

public class ParallelTextExecutionClass2 {
	@Test
	 public void testCase5() {
	 long id=Thread.currentThread().getId();
	 System.out.println("Test case 5 is successful"+" Thread id :"+id);
	 }
	 @Test
	 public void testCase6() {
	 long id=Thread.currentThread().getId();
	 System.out.println("Test case 6 is successful"+" Thread id :"+id);
	 }

}
