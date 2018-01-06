package practice;

import org.testng.annotations.Test;

public class ThreeConditions {
@Test(priority=1,groups="positive",dependsOnMethods="a1")
public void abc()
{
	System.out.println("Hello World!");
}
@Test()
public void a1()
{
System.out.println("a1");	
}
}
