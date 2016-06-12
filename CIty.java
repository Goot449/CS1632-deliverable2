import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class City
{
	private List<String> _locs = new ArrayList<String>();


	/*
	 * Add a destination to the city
	 */
	public void addLocation(String loc)
	{
		// Add location if it doesn't already exist
		if (!_locs.contains(loc))
		{
			_locs.add(loc);
		}
	}

	public int getNumLocations()
	{
		return _locs.size();
	}

}
