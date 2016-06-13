public class Road
{
	private String _src;
	private String _name;
	private String _dest;
	//Check that street natme, origin, and destination are all specified strings
	public Road(String name, String src, String dest)
	{
		if (name == null || src == null || dest == null)
		{
			throw new IllegalArgumentException("One or more arguments missing.");
		}
		//set attribute for object
		this._name = name;
		this._src = src;
		this._dest = dest;
	}
	//Oerride Road Object String operator with a string output of
	@Override
	public String toString()
	{
		return String.format("%s to %s via %s", _src, _dest, _name);
	}
	public String getName()
	{
		return _name;
	}

	public String getSource()
	{
		return _src;
	}

	public String getDest()
	{
		return _dest;
	}

}