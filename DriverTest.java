import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class DriverTest
{

  //ensure driveRandomLocation() returns null when no locations available
//  @Test
//  public void driveRandomNullTest()
//  {
//    City mockCity = Mockito.mock(City.class);
//    Driver driver = new Driver("Pittsburgh", "Sennot");
//    //make getOutgoingRoads() return no locations
//    (mockCity.getOutgoingRoads(String)).thenReturn(null);
//    assertEquals(driveRandomLocation(1), null);
//  }

  //make sure driveRandomLocation returns a road
  @Test
  public void driveRandomTest()
  {
    City mockCity = Mockito.mock(City.class);
    Driver driver = new Driver("Pittsburgh", "Sennot");
    //make getOutgoingRoads() return only Fifth Ave.
    mockCity.getOutgoingRoads(anyString()).thenReturn("Fifth Ave.");
    assertEquals(driver.driveRandomLocation(1).getName(), "Fifth Ave.");
  }

  //make sure driver.getLocation() works properly
  @Test
  public void getLocationTest()
  {
    Driver driver = new Driver("Pittsburgh", "Sennot");
    assertEquals(driver.getLocation(), "Sennot");
  }

  //make sure driver.getRoadTaken() works properly
  @Test
  public void getRoadTakenTest()
  {
    City mockCity = Mockito.mock(City.class);
    //make getOutgoingRoads() return only Fifth Ave.
    (mockCity.getOutgoingRoads(String)).thenReturn("Fifth Ave.");
    assertEquals(driveRandom(1).getName(), "Fifth Ave.");
  }

}
