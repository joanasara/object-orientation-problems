package packBooks;

import java.util.Date;

public class TesteLibraryBooks {

	public static void main(String[] args) {
		

		LibraryBook books = new  LibraryBook();
		books.name = "mastering extSJ";
		books.author = "Loaiane";
		books.launchYear = 2015;
		
		books.borrowed = true;
		books.dataEntrega = new Date();
		books.to_whom_lt_Was_Lent = "joana";
		

		System.out.println("the name of the book is: " +books.name);
		System.out.println("the author of the book and: " + books.author);
		System.out.println("the book launch year was: " +books.launchYear);
		
		System.out.println("the book was borrowed: " +books.borrowed);
		System.out.println("the delivery date will be: " +books.dataEntrega);
		System.out.println("the book was loaned to: " +books.to_whom_lt_Was_Lent);
		

	}

}
