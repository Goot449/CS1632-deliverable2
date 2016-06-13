import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest
{
	//Verify that all 5 locations exist in the city of pittsburgh
	@Test
	public void testNumLocations()
	{
		City pittsburgh = Main.getPittsburgh();
		assertEquals(pittsburgh.getNumLocations(), 5);
	}
	//Verify that there are a total of 10 roads (two-way roads count as 2 separate roads)
	@Test
	public void testNumRoads()
	{
		City pittsburgh = Main.getPittsburgh();
		assertEquals(pittsburgh.getNumRoads(), 10);
	}

}