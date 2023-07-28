package vikash.BDDFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practise {
	


	@DataProvider(name = "data-provider")
	public Object[][] ram(){
		Object[][] ob = new Object[2][2];
				
		ob[0][0] = "Vikash" ;
				ob[0][1] = "6" ;
						ob[1][0] = "Vikash" ;
								ob[1][1] = "7" ;
		
		
		return ob;
	}
	

	@Test(dataProvider = "data-provider")

public void practiceTest1(String a,String b) {
	
		
		System.out.println("String a" + a);
		System.out.println("String b" + b);
}
	
	@Test(dataProvider = "data-provider")
public void practiceTest2(String a,String b) {
	
		
		System.out.println("String a" + a);
		System.out.println("String b" + b);
		System.out.println("String a" + a);
		System.out.println("Chnage in master branch" + b);
		
		System.out.println("Checking the Maven variable passed " + System.getProperty("val1") );

		System.out.println("git second commit done1");



		
		

		
}
	
	
	
}


	



