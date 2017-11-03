
/**
 * This program tests the Rectangle class and its subclasses
 * 
 * Matthew Guthrie
 * 6/7/2017
 */
public class TestCube
{
    public static void main(String args[])
    {
        Rectangle rec = new Rectangle(2, 4);
        Box box = new Box(2, 4, 4);
        Cube cube = new Cube(3);
        
        
	    System.out.println("Rec's dimensions are " + rec.getLength() + " x " + rec.getWidth());
	    System.out.println("Box's dimensions are " + box.getLength() + " x " + box.getWidth() + " x " + box.getHeight());
	    System.out.println("Cube's dimensions are " + cube.getLength() + " x " + cube.getWidth() + " x " + cube.getHeight());
    }
}
