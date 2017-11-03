
/**
 * This class tests the Rectangle3, Box3, and Cube3 objects
 * 
 * Matthew Guthrie
 * 6/14/17
 */
public class testNew
{
    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }
    
    public static void main(String args[])
    {
        Rectangle3 rec = new Rectangle3(3,4);
        Box3 box1 = new Box3(4,4,4);
        Box3 box2 = new Box3(6,4,5);
        Cube3 cube = new Cube3(4);
        
        showEffectBoth(rec);
        showEffectBoth(box1);
        showEffectBoth(box2);
        showEffectBoth(cube);
        System.out.println(box1.equals(cube));
        System.out.println(box2.equals(cube));
    }
}
