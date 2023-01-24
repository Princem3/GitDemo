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

// changes by prince in new branch
public void contact2() 
{
	System.out.println("car loan registration");
	System.out.println("git code development ");
	System.out.println("car loan sicessss");
}
@Test
public void contact() 
{
	System.out.println("car loan registration");
	System.out.println("git code development ");
	System.out.println("car loan sicessss");
}
@Test
public void contact1() 
{
	System.out.println("car loan registration");
	System.out.println("git code development ");
	System.out.println("car loan sicessss");
}
@Test
// hello prince this is prit code
public void registerD() 
{
	System.out.println("car loan registration");
}
}
