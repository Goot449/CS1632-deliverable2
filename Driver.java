import java.util.List;
import java.util.Random;

public class Driver
{
	private City _city;
	private String _location;
	private String _roadTaken;
	//initialize driver with location
	public Driver(City pittsburgh, String location)
	{
		this._city = pittsburgh;
		this._location = location;
	}

	public Road driveRandomLocation(Random rand)
	{
		// Get list roads leading away from location
		List<Road> possibleRoads = _city.getOutgoingRoads(_location);
		//Ensure location has possible roads to take
		if (possibleRoads.size() == 0)
		{
			return null;
		}
		// "Drive" down a random road
		int roadIndex = rand.nextInt(possibleRoads.size());
		Road takenRoad = possibleRoads.get(roadIndex);
		//save destination and road name.
		_location = takenRoad.getDest();
		_roadTaken=takenRoad.getName();
		return takenRoad;
	}
	//Return Destination of road taken
	public String getDestinationLocation()
	{
		return _location;
	}
	//return name of road taken
	public String getRoadTaken()
	{
		return _roadTaken;
	}

}
