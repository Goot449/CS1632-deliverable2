import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class DriverTest
{

	//make sure driver class city attribute is set
	@Test
	public void driverClassCityTest()
	{
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "Sennot");
		assertEquals(driver._city, mockCity);
	}

	//make sure driver class location attribute is set
	@Test
	public void driverClassLocationTest()
	{
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "Sennot");
		assertEquals(driver._location, "Sennot");
	}

	//ensure driveRandomLocation() returns null when no locations available
	@Test
	public void driveRandomNullTest()
	{
		City mockCity = Mockito.mock(City.class);
		//give a driver a location of null
		Driver driver = new Driver(mockCity, null);
		//make getOutgoingRoads() return no locations
		Mockito.when (mockCity.getOutgoingRoads("test")).thenReturn(null);
		//make mock random
		Random rand = new Random(1);
		assertEquals(driver.driveRandomLocation(rand), null);
	}

	//make sure driveRandomLocation returns a road
	@Test
	public void driveRandomTest()
	{
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "College");
		//make getOutgoingRoads() return only Fifth Ave.
		List<Road> outgoing = new ArrayList<Road>();
		outgoing.add(new Road("Fifth Ave.", "college", "Library"));
		Mockito.when (mockCity.getOutgoingRoads("College")).thenReturn(outgoing);
		//make mock random
		Random rand = new Random(1);
		assertEquals(driver.driveRandomLocation(rand).getName(), "Fifth Ave.");
	}

	//make sure driverTest driveRandomLocatoin() returns the taken road
	//going to stub the Road.getDest() function
	@Test
	public void randomLocationReturnTest()
	{
		Random rand = new Random(1);
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "Sennot");
		Road mockRoad = Mockito.mock(Road.class);
		List<Road> outgoing = new ArrayList<Road>();
		outgoing.add(new Road("Fifth Ave.", "college", "Library"));
		Mockito.when (mockCity.getOutgoingRoads(driver._location)).thenReturn(outgoing);
		mockRoad._name = "testName";
		Mockito.when (mockRoad.getName()).thenReturn(mockRoad._name);
		assertEquals(driver.driveRandomLocation(rand), "testName");

	}

	//make sure driver.getDestinationLocation() works properly
	@Test
	public void getLocationTest()
	{
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "Sennot");
		assertEquals(driver.getDestinationLocation(), "Sennot");

	}

	//make sure driver.getRoadTaken() works properly
	@Test
	public void getRoadTakenTest()
	{
		City mockCity = Mockito.mock(City.class);
		Driver driver = new Driver(mockCity, "Sennot");
		//make getRoadTaken() return only Fifth Ave.
		driver._roadTaken = "Fifth Ave.";
		assertEquals(driver.getRoadTaken(), "Fifth Ave.");

	}

}
