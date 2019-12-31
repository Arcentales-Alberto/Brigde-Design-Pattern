package bdp;

/**
 *
 * @author dell-1
 */
public class Main 
{
   public static void main(String[] args)
   {
       Food food = new Soup(new TransactionWindow(), new Kitchen(), new Delivery());
       food.prepare();
       
       Food food2 = new Dessert( new TransactionWindow(), new Kitchen(), new Delivery());
       food2.prepare();

   }
}
