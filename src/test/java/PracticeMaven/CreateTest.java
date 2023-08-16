package PracticeMaven;

import org.testng.annotations.Test;

public class CreateTest {
@Test(groups="smoke")
public void create()
{
System.out.println("contact created succesfully");	
}

@Test(groups="regression")
public void update() {
	System.out.println("contact updated succesfully");
}
}
