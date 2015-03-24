/**
 * Description: Class to declare the WinterMountain type Mountain objects
 *
 * @author  Brett Kind
 * @version 2015-02-14
 *
 */
public class WinterMountain extends Mountain
{
    private double mountainTemp;

    /**
     *
     * @param x Length of the terrain generated
     * @param y Width of the terrain generated
     * @param mountains Number of mountains to be generated
     * @param temp Temperature for the terrain
     */
    public WinterMountain(int x, int y, int mountains, double temp )
    {
        super(x, y, mountains);
        mountainTemp = temp;
    }

    public double getMountainTemp()
    {
        return mountainTemp;
    }

    public String terrainSize()
    {
        return "Winter Mountain Land has dimensions " + getLength() + " X " + getWidth() +" with the temperature " + getMountainTemp() + " and has " + getAmountOfMountains() + " mountains.";
    }
}