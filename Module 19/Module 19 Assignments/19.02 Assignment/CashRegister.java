
/**
 * This program creates CashRegister classes
 * 
 * Matthew Guthrie
 * 6/21/17
 */
public class CashRegister
{
    private int cashOnHand;
    
    CashRegister()
    {
        cashOnHand = 500;
    }
    
    CashRegister(int cashOnHand)
    {
        if(cashOnHand <0)
        {
            throw new IllegalArgumentException("Cash on hand but be non-negative.");
        }
        else
        {
            this.cashOnHand = cashOnHand;
        }
    }
    
    public void acceptAmount(int amount)
    {
        if(amount <0)
        {
            throw new IllegalArgumentException("Amount added but be non-negative.");
        }
        else
        {
            this.cashOnHand+=amount;
        }
    }
}
