/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Ex. 2.15 //
    private int status;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    //    public TicketMachine(int ticketCost)
    // exercise 2.41 use setprice as a parameter
    public TicketMachine(int setPrice)
    {
        /** book 2.4 (pg.28) 
        * ticketCost is a parameter taken by the constructor (a variable defined here, the space in memory is reserved but value not set)
        *
        **/
        // price = ticketCost;
        price = setPrice;
        balance = 0;
        total = 0;
    }
    
    /**
    * excercise 2.42 second constructor with default price 
    */
    public TicketMachine()
    {
       price = 20;
    }
   
     /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
       return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /** 
       * Ex. 2.24
         */
    public int getTotal()
    {
        return total;
    }
    
    /*
     * 2.33 prompt method
     */
    public void prompt()
    {
        System.out.println("Please Insert the correct amount of money.");
    }
    
    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
          if (amount <= 0) {
              System.out.println("Wrong amount ");
              prompt();
              System.out.println();
          } else {
               balance = balance + amount;
            }
    }
   
    /**
     * 2.29 sets a value for the price field
     */
    public void setPrice(int ticketCost)
    {
        price = ticketCost;
    }
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if (balance > price) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            
            // Update the total collected with the balance.
            total = total + balance;
            // Clear the balance.
            // balance = 0;
            // returns the true balance and an error if there is not enouth cash
            balance = balance - price ;
        } else {
            System.err.println("Balance too low!");
        }
    }
    
    /** exercise 2.40 
     * empty all the money from the machine
     */
    public void empty()
    {
        balance = 0;
    
    }
    
 




}
