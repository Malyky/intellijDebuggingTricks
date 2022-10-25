/**
 * Dependent Breakpoint
 * Condition
 * Callers Fillters (alt enter )
 * Methoden Klasse Dependent + Pattern importantRealWork ==> entry ==> Breakpoint bei Process wieder mit OnceHit
 */
public class B_Dependent {

	public static void main(String[] args) {

		for (int i = 1; i < 21; i++) {
			someWarmUp();
			System.out.println(i);
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
		System.out.println("Doing some process");
		// do some processing
	}




}
