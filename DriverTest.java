import static org.junit.Assert.*;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class DriverTest
{

  //ensure driveRandom() returns null when no locations available
  @Test
  public void driveRandomNullTest()
  {
    City mockCity = Mockito.mock(City.class);
    //make getOutgoingRoads() return no locations
    (mockCity.getOutgoingRoads(String)).thenReturn(null);
    assertEquals(driveRandom(1), null);
  }

  //make sure driveRandom returns a road
  @Test
  public void driveRandomTest()
  {
    City mockCity = Mockito.mock(City.class);
    //make getOutgoingRoads() return only Fifth Ave.
    (mockCity.getOutgoingRoads(String)).thenReturn("Fifth Ave.");
    assertEquals(driveRandom(1).getName(), "Fifth Ave.");
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
