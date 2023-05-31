package testNGpacakage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 Reporter.log("f method from Demo",true);
  }
  
  @Test
  public void g() {
	  Reporter.log("g method from Demo",true);
  }
  
  @Test
  public void h() {
	  Reporter.log("h method from Demo",true);
  }
}
