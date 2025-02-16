package BookStore;

import java.util.ArrayList;


public class Inventory {
	
	ArrayList<Book> inventory = new ArrayList<Book>();
	
	Book book1 = new Book("Attack on Titan", "Hajime Isayama", 85.40);
	Book book2 = new Book("Demon Slayer Kimetsu No Yaiba", "Koyoharu Gotouge", 195.99);
	Book book3 = new Book("Jujutsu Kaisen", "Gege Akutami", 237.99);
	Book book4 = new Book("Solo Leveling", "Chugong", 179.00);

	public Inventory() {

		

		inventory.add(book1);
		inventory.add(book2);
		inventory.add(book3);
		inventory.add(book4);
		
		

	}

}
