package Basic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class CarLoan 
{
@Test(groups={"Smoke"})
public void carloanlogin()
{
	System.out.println("car loan login");
}
@Test
public void registerA() 
{
	System.out.println("car loan registration");
}
@Test
public void registerB() 
{
	System.out.println("car loan registration");
}
@AfterSuite
public void lastsuite() {
	System.out.println("I am last suiter");
}
@Test
public void contact() 
{
	System.out.println("car loan registration");
}
@Test
public void registerD() 
{
	System.out.println("car loan registration");
}
}
