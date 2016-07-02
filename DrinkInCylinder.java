public class DrinkInCylinder extends Drink
{
	int radius = 0;
	int height = 0;
	
public DrinkInCylinder(String a, double b, int c, int d)
	{
		super (a,b);
		radius=c;
		height=d;
	}
public void computeTotalPrice()
	{
		volume = (int)Math.PI*radius*radius*height;
		totalPrice=volume*height;
	}
public String toString()
	{
		return ("\nThe Drink in a Cylinder\n" +"The Radius:\t\t"+radius+"\nThe Height:\t\t"+height+"\nThe DrinkId:\t\t"+drinkId+"\nThe Volume:\t\t"+volume+"\nThe Unit Price:\t\t"+unitPrice+"\nThe Total Price:\t"+totalPrice+"\n\n"+super.toString());
	}	
}
