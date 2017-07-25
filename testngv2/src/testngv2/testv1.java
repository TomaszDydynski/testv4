package testngv2;


import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testv1 {
	
	 @Test
	  public void f() {
		 SoftAssert sa = new SoftAssert();

				///try catch bez asserta (test bledu artytmetycznego, bez zewnetrznych bibliotek)
				try{
					System.out.println("Przed testem a (try)");
					int x=2;
					int y=1;
					int z=x/y;
					assertEquals(z, 2);
					System.out.println(z);
				}catch(Exception e1){
					System.out.println(e1);
					System.out.println("Po tescie a (catch) \n");
				}
			
		 
	}
	

}
