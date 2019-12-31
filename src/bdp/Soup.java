package bdp;


public class Soup extends Food
{
    public Soup(Restaurant r, Restaurant r2, Restaurant r3)
    {
        super(r, r2, r3);
    }


    @Override
    public void prepare() 
    {
       System.out.print("Soup: ");
       getR().work();
       getR2().work();
       getR3().work();
    }
   
}
