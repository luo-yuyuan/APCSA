
/**
 * This program creates the Triangle class and its different subclasses
 * 
 * Matthew Guthrie
 * 6/7/2017
 */
public class TestTriangles
{
   public static void main(String args[])
   {
       Triangle triangle = new Triangle(4, 5, 6);
       
       Equilateral equilateral = new Equilateral(5);
       
       IsoscelesRight right = new IsoscelesRight(1.5);
       
       System.out.println("Triangle has sides A = " + triangle.getMySideA() + " B = " + triangle.getMySideB() + " C = " + triangle.getMySideC());
       System.out.println("Equilateral Triangle has sides A = " + equilateral.getMySide() + " B = " + equilateral.getMySide() + " C = " + equilateral.getMySide());
       System.out.print("Isosceles Right Trianle has sides A = " + right.getMyLeg() + " B = " + right.getMyLeg() + " C = " + right.getMyHypotenuse());
   }
}
