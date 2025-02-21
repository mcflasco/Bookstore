package BookStore;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	static NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
	static Scanner input;
	static String selection = null;
	static Inventory books = new Inventory();
	static Book book = null;
	static Cart cart = new Cart();

	public static void main(String[] args) {

		boolean run = true;

		input = new Scanner(System.in);

		while (run) {
			System.out.println("Welcome to our bookstore!!!\n" + "Please make a selection\n\n" + "1. Search Inventory\n"
					+ "2. Check Cart\n");

			switch (input.nextInt()) {

			case 1:
				displayInventory();

				userChoice();
				break;

			case 2:
				checkCart();
				break;
			}

		}

	}

	public static void displayInventory() {

		for (int i = 0; i < books.inventory.size(); i++) {
			book = books.inventory.get(i);

			System.out.println(
					book.getBookId() + " " + book.getTitle() + ": " + dollarFormat.format(book.getPrice()) + "\n");

		}
	}

	public static void userChoice() {
		System.out.println("Make a selection.\n");
		selection = input.next();
		Book selectedItem = null;
		String id = null;
		

		for (int i = 0; i < books.inventory.size(); i++) {
			id = books.inventory.get(i).getBookId();
			if (selection.equals(id)) {
				selectedItem = books.inventory.get(i);

				cart.items.add(new Book(selectedItem.getTitle(), selectedItem.getPrice()));

				;
			}
		}

	}

	public static void checkCart() {
		int num = 0;
		if (cart.items.isEmpty()) {
			System.out.println("There are no items in your cart");
		} else {
			for (int i = 0; i < cart.items.size(); i++) {
				System.out.println(cart.items.get(i).getTitle() + " " + cart.items.get(i).getPrice() + "\n");
				
			}

		}
	}

}
