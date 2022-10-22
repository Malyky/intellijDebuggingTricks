import classes.Book;
import classes.Calculator;
import classes.Person;
import classes.University;

import java.net.http.HttpClient;
import java.util.List;
import java.util.Random;

/**
 * Evluate mit F8
 * Smart Evluate mit Alt F8
 * Siehe Screenshot => Show tooltip value on cod eselection
 * Jump To Source (Harry1)
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Test");

		Calculator a = new Calculator();
		a.doSomeCalcuations();

		Person harry1 = createPerson("Harry");

		if  (harry1.isEnrolled() && harry1.getName().equals("Harry")) {
			harry1.setName("blub");
		}
		Person frodo = createPerson("Frodo");

		List<Person> persons = List.of(harry1, frodo);


		University uni = new University();
		uni.enrollPersons(persons);

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
