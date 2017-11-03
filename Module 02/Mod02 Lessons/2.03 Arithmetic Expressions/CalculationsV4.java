
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */

/**
 * Matthew Guthrie
 * 12/27/16
 */
public class CalculationsV4  
{
    public static void main(String[ ] args)
    {
        int Num1 = 25;
        int Num2 = 9;
        int Num3 = 16;
        int Num4 = 15;
        int Num5 = -2;
        int Num6 = 10;
        int Num7 = 5;
        int Num8 = 234;
        int Num9 = 6;
        int Num10 = 12;
        int Num11 = 3;
        int Num12 = 11;
        int Num13 = 24;
        int Num14 = 17;
        int Num15 = 2;
        int Num16 = 480;
        int Num17 = 20;
        int Num18 = 200;
        int Num19 = 8;
        
        // Addition
        System.out.println("Addition");
        System.out.println( "25 plus 9 equals " + (Num1 + Num2) );
        System.out.println((43.21 + 3.14 + 5.0));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( "16 minus 9 minus 25 equals " + (Num3 - Num2 - Num1) );
        System.out.println((3.14 - 5.0));
        System.out.println();
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 times 9 equals " + (Num1 * Num2) ); 
        System.out.println((3.14 * 5.0 * 5.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( "9 divided by 25 equals " + (Num2 / Num1) );
        System.out.println((43.21 / 5.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "16 mod 9 equals " + (Num3 % Num2) );
        System.out.println((5.0 % 3.14));
        System.out.println();
        
        // 2.02 Lab Equations
        System.out.println("Problem 1");
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5 equals " + ((Num4/(2.5)) * Num5 + Num6/Num7));
        System.out.println();
        System.out.println("Problem 2");
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3 equals " + (Num8-(Num8/Num9 % Num10)+Num11));
        System.out.println();
        System.out.println("Problem 3");
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals " + ((46.2/Num12)-Num11+Num13%(Num14-Num15*Num11)));
        System.out.println();
        System.out.println("Problem 4");
        System.out.println("480 divided by 10 divided by 12 plus 200 *0.5 minus 20 modulus 8 equals " + (Num16/Num6/Num10+Num18*0.5-Num17%Num19));
        System.out.println();
        

        // 2.03 Additional int Equations
        System.out.println("25 times 17 minus 480 mod 12 equals "  + (Num1 * Num14 - Num16 % Num10));
        System.out.println("234 plus 6 divided by 10 plus 11 equals " + (Num8 + Num9 / Num6 + Num12));
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
