import java.util.List;
import java.util.Random;

/**
 * Drop Frame
 * Force Return
 * Force Exception
 */
public class DropFrame {


	public static void main(String[] args) {

		int a = 100;

		double processedA = process(a);
		if (filter(processedA)) {
			System.out.println("Filter was true");
		}

	}

	private static double process(int number) {
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

}
