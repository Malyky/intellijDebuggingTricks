package classes;

import java.util.List;

public class Person {
	String name;
	List<Book> favouriteBooks;
	boolean enrolled;

	public Person(String name, List<Book> favouriteBooks) {
		this.name = name;
		this.favouriteBooks = favouriteBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getFavouriteBooks() {
		return favouriteBooks;
	}

	public void setFavouriteBooks(List<Book> favouriteBooks) {
		this.favouriteBooks = favouriteBooks;
	}

	public boolean isEnrolled() {
		return enrolled;
	}

	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}
}
