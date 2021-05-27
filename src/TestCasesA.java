import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestCasesA {

	
	@Before
	public void getTypebefore()
	{
		Bike B= new Bike();
		System.out.println("Before Test Case");
	}
	@Test
	public void getTypeTest()
	{
		Bike B= new Bike();
		Assert.assertEquals("Bike", B.getVehicletype());
		System.out.println("Test Case");
	}
	@After
	public void getTypeafter()
	{
		Bike B= null;
		System.out.println("After Test Case");
	}
}
