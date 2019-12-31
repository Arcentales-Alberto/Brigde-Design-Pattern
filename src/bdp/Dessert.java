package bdp;


public class Dessert extends Food
{
      
    public Dessert(Restaurant r, Restaurant r2, Restaurant r3)
    {
        super(r, r2, r3);
    }
    
     @Override
    public void prepare() 
    {
       System.out.print("Dessert: ");
       getR().work();
       getR2().work();
       getR3().work();

      
    }
      
}
