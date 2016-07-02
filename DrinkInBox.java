public class DrinkInBox extends Drink
{
	int height=2;
	int width=2;
	int depth=2;
	
public DrinkInBox(String a, double b, int c, int d, int e)
	{
		super (a,b);
		height=c;
		width=d;
		depth=e;
	}
public void computeTotalPrice()
	{
		volume = height*width*depth;
		totalPrice=volume*unitPrice;
	}
public String toString()
	{
		return ("\nThe Drink in a Box\n"+"The Height:\t\t"+height+"\nThe Width:\t\t"+width+"\nThe Depth:\t\t"+depth+"\nThe DrinkId:\t\t"+drinkId+"\nThe Volume:\t\t"+volume+"\nThe Unit Price:\t\t"+unitPrice+"\nThe Total Price:\t"+totalPrice+"\n\n"+super.toString());
	}	
}