/**
 * Hotswap falls ich will
 * Overhead view
 */
public class HotSwap {

	public static void main(String[] args) {

		for (int i = 0; i < 1000000; i++) {
			if (args.hashCode() <0) {
				break;
			}
		}

	}



}
