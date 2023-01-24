package Basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestng1 {
	
	
	@AfterTest
	public void demo5() {
		System.out.println("I will aftertest annotaion last");
	}
	@Test(groups={"Smoke"})
	public void demo() {
		System.out.println("This is first test case ");
	}
// the above one is first testcase
// if we want to write another test case we need to write just another @Test annotaion
	@Parameters({"url"})
	@Test
	public void demo2(String urlname) {
		System.out.println("This is second test cases");
		System.out.println(urlname);
	}
	@Test(dataProvider ="getData")
	
	public void demodata(String usrname,String password) 
	{
		 System.out.println(usrname);
		 System.out.println(password);
	}
	
	
	@BeforeTest
	public void demo3() {
		System.out.println("This is before  test annotation");
	}
	
	@BeforeMethod
	public void demo99() {
		System.out.println("i am before method");
	}
	
	@DataProvider
	public Object[][] getData() 
	{
		// create array of object type
		
		Object[][] data=new Object[3][2];
		
		//1set
		data[0][0]="firstusetrname";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
		
		
		
	}
	
}
