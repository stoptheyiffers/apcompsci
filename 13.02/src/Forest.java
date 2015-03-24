/**
 * Description: Class to declare the Forest type Terrain objects
 *
 * @author  Brett Kind
 * @version 2015-02-14
 *
 */
public class Forest extends Terrain
{
    private int trees;

    /**
     *
     * @param x Length of the terrain generated
     * @param y Width of the terrain generated
     * @param t Number of trees to be generated
     */
    public Forest(int x, int y, int t)
    {
        super(x, y);
        trees = t;
    }

    public int getTrees()
    {
        return trees;
    }

    public String terrainSize()
    {
        return "Forest Land has dimensions " + getLength() + " X " + getWidth() + " and has " + getTrees() + " trees.";
    }
}
