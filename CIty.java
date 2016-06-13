import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class City
{
	private List<String> _locs = new ArrayList<String>();
	private List<Road> _roads = new ArrayList<Road>();
	//Add location to city
	public void addLocation(String loc)
	{
		// Add location only if it doesn't already exist
		if (!_locs.contains(loc))
		{
			_locs.add(loc);
		}
	}

	public int getNumLocations()
	{
		return _locs.size();
	}
	public void paveRoad(Road f)
	{
		// Add locations
		addLocation(f.getSource());
		addLocation(f.getDest());

		//Add road once origin and destination exist
		if (!_roads.contains(f))
		{
			_roads.add(f);
		}
	}
	public int getNumRoads()
	{
		return _roads.size();
	}

	public List<Road> getOutgoingRoads(String src)
	{
		List<Road> outgoing = new ArrayList<Road>();

		for (Road r : _roads)
		{
			if (r.getSource() == src)
			{
				outgoing.add(r);
			}
		}

		return outgoing;
	}

}
