import java.util.List;

/**
 * TODO
 * Eventuell human klasse von ihm kopieren  https://youtu.be/40Og3hTV--k?t=1181
 * Breakpoint Types => hierfür noch neue Klasse einfallen lassen wo es mehr sinn macht
 * Interface Methoden Breakpoint zeigen (/auf String.getProfession() Breakpooint => Entry. exit zeigen; Genauso Field a
 */
public class C_ClassFilters {

	String a;

	public static void main(String[] args) {

		Worker worker1 = new Cook();
		Worker worker2 = new Author();

		List<Worker> workerList = List.of(worker1, worker2);

		for (Worker worker : workerList) {
			doWork(worker);
		}
	}

	private static void doWork(Worker worker) {
		worker.getProfession();
		worker.doSomeWork();
	}


	interface a {
		String getProfession();
	}

	static abstract class Worker implements a {

		void doSomeWork() {
			System.out.println("Im a good worker");
		}

	}
	static class Cook extends Worker {

		@Override
		public String getProfession() {
			System.out.println("Im a Cook");
			return "Cook";
		}


	}

	static class Author extends Worker {

		@Override
		public String getProfession() {
			System.out.println("Im a Author");
			return "Author";
		}
	}



}
