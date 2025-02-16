package BookStore;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);

		boolean run = true;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("Welcome to our bookstore!!!\n" + "Please make a selection\n" + "1. Search Inventory\n"
					+ "2. Search by author\n" + "3. Check Cart");

			switch (scanner.nextInt()) {

			case 1:

				Inventory books = new Inventory();

				for (int i = 0; i < books.inventory.size(); i++) {
					String name = books.inventory.get(i).getTitle();
					String author = books.inventory.get(i).getAuthor();
					double price = books.inventory.get(i).getPrice();

					System.out.println(name + ": " + dollarFormat.format(price));

				}

				System.out.println("Enter name of book.");
				String name = scanner.next();
				System.out.println(name);
				break;

			default:
				System.out.println("Please make a valid selection");

			}

		}
	}

}
