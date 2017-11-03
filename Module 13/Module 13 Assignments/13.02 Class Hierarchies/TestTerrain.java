
/**
 * This program tests the Terrain class and its subclasses
 * 
 * Matthew Guthrie
 * 6/7/17
 */
public class TestTerrain
{
    public static void main(String args[])
    {
        Forest forest = new Forest(100, 200, 100);
        Mountain mountain = new Mountain(300, 400, 25);
        WinterMountain winter = new WinterMountain(500,600,15,10.0);
        
        System.out.println("Forest " + forest.terrainSize() + forest.printForest());
        System.out.println("Mountain " + mountain.terrainSize() + mountain.printMountains());
        System.out.println("Winter Mountain " + winter.terrainSize() + winter.printWinterMountain() + winter.printMountains());
    }
}
