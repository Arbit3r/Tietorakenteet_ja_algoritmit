package src;

public class Menu {
	// main
	// alkaa-----------------------------------------------------------------------------
	public static void main(String[] args) {

		printMenu();

	}

	// main loppuu
	// --------------------------------------------------------------------------
	// printMenu
	// alkaa------------------------------------------------------------------
	private static void printMenu() {
		char select;
		Stack s = new Stack(); // pino-olio
		String data; // Pinon data-kentt�
		do {

			System.out.println("\n\t\t\t1. Alkion lis��minen.");
			System.out.println("\t\t\t2. Alkion poistaminen.");
			System.out.println("\t\t\t3. Pinon sis�lt�.");
			System.out.println("\t\t\t4. Alkioiden lukum��r�.");
			System.out.println("\t\t\t5. lopetus ");
			System.out.print("\n\n"); // tehd��n tyhji� rivej�
			select = Lue.merkki();
			switch (select) {
			case '1':
				System.out.println("Anna alkion sis�lt� (merkkijono)");
				data = new String(Lue.rivi());
				s.push(data);
				break;
			case '2':
				String item = s.pop();
				if (item == null)
					System.out.println("Pino on tyhj�");
				else
					System.out.println("Poistettu alkio: " + item);
				break;
			case '3':
				s.printItems();
				break;
			case '4':
				System.out.println("Lukum��r� = " + s.Amount());
				break;
			case '5':
				break;
			}
		} while (select != '5');
	}
	// printMenu loppuu
	// ----------------------------------------------------------------
}