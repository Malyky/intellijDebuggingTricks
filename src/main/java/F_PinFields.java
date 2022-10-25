import classes.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Pin Fields (z.B: name)
 * Renderer: z.B. Auf Persons. "Name") oder name + enroll
 * Class level watch
 * Renderer auf Liste: this.size oder children: to Array (das verstehe ich nicht ganz https://www.jetbrains.com/help/idea/customizing-views.html#productivity_tips)
 *
 */
public class F_PinFields {

	public static void main(String[] args) {
		System.out.println("Test");

		List<Person> persons = Arrays.asList(createPerson("Harry"), createPerson("Frodo"));

		University uni = new University();
		uni.enrollPersons(persons);

	}


	public static Person createPerson(String name) {
		return new Person(name, getTwoRandomBookWithManyFieldss());

	}

	private static List<Book> getTwoRandomBookWithManyFieldss() {
		List<BookWithManyFields> BookWithManyFieldss = List.of(
			new BookWithManyFields("Fundamentals of Wavelets", "Goswami, Jaideva"),
			new BookWithManyFields("Data Smart", "Foreman, John"),
			new BookWithManyFields("God Created the Integers", "Hawking, Stephen"),
			new BookWithManyFields("Superfreakonomics", "Dubner, Stephen"),
			new BookWithManyFields("Orientalism", "Said, Edward"),
			new BookWithManyFields("Nature of Statistical Learning Theory, The", "Vapnik, Vladimir"),
			new BookWithManyFields("Integration of the Indian States", "Menon, V P"),
			new BookWithManyFields("Drunkard's Walk, The", "Mlodinow, Leonard"),
			new BookWithManyFields("Image Processing & Mathematical Morphology", "Shih, Frank"),
			new BookWithManyFields("How to Think Like Sherlock Holmes", "Konnikova, Maria"),
			new BookWithManyFields("Data Scientists at Work", "Sebastian Gutierrez"));
		Random random = new Random();
		int rand = random.nextInt(BookWithManyFieldss.size()-1);
		int rand2 = random.nextInt(BookWithManyFieldss.size()-1);

		return Arrays.asList(BookWithManyFieldss.get(rand), BookWithManyFieldss.get(rand2));
	}

	// Trick 1. Plugin ==> zeigen wie das funktioniert, z.B. bei Calcuator class (setter etc werden nicht rückgängig gemacht)
	// DropFrame





}
