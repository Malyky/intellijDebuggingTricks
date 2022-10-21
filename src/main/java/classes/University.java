package classes;

import java.util.List;

public class University {
	int a = 0;
	int b = 0;

	public University() {
	}

	public void enrollPersons(List<Person> persons) {
		for (Person person : persons) {
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
