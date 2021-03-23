package day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance_1_GreenGroceryWithPrintf {

	static List<String> groceriesList = new ArrayList<>();
	static List<Double> prices = new ArrayList<>();
	static List<String> basketGrocery = new ArrayList<>();
	static List<Double> basketWeight = new ArrayList<>();
	static List<Double> basketItemsTotalPrice= new ArrayList<>();
	
	public static void main(String[] args) {
		/*Write a basic green grocery shopping program
		 * 1. Step: Ask to the user to choose product from productList and 
		 * ask how many kilograms does he/she likes to buy
		 * Please select by number at the beginning
					Num 	Grocery 	Price
					====	 =======	 =========
					00	 Tomatoes   	 $ 2.10 
					01	 Potatoes   	 $ 3.20 
					02	 Pepper     	 $ 1.50 
					03	 Onion      	 $ 2.30 
					04	 Carrot     	 $ 3.10 
					05	 Apple      	 $ 1.20 
					06	 Banana     	 $ 1.90 
					07	 Strawberry 	 $ 6.10 
					08	 Melon      	 $ 4.30 
					09	 Grape      	 $ 2.70 
					10	 Lemon      	 $ 0.50
		 * 2. Step : Ask if he/she wants to any other product or not-- 
		 * If he doesn't want show total amount 
		 * if he wants make him choose any other product from the beginning
		 * Repeat this operation until she/he wants to finish the shopping.
		 * 
		 * 3. Step: When customer chooses any product and the price of the product 
		 * will be added to the total amount.
		 * 
		 * 4. Step : Show the total amount when the shopping finishes.
		 * 
		 *  Create two methods named customerChoice() and cash()  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String [] groceriesArray= {"Tomatoes","Potatoes","Pepper","Onion","Carrot",
				"Apple","Banana","Strawberry","Melon","Grape","Lemon"};
		for(String w: groceriesArray) {
			groceriesList.add(w);
		}
		double priceArray[]= {2.1,3.2,1.5,2.3,3.1,1.2,1.9,6.1,4.3,2.7,0.5};
		for(Double w: priceArray) {
			prices.add(w);
		}
		
		String continueShopping="y";
		
		do {
			printGroceryList();
			System.out.println("Which grocery do you want to buy?"
					+ "\nPlease select by entering the number at the beginning");
			System.out.print("Enter your selection: ");
			int groceryNum= scan.nextInt();
			
			System.out.println("How many kilograms do you want?");
			double weight=scan.nextDouble();
			
			printBasket(groceryNum,weight);
			
			System.out.println("Do you need any other grocery? "
					+ "\n Y: Yes or N: No => Go to Cash");
			
			continueShopping = scan.next();
			
			addBasket(groceryNum,weight);
			
	
			
		} while (continueShopping.equalsIgnoreCase("y"));
		
		printBasketAndCash();
	}

	private static void printBasketAndCash() {
		int totalItem=0;
		double totalWeight=0;
		double totalPrice=0;
		System.out.println("**********************************************");
		System.out.println("_______________Basket and Cash_______________");
		System.out.printf("%-10s \t%s \t%s \n","Grocery","Weight" ,"Total");
		for(int i = 0; i<basketGrocery.size();i++) {
			System.out.printf("%-10s \t%-3.1fkg \t $%-5.2f %n",basketGrocery.get(i),basketWeight.get(i),basketItemsTotalPrice.get(i));
		
			totalItem++;
			totalWeight+=basketWeight.get(i);
			totalPrice+=basketItemsTotalPrice.get(i);
		}
		System.out.println("\n-----------------------");
		System.out.println();
		System.out.printf("%d groceries %.2f kg $%.2f %n",totalItem,totalWeight,totalPrice);
		System.out.println();
		System.out.printf("You will pay $%.2f %n", totalPrice);
		System.out.println("**********************************************");
	}

	private static void addBasket(int groceryNum, double weight) {
		basketGrocery.add(groceriesList.get(groceryNum));
		basketWeight.add(weight);
		basketItemsTotalPrice.add(weight*prices.get(groceryNum));
	}

	private static void printBasket(int groceryNum, double weight) {
		System.out.println("___________Your current basket____________");
		System.out.printf("%s \t%s \t%s \t \t%s \n","Num","Grocery","Weight" ,"Total");
		System.out.printf("%02d \t%-10s \t%.1f kg \t \t$%.2f %n",
				groceryNum,groceriesList.get(groceryNum),weight,prices.get(groceryNum)*weight);
	}

	private static void printGroceryList() {
		System.out.println("Num\tGrocery \tPrice");
		System.out.println("====\t======= \t=========");
		for(int i=0; i<groceriesList.size();i++) {
			//System.out.println(i+" "+groceriesList.get(i)+prices.get(i));
			System.out.printf("%02d\t %-10s\t $%5.2f %n",i,groceriesList.get(i),prices.get(i));
		}
	}
	
	
}
