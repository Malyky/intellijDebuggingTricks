package classes;

public class Book implements IBook {

	private String name;
	private String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public void deleteAllBooks() {

	}
}
