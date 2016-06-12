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
		// set rng to be the random number based off the seed.
		Random rng=new Random(seed);

		City pittsburgh = new City();

		pittsburgh.addLocation("Outside City");
		pittsburgh.addLocation("Hotel");
		pittsburgh.addLocation("Diner");
		pittsburgh.addLocation("Library");
		pittsburgh.addLocation("College");


	}
}
