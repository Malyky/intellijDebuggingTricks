package classes;

import classes.Book;

import java.util.Random;

public class BookWithManyFields extends Book {

	int price;
	int popularity;
	int numberOfSales;

	public BookWithManyFields(String name, String author) {
		super(name, author);

		Random random = new Random();
		price = random.nextInt(500);
		popularity = random.nextInt(10);
		numberOfSales = random.nextInt(100000);
	}
}
