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
  //locations for testing
  private String[] locations = {"Hotel", "Diner", "Library", "College", "Outside City"};
  //ensure driveRandom() returns null when no locations available
  @Test
  public void driveRandomNullTest()
  {
    City mockCity = mock(City.class);
    //make getOutgoingRoads() return no locations
    when (mockCity.getOutgoingRoads(_location)).thenReturn(null);
    assertEquals(driveRandom(1), null);
  }


}
