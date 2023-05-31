package testNGpacakage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void a() {
	  Reporter.log("a method from Demo2",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("b method from Demo2",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("c method from Demo2",true);
  }
}
