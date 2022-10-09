import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<Meal> vecmeal = new Vector<>();
	
	public int i=0, j=i+1, k=j+1;
	
	public void viewAll() {
		System.out.println("| Order ID | Customer Name | Customer Phone | Meal | Price | Notes|");
		for (Meal meal : vecmeal) {
			meal.Printmeal();
		}
	}
	
	public void Orderin() {
		String aidi, nam, taip, noet, dring, food, toi, milk;
		int fon=0, pres=0;
		aidi = "OR"+i+j+k;
		do {
			System.out.printf("Input Customer Name [Must not empty] : ");
			nam = scan.nextLine();
		}while(nam.isEmpty());
		do {
			System.out.printf("Input Customer Phone [Must not empty] : ");
			fon = scan.nextInt();
			scan.nextLine();
		}while(fon == 0);
		do {
			System.out.printf("Choose Meal [Value Meal | Kids Meal] [Case Insensitive] : ");
			taip = scan.nextLine();
		}while(!taip.equalsIgnoreCase("value meal") && !taip.equalsIgnoreCase("kids meal"));
		if(taip.equalsIgnoreCase("value meal")) {
			do {
				System.out.printf("Choose Drink [Coca Cola | Teh Botol | RB Float] [Case Sensitive] : ");
				dring = scan.nextLine();
			}while(!dring.equals("Coca Cola") && !dring.equals("Teh Botol") && !dring.equals("RB Float"));
			do {
				System.out.printf("Choose Between [Rice | French Fries] [Case Sensitive] : ");
				food = scan.nextLine();
			}while(!food.equals("Rice") && !food.equals("French Fries"));
			System.out.printf("Input Notes : ");
			noet = scan.nextLine();
			if(food.equals("Rice")) {
				pres = 17000;
			}
			else if(food.equals("French Fries")) {
				pres = 22000;
			}
			vecmeal.addElement(new Value(aidi, nam, fon, taip, pres, noet, dring, food));
			System.out.printf("Success Order");
			System.out.printf("Press enter to continue...");
			scan.nextLine();
		}
		if(taip.equalsIgnoreCase("kids meal")) {
			do {
				System.out.printf("Choose Extra Toy [Iron Man | Captain America | Spider Man] [Case Sensitive] : ");
				toi = scan.nextLine();
			}while(!toi.equals("Iron Man") && !toi.equals("Captain America") && !toi.equals("Spider Man"));
			do {
				System.out.printf("Choose Milkshake [Chocolate | Strawberry | Vanilla] [Case Sensitive] : ");
				milk = scan.nextLine();
			}while(!milk.equals("Chocolate") && !milk.equals("Strawberry") && !milk.equals("Vanilla"));
			System.out.printf("Input Notes : ");
			noet = scan.nextLine();
			pres = 20000;
			vecmeal.addElement(new Kids(aidi, nam, fon, taip, pres, noet, toi, milk));
			System.out.printf("Success Order");
			System.out.printf("Press enter to continue...");
			scan.nextLine();
		}
	}

	public void viewOrder() {
		int check = 1;
		String choose;
		if (vecmeal.isEmpty()) {
			System.out.println("No Order");
			System.out.printf("Press enter to continue...");
			scan.nextLine();
		}
		else {
			System.out.println("| Order ID | Customer Name | Customer Phone | Meal | Price | Notes|");
			for (Meal meal : vecmeal) {
				meal.Printmeal();
			}
			do {
				System.out.printf("Choose Order to be proceed [Case Sensitive | 'Cancel' to cancel] : ");
				choose = scan.nextLine();
				vecmeal.remove(check);
				System.out.printf("Success Proceed Order");
				System.out.printf("Press enter to continue...");
				scan.nextLine();
			}while(!choose.equals("Cancel"));
		}
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int menu = 0;
		do {
			if (vecmeal.isEmpty()) {
				System.out.println("No Order");
				System.out.println();
			}
			else{
				viewAll();
			}
			System.out.println("Fast Restaurant");
			System.out.println("1. Order");
			System.out.println("2. Proceed Order");
			System.out.println("3. Exit");
			System.out.printf("Choose :");
			menu = scan.nextInt();
			scan.nextLine();
			switch (menu) {
			case 1:
				Orderin();
				break;

			case 2:
				viewOrder();
				break;
			}
		}while(menu != 3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
