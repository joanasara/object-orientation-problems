package packBooks;

import java.util.Locale;

public class TestBookstoreBook {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		BookstoreBook books = new BookstoreBook();
		books.name = "mastering extSJ";
		books.author = "Loaiane";
		books.launchYear = 2015;
		books.price = 63.39;
		
		
		System.out.println("the name of the book is: " +books.name);
		System.out.println("the author of the book and: " + books.author);
		System.out.println("the book launch year was: " +books.launchYear);
		System.out.println("the book value and: " +books.price);
		

	}

}
