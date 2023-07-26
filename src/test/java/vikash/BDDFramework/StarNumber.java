package vikash.BDDFramework;

import org.testng.annotations.Test;

public class StarNumber {

	@Test
	
	void starNumber1() {
		
		
		// TODO Auto-generated method stub
		
		int n = 5;
		 
		for(int j =1; j<=5;j++){
		for(int i=1;i<=5;i++){
		if(i!=n)
		 System.out.print(i);
		else {

		System.out.print("*");
		}

		
		
		}
		n--;
		System.out.println("");
		}

	}

}
