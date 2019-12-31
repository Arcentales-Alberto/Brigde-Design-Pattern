package bdp;


public class Delivery implements Restaurant
{

    @Override
    public void work() 
    {
       System.out.print(" and");
       System.out.println(" delivered");
    }
    
}
