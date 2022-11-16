/**
 * Evaluate and Log + Hit Message
 * ShiftClick for logging
 */
public class D_Shiftclick {

	public static void main(String[] args) {
		int b = 0;

		for (int i = 0; i < 10; i++) {
			b = increment(b);
		//	System.out.println("Value of b " + b);
		}

		System.out.println("Final value of b is " + b);
	}

	private static int increment(int b) {
		return b + 1;
	}

}
