package testNGmethod;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
	@DataProvider(name = "testdata")
	public String[][] getData(){
		String[][] data= new String[2][3];
		data[0][0]="chandana";
		data[0][1]="bangalore";
		data[0][2]="A+";
		//data[0][3]="9865645665";
		
		data[1][0]="nagaveni";
		data[1][1]="bangalore";
		data[1][2]="o+";
		//data[1][3]="8765465665";
		
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void demo(String firstname, String place, String bloodgroup) {
		System.out.println(firstname);
		System.out.println(place);
		System.out.println(bloodgroup);
		//System.out.println(no);
	}
}
