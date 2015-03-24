/**
 * Blank terrain.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Terrain
{
	// instance variables 
	private int length, width;

	/**
	 *
	 * @param l Length of the terrain generated
	 * @param w Width of the terrain generated
	 */
	public Terrain(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	public int getLength()
	{
		return length;
	}

	public int getWidth()
	{
		return width;
	}


	public String terrainSize()
	{
		
		return "Land has dimensions " + length + " X " + width;
	}
}
