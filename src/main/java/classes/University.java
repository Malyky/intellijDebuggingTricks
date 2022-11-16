package classes;

import java.util.List;
import java.util.Locale;

public class University {
	int a = 0;
	int b = 0;

	public University() {
	}

	public void enrollPersons(List<Person> persons) {
		for (Person person : persons) {
			if (person.name.toLowerCase(Locale.ROOT).contains("young")) {
				return;
			}
			person.setEnrolled(true);
		}
	}

	public void enrollPerson(Person person) {
		doSth();
		person.setEnrolled(true);
	}


	private void doSth() {

	}

}
