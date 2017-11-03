
/**
 * This class allows for the creations of Mountain objects, and is the basis for WinterMountain objects
 * 
 * Matthew Guthrie
 * 6/7/17
 */
public class Mountain extends Terrain
{
    private int myMountains;
    
    Mountain(int l, int w, int m)
    {
        super(l,w);
        myMountains = m;
    }

    public int getMyMountains()
    {
        return myMountains;
    }
    
    public String printMountains()
    {
        return " and has " + myMountains + " mountains.";
    }
}
