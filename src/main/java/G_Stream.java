import classes.Book;
import classes.Person;
import classes.University;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Show stream
 * Show Exection Point for Breakpoint (alf f10)
 * Bookmarks + Memomics Bookmarks (F11 // Strg + F11) ; Shift 11 // Strg + Shift F11)
 * Restore breakpoint (run -> toggle brekapoint, oder bei breakpoint auf "restore breakpoint" drücken in linker zeile)
 */
public class G_Stream {

	public static void main(String[] args) {
		List<Person> persons = List.of(createPerson("Harry"), createPerson("Frodo"), createPerson("Frodoline"), createPerson("Small Harry"));
		University uni = new University();
		uni.enrollPersons(persons);

		List<String> enrolledFrodos = persons.stream()
			.filter(Person::isEnrolled)
			.map(Person::getName)
			.filter(p -> p.contains("Frodo"))
			.collect(Collectors.toList());

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

	// Trick 1. Plugin ==> zeigen wie das funktioniert, z.B. bei Calcuator class (setter etc werden nicht rückgängig gemacht)
	// DropFrame





}
