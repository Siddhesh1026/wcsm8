package testNGpacakage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	  public void x() {
		  Reporter.log("x method from Demo2",true);
	  }
	  
	  @Test
	  public void y() {
		  Reporter.log("y method from Demo2",true);
	  }
	  
	  @Test
	  public void z() {
		  //int a=10;
		 // int b=0;
		 // int res=a/b;
		  Reporter.log("z method from Demo2",true);
	  }
}
