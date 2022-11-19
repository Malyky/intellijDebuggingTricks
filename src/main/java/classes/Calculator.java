package classes;

public class Calculator {
	int a = 0;
	int b = 0;

	public Calculator() {
	}

	public void doSomeCalcuations() {
		System.out.println("a has value %s".formatted(a));

		increaseA();

		System.out.println("a has value %s".formatted(a));

		increaseB();

		System.out.println("a has value %s".formatted(a));
	}

	private int shiftClickMe(int a) {
		//System.out.println("I m shift clicked ");
		return a;
	}

	private void increaseB() {
		++b;
	}

	private void increaseA() {
		++a;
	}


}
