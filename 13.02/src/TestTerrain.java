/**
 * Description: Tester class for the Terrain type objects
 *
 * @author  Brett Kind
 * @version 2015-02-14
 *
 */
public class TestTerrain
{
    public static void main(String args[])
    {
        Forest forest = new Forest(100, 200, 100);
        Mountain mountain = new Mountain(300, 400, 25);
        WinterMountain winterMountain = new WinterMountain(500, 600, 15, 10.0);

        System.out.println(forest.terrainSize());
        System.out.println(mountain.terrainSize());
        System.out.println(winterMountain.terrainSize());
    }
}
