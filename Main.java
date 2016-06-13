import java.util.Random;
public class Main
{
	public static void main(String[] args)
	{
		// Make sure only a single argument was specified
		if(args.length!=1)
		{
			System.out.println("Please specify an Integer as a seed value");
			return;
		}

		// Get seed from arguments
		int seed;
		try
		{
			seed=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Single integer not specified");
			return;
		}
		// set rand to be the random number based off the seed.
		Random rand=new Random(seed);
		//Initialize City
		City pittsburgh = getPittsburgh();

		//Run drivers one at a time
		for (int i = 0; i < 5; i++)
		{
			// Initialize driver
			String startLocation = pittsburgh.getRandomLocation(rand);
			Driver driver = new Driver(pittsburgh, startLocation);

			// Keep driving until out of city
			do
			{
				Road road = driver.driveRandomLocation(rand);
				System.out.printf("Driver "+ i +" heading from "+ road +".\n");

			}while (!driver.getLocation().equals("Outside City"));

			//initialize city text for outside city destinations
			String newCity="";
			if (driver.getRoadTaken().equals("Fourth Ave."))
			{
				newCity = "Philadelphia";
			}
			else if (driver.getRoadTaken().equals("Fifth Ave."))
			{
				newCity = "Cleveland";
			}

			System.out.printf("Driver " + i + " has gone to " + newCity + "!\n");
			System.out.println("-----");
		}


	}

	public static City getPittsburgh()
	{
		City pittsburgh = new City();

		pittsburgh.paveRoad(new Road("Bill St.", "Hotel", "Library"));
		pittsburgh.paveRoad(new Road("Bill St.", "Library", "Hotel"));
		pittsburgh.paveRoad(new Road("Phil St.", "College", "Diner"));
		pittsburgh.paveRoad(new Road("Phil St.", "Diner", "College"));
		pittsburgh.paveRoad(new Road("Fourth Ave.", "Outside City", "Hotel"));
		pittsburgh.paveRoad(new Road("Fourth Ave.", "Hotel", "Diner"));
		pittsburgh.paveRoad(new Road("Fourth Ave.", "Diner", "Outside City"));
		pittsburgh.paveRoad(new Road("Fifth Ave.", "Outside City", "College"));
		pittsburgh.paveRoad(new Road("Fifth Ave.", "College", "Library"));
		pittsburgh.paveRoad(new Road("Fifth Ave.", "Library", "Outside City"));

		return pittsburgh;
	}
}
