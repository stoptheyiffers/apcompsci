/**
 * Description: Class to declare the Mountain type Terrain objects
 *
 * @author  Brett Kind
 * @version 2015-02-14
 *
 */
public class Mountain extends Terrain
{
    private int amountOfMountains;

    /**
     *
     * @param x Length of the terrain generated
     * @param y Width of the terrain generated
     * @param mountainSize Number of mountain generated
     */
    public Mountain(int x, int y, int mountainSize)
    {
        super(x, y);
        amountOfMountains = mountainSize;
    }

    public int getAmountOfMountains()
    {
        return amountOfMountains;
    }

    public String terrainSize()
    {
        return "Mountain Land has dimensions " + getLength() + " X " + getWidth() + " and has " + getAmountOfMountains() + " mountains.";
    }
}
