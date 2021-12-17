package GroppingTestCase;

import org.testng.annotations.Test;

public class GroppingTestCase {
	 @Test(groups= {"sanity","regression"},priority=1)
	 public void login() {
	 System.out.println("Login successfully");
	 }
	 @Test(groups= {"sanity","regression"},priority=7)
	 public void logout() {
	 System.out.println("Logout successfully"); 
	 }
	 @Test(groups= {"sanity"},priority=4)
	 public void search() {
	 System.out.println("Search successfully"); 
	}
	@Test(priority=2)
	public void addVendor() {
	System.out.println("Add vendor successfully"); 
	}
	@Test(groups= {"regression"},priority=3)
	public void advancedSearch() {
	System.out.println("Advanced search successfully"); 
	}
	@Test(groups= {"sanity","regression"},priority=5)
	public void prepaidRecharge() {
	System.out.println("Prepaid recharge successfully"); 
	}
	@Test(groups= {"regression"},priority=6)
	public void billPayments() {
	System.out.println("Bill payment successfully"); 
	}

}
