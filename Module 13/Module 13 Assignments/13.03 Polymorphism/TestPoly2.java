
/**
 * This program is meant to model the principles of polymorphism through Circle2 objects
 * 
 * Matthew Guthrie
 * 6/9/17
 */

import java.util.ArrayList;
public class TestPoly2
{
    static void showCenter(Circle2 c)
    {
        System.out.println("For " + c + " " + c.center());
        System.out.println();
    }
    
    public static void main(String args[])
    {
        ArrayList<Circle2> list = new ArrayList<Circle2>();
        
        
        Circle2 circle = new Circle2(2, 4, 10);
        
        Oval2 oval = new Oval2(3, 5, 2, 7);
        
        OvalCylinder2 ovalCylinder = new OvalCylinder2(8, 8, 5, 6, 3);
        
        Cylinder2 cylinder = new Cylinder2(1, 6, 7, 4);
        
        list.add(circle);
        list.add(oval);
        list.add(ovalCylinder);
        list.add(cylinder);
        
        for(Circle2 c : list)
        {
            showCenter(c);
        }
    }
}
