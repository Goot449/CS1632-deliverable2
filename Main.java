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

		// Get seed from command line
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
		//Get City
		City pittsburgh = getPittsburgh();


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
