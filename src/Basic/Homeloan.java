package Basic;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homeloan 
{
@Test(groups={"Smoke"})
public void homeloanLogin() 
{
	System.out.println("login succesfull Homeloan");
}

@Test
public void registrationhomeloan()
{
	System.out.println("registration succesfull homeloan");
}

@BeforeSuite
public void number1() {
	System.out.println("I am in before suite");
}
	
}
