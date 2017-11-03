
/**
 * This program translates a few piecewise functions into recursive methods.
 * 
 * @Matthew Guthrie
 * @5/9/17
 */
public class RecursionTester
{
    public static int problem1(int x)
    {
        if(x<=10)
        {
            return -7;
        }
        else
        {
            return problem1(x-4)+2;
        }
    }
    
    public static int problem2(int x)
    {
        if(x<=25)
        {
            return 20;
        }
        else
        {
            return problem2((x/12)+5)-3;
        }
    }
    
    public static int problem4(int x)
    {
        if(x>20)
        {
            return -100;
        }
        else
        {
            return problem4(x*2)-4;
        }
    }
    
    public static void main(String args[])
    {
        System.out.println(problem1(25));
        System.out.println(problem2(30));
        System.out.println(problem4(500));
    }
}
