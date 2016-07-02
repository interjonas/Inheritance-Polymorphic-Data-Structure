// Assignment #: 5
//         Name: To be completed
//    StudentID: 000-00-0000
//  Description: The Assignment 5 class displays a menu of choices
//               (add a drink, compute their total price, search a drink, list drinks,
//               quit, display menu) to a user.
//               Then it performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.util.*;       //to use ArrayList

public class Assignment5
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean found = false;

     // ArrayList object is used to store drink objects
     ArrayList<Drink>  drinkList = new ArrayList<Drink>();
     printMenu();     // print out menu

     // create a Scanner object to read from a keyboard
     Scanner scan = new Scanner(System.in);

     do
     {
         System.out.println("What action would you like to perform?");
         line = scan.nextLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Drink
               System.out.print("Please enter a drink information to add:\n");
               inputInfo = scan.nextLine().trim();
				Drink drink1=null;
				drink1 = DrinkParser.parseStringToDrink(inputInfo);
				drinkList.add(drink1);
  /***********************************************************************************
  ***  ADD your code here to create an object of one of child classes of Drink class
  ***  and add it to the drinkList
  ***********************************************************************************/
               break;
             case 'C':   //Compute Total Prices
			for (int i=0;i<drinkList.size(); i++) 
						{
							Drink name = drinkList.get(i);
							System.out.println(name);
						}
	
  /***********************************************************************************
  ***  ADD your code here to compute the total price for all drinks in the list.
  ***********************************************************************************/
               System.out.print("total prices computed\n");
               break;
             case 'D':   //Search for Drink
               System.out.print("Please enter a drinkID to search:\n");
               inputInfo = scan.nextLine().trim();
				for (int i=0;i<drinkList.size(); i++) 
				{
					Drink name = drinkList.get(i);
					if (drink) {
						
					}
				}
  /***********************************************************************************
  ***  ADD your code here to search a given drinkID. If found, set "found" true,
  ***  and set "found" false otherwise.
  ***********************************************************************************/
                if (found == true)
                 System.out.print("drink found\n");
                else
                 System.out.print("drink not found\n");
               break;
             case 'L':   //List Drinks
			for (int i=0;i<drinkList.size(); i++) 
			{
				Drink name = drinkList.get(i);
				System.out.println(name);
			}
  /***********************************************************************************
  ***  ADD your code here to print out all drink objects in the list.
  ***  If there is no drink in the list, print "no drink\n"
  ***********************************************************************************/
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read


  }

  /** The method printMenu displays the menu to a use **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Drink\n" +
                      "C\t\tCompute Total Prices\n" +
                      "D\t\tSearch for Drink\n" +
                      "L\t\tList Drinks\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}


