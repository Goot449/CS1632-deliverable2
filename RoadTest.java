import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jake on 6/12/2016.
 */
public class RoadTest
{
	@Test
	public void getGetName() throws Exception
	{
		Road r = new Road("road", "source", "destination");

		assertEquals(r.getName(), "road");
	}

	@Test
	public void testGetDest() throws Exception
	{
		Road r = new Road("road", "source", "destination");

		assertEquals(r.getDest(), "destination");
	}

	@Test
	public void getGetSource() throws Exception
	{
		Road r = new Road("road", "source", "destination");

		assertEquals(r.getSource(), "source");
	}

}