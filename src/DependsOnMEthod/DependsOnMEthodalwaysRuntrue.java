package DependsOnMEthod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMEthodalwaysRuntrue {
	 @Test
	  public void login() {

		  System.out.println("Login successfully");
	  }
	  @Test
	  public void logout() {
		  System.out.println("Logout successfully"); 
		  }
	  @Test(dependsOnMethods= {"advancedSearch"},alwaysRun=true)
	  public void search() {
		  System.out.println("Search successfully");  
	}
	@Test
	public void advancedSearch() {
		  Assert.assertEquals("Gmail", "Gmail1");
	}
}
