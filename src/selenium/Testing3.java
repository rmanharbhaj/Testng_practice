package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert s=new SoftAssert();
  @Test(priority = 1, groups = {"smoke","sanity"})
  public void createUser() {
	  System.out.println("I an in home test");
	  System.out.println("Before assert");
	  Assert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After assert");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test(priority = 2, dependsOnMethods = "createUser", groups = "sanity")
  public void editUser() {
	  System.out.println("Before assert");
	  s.assertTrue(2>3, "Verifying Element");
	  System.out.println("After assert");
	  s.assertAll();
  }
  
  @Test(priority = 3, dependsOnMethods = "editUser", groups = "smoke")
  public void deleteUser() {
	  System.out.println("I an in end test");
	  System.out.println("Before assert");
	  s.assertTrue(2>3, "Verifying Element");
	  System.out.println("After assert");
	  s.assertEquals("abc", "abc1");
	  System.out.println("After second assert");
	  s.assertAll();
  }
}
