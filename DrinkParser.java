public class DrinkParser 
{
public static Drink parseStringToDrink(String lineToParse)
	{
		String info[] = lineToParse.split("/"); 
		info[0] = info[0].toLowerCase();
		if (info[0].equals("cylinder"))
			{
				double unitPrice = Double.parseDouble(info[2]);
				int radius = Integer.parseInt(info[3]);
				int height = Integer.parseInt(info[4]);
				DrinkInCylinder drinkCylinder = new DrinkInCylinder(info[1],unitPrice,radius,height);
				return drinkCylinder;
			}
		if (info[0].equals("box"))
			{
				double unitPrice = Double.parseDouble(info[2]);
				int height = Integer.parseInt(info[3]);
				int width = Integer.parseInt(info[4]);
				int depth = Integer.parseInt(info[5]);
				DrinkInBox drinkBox = new DrinkInBox(info[1],unitPrice,height,width,depth);				return drinkBox;
			}
			return null;
	} 
}