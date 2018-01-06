package practice;

import org.testng.annotations.Test;

public class PriorityWise {
@Test(priority=1)
public void tc1()
{
	System.out.println(1);
}
@Test(priority=2)
public void tc2()
{
	System.out.println(2);
}
@Test()
public void tc3()
{
	System.out.println("3");
}
}
