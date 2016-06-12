import static org.junit.Assert.*;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class CityTest
{


	//Make sure city doesn't start with any locations
	@Test
	public void cityTestEmpty()
	{
		City pittsburgh = new City();
		assertEquals(pittsburgh.getNumLocations(), 0);
	}
	//Make sure locations can be added to the city
	@Test
	public void addSingleLocationTest()
	{
		City pittsburgh = new City();
		pittsburgh.addLocation("TestLocation");
		assertEquals(pittsburgh.getNumLocations(), 1);
	}
	// Make sure that a location cannot be added more than once
	@Test
	public void addDuplicateLocationTest()
	{
		City pittsburgh = new City();

		pittsburgh.addLocation("TestLocation");
		pittsburgh.addLocation("TestLocation");
		assertEquals(pittsburgh.getNumLocations(), 1);
	}

}