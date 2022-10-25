/**
 * Drop Frame
 * Force Return
 * Force Exception
 */
public class E_DropFrame {


	public static void main(String[] args) {

		int a = 100;

		double modifiedA = modify(a);

		if (filter(modifiedA)) {
			System.out.println("Filter was true");
		}

		divideByA(a);


	}


	private static double modify(int number) {
		double result;
		result = number * 20;
		result += 4;
		result = result % 3 + 1;

		return result;
	}

	private static boolean filter(double a) {
		return a > 100 && Math.round(a) < 20;
	}


	private static double processWithSameNumber(int number) {
		number = number * 20;
		number += 4;
		number = number % 3 + 1;

		return number;
	}


	private static void divideByA(int a) {
		try {
			int c = 1/a;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
