public abstract class Drink 
{
	protected int volume=0;
	protected double unitPrice=0.0;
	protected double totalPrice=0.0;
	protected String drinkId="";

public Drink(String a, double b)
	{
		drinkId=a;
		unitPrice=b;
	}
public String getDrinkId()	
	{
		return drinkId;
	}
public abstract void computeTotalPrice();
	
public String toString()
	{
		String result = ("\nThe DrinkId:\t\t"+drinkId+"\nThe Volume:\t\t"+volume+"\nThe Unit Price:\t\t"+unitPrice+"\nThe Total Price:		\t"+totalPrice+"\n\n");
		return result;
	}		
}