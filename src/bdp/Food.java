package bdp;


 public abstract class Food 
{
      private final Restaurant r;
      private final Restaurant r2;
      private final Restaurant r3;


      public Food(Restaurant r, Restaurant r2,  Restaurant r3)
      {
        this.r = r;
        this.r2 = r2; 
        this.r3 = r3;       
      }

    protected Restaurant getR()
    {
        return r;
    }

    protected Restaurant getR2()
    {
        return r2;
    }

    protected Restaurant getR3() 
    {
        return r3;
    }
           
      
      public abstract void  prepare();
      
      
}
