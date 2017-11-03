
/**
 * Write a description of class CalculationsV5 here.
 * 
 * 
 * Matthew Guthrie
 * 1/1/2017
 * 
 * Calculations V5 is a practice of using int and double variables in Java
 * Different operators are used to create equations which use these variables
 * The point of Calculations V5 is to show how variables should be used over hard-coded values
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        //Int variable assignments
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 16;
        int iNum4 = 15;
        int iNum5 = -2;
        int iNum6 = 10;
        int iNum7 = 5;
        int iNum8 = 234;
        int iNum9 = 6;
        int iNum10 = 12;
        int iNum11 = 3;
        int iNum12 = 11;
        int iNum13 = 24;
        int iNum14 = 17;
        int iNum15 = 2;
        int iNum16 = 480;
        int iNum17 = 20;
        int iNum18 = 200;
        int iNum19 = 8;
        
        //double variable assignments
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
        double dNum4 = 2.5;
        double dNum5 = 46.2;
        double dNum6 = 0.5;
        
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " plus " + iNum2 + " equals ");
        System.out.println(iNum1+iNum2);
        System.out.println((dNum1 + dNum2 + dNum3));
        System.out.println();
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print( iNum3 + " minus " + iNum2 + " minus " + iNum1 + " equals " );
        System.out.println((iNum3 - iNum2 - iNum1) );
        System.out.println((dNum2 - dNum3));
        System.out.println();
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print( iNum1 + " times " + iNum2 + " equals ");
        System.out.println((iNum1 * iNum2));
        System.out.println((dNum2 * dNum3 * dNum3));
        System.out.println();
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print( iNum2 + " divided by " + iNum1 + " equals ");
        System.out.println((iNum2 / iNum1));
        System.out.println((dNum1 / dNum3));
        System.out.println();
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print( iNum3 + " mod " + iNum2 + " equals ");
        System.out.println(iNum3 % iNum2);
        System.out.println((dNum3 % dNum2));
        System.out.println();
        System.out.println();
        
        // 2.02 Lab Equations
        System.out.println("Problem 1");
        System.out.print( iNum4 + " divided by " + dNum4 + " times " + iNum5 + " plus " + iNum6 / iNum7 + " equals ");
        System.out.println(((iNum4/(dNum4)) * iNum5 + iNum6/iNum7));
        System.out.println();
        System.out.println("Problem 2");
        System.out.print(iNum8 + " minus " + (iNum8 + " divided by " + iNum9 + " mod " + iNum10) + " plus " + iNum11  + " equals ");
        System.out.println(iNum8-(iNum8/iNum9 % iNum10)+iNum11);
        System.out.println();
        System.out.println("Problem 3");
        System.out.print((dNum5 + " divided by " + iNum12) + " minus " + iNum11 +" plus " + iNum13 + " mod " + (iNum14 + " minus " + iNum15 + " times " + iNum11) + " equals " );
        System.out.println(((dNum5/iNum12)-iNum11+iNum13%(iNum14-iNum15*iNum11)));
        System.out.println();
        System.out.println("Problem 4");
        System.out.print(iNum16 + " divided by " + iNum6 + " divided by " + iNum10 + " plus " + iNum18 + " times " + dNum6 + " minus " + iNum17 + " mod " + iNum19 + " equals ");
        System.out.println((iNum16/iNum6/iNum10+iNum18*dNum6-iNum17%iNum19));
        System.out.println();
        System.out.println();
        

        // 2.03 Additional int Equations
        System.out.println("2.03 Equations");
        System.out.print(iNum1 + " times " + iNum14 + " minus " + iNum16 + " mod " + iNum10 + " equals ");
        System.out.println((iNum1 * iNum14 - iNum16 % iNum10));
        System.out.print(iNum8 + " plus " + iNum9 + " divided by " + iNum6 + " plus " + iNum12 + " equals ");
        System.out.println((iNum8 + iNum9 / iNum6 + iNum12));
        System.out.println();
        System.out.println();
        
        //2.04 Additional double Equations
        System.out.println("2.04 Equations");
        System.out.print(dNum1 + " minus " + dNum2 + " plus " + dNum3 + " time " + dNum4 + " equals ");
        System.out.println(dNum1-dNum2+dNum3*dNum4);
        System.out.print(dNum5 + " mod " + dNum6 + "divided by " + dNum2 + " plus " + dNum4 + " equals ");
        System.out.println(dNum5%dNum6/dNum2+dNum4);
               
}
}
