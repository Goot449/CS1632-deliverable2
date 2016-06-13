import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Random;
public class DriverTest
{

//  //make sure driver class city attribute is set
//  @Test
//  public void driverClassCityTest()
//  {
//    Driver driver = new Driver("Pittsburgh", "Sennot");
//    assertEquals(driver._city, "Pittsburgh");
//  }
//
//  //make sure driver class location attribute is set
//  @Test
//  public void driverClassCityTest()
//  {
//    Driver driver = new Driver("Pittsburgh", "Sennot");
//    assertEquals(driver._location, "Sennot");
//  }

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
//	@Test
//	public void driveRandomTest()
//	{
//		City mockCity = Mockito.mock(City.class);
//		Driver driver = new Driver("Pittsburgh", "College");
//		//make getOutgoingRoads() return only Fifth Ave.
//		when (mockCity.getOutgoingRoads(String).thenReturn("Fifth Ave.");
//		assertEquals(driver.driveRandomLocation(1).getName(), "Fifth Ave.");
//	}
//
//	//make sure driver.getDestinationLocation() works properly
//	@Test
//	public void getLocationTest()
//	{
//		Driver driver = new Driver("Pittsburgh", "Sennot");
//		assertEquals(driver.getDestinationLocation(), "Sennot");
//	}
//
//	//make sure driver.getRoadTaken() works properly
//	@Test
//	public void getRoadTakenTest()
//	{
//		City mockCity = Mockito.mock(City.class);
//		//make getOutgoingRoads() return only Fifth Ave.
//		(mockCity.getOutgoingRoads(String)).thenReturn("Fifth Ave.");
//		assertEquals(driveRandom(1).getName(), "Fifth Ave.");
//	}

}
