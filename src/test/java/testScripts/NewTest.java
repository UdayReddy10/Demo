package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.BaseClass;

public class NewTest  {
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals("A", "A");
	  sa.assertFalse(true,"Validation fails");
	  sa.assertTrue(false,"Validation failed");
	  sa.assertEquals("A", "B");
	  System.out.println("Hi");
	  sa.assertAll();
  }
}
