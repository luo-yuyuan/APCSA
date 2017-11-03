
/**
 * This class allows the creations of Forest objects
 * 
 * Matthew Guthrie
 * 6/7/17
 */
public class Forest extends Terrain
{
    private int myTrees;
    
    Forest(int l, int w, int t)
    {
        super(l,w);
        myTrees = t;
    }

    public int getMyTrees()
    {
        return myTrees;
    }
    
    public String printForest()
    {
        return " and has " + myTrees + " trees.";
    }
}
