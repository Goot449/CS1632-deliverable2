public class Driver
{
  private String _location;
  private String _dest;
  private String[] locations = {"Hotel", "Diner", "Library", "College", "Outside City"};
  //Check that rand is recieved
  public Driver(Random rand)
  {
    if (rand == null)
    {
      throw new IllegalArgumentException("argument missing.");
    }
    //set attribute for object
    this._location = locations[rand.nextInt[4]];
  }

  public String getLocation()
  {
    return _location;
  }
  public String getDest()
  {
    //find available routes
    //choose from availabe routes randomly
  }
}
