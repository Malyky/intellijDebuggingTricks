import classes.Book;
import classes.Person;

import java.util.List;
import java.util.Random;

/**
 * Heap Show refering Objects  - eher nicht
 * class level watch
 * inline watch // depbug in println => s.length
 * Lazey evaluation
 * Hotswap?
 */
public class H_Heap {

	public static final String FRODO = "Frodo";
	public static final String HARRY = "Harry";
	public static final String TOLKIN = "Tolkin";

	public static void main(String[] args) {

		Person harry = createPerson(HARRY);
		Person frodo = createPerson(FRODO);
		Person tolkin = createPerson(TOLKIN);

		processOnePerson(harry);

	}

	private static void processOnePerson(Person person) {
		String name = person.getName();
		System.out.println(name);
		int a = 5;
	}


	public static Person createPerson(String name) {
		return new Person(name, getTwoRandomBooks());

	}

	private static List<Book> getTwoRandomBooks() {
		List<Book> books = List.of(
			new Book("Fundamentals of Wavelets", "Goswami, Jaideva"),
			new Book("Data Smart", "Foreman, John"),
			new Book("God Created the Integers", "Hawking, Stephen"),
			new Book("Superfreakonomics", "Dubner, Stephen"),
			new Book("Orientalism", "Said, Edward"),
			new Book("Nature of Statistical Learning Theory, The", "Vapnik, Vladimir"),
			new Book("Integration of the Indian States", "Menon, V P"),
			new Book("Drunkard's Walk, The", "Mlodinow, Leonard"),
			new Book("Image Processing & Mathematical Morphology", "Shih, Frank"),
			new Book("How to Think Like Sherlock Holmes", "Konnikova, Maria"),
			new Book("Data Scientists at Work", "Sebastian Gutierrez"));
		Random random = new Random();
		int rand = random.nextInt(books.size()-1);
		int rand2 = random.nextInt(books.size()-1);

		return List.of(books.get(rand), books.get(rand2));
	}



}
