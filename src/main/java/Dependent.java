/**
 * Dependent Breakpoint
 * Condition
 * Callers Fillters (alt enter )
 *Methoden Klasse Dependent + Pattern importantRealWork ==> entry ==> Breakpoint bei Process wieder mit OnceHit
 */
public class Dependent {

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			someWarmUp();
		}

		importantRealWork();
		System.out.println("Work is done");
	}

	private static void someWarmUp() {
		process();
	}

	private static void importantRealWork() {
		process();
	}

	private static void process() {
		int a = 0;
		System.out.println("I was called");
		// do some processing
	}




}
