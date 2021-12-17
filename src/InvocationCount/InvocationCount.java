package InvocationCount;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 5)
	 public void test1(){
	 System.out.println("Invocation count demo");
	}

}
