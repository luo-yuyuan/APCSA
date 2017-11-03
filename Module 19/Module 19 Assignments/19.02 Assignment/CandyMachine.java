
/**
 * This program tests the exceptions thrown in the Dispenser and CashRegister classes
 * 
 * Matthew Guthrie
 * 6/21/17
 */
public class CandyMachine
{
    public static void sellProduct(Dispenser d, CashRegister c, int a)
    {
        /*
          methods to test argument calls
          
          for(int i=0; i<1000; i++)
          {
               d.makeSale();
          }
        
          c.acceptAmount(-1);
          */
         
        
        
        d.makeSale();
        System.out.println("Collect your item at the bottom and enjoy");
        
        c.acceptAmount(a);
        System.out.println("Amount inserted successfully.");
    }
    
    public static void main(String args[])
    {
        //checks for Constructor arguments
        //Dispenser d = new Dispenser(-1, -5);
        //CashRegister cr = new CashRegister(-1000);
        
        
        Dispenser dispenser = new Dispenser(100, 50);
        CashRegister cashRegister = new CashRegister(1000);
        int amountInserted = 30;
        
        sellProduct(dispenser, cashRegister, amountInserted);
    }
}
