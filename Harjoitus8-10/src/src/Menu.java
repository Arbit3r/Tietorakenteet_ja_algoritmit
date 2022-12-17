/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.util.Random;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
	public static void main(String[] args) {

		printMenu();

	}

//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
	private static void printMenu() {
		char select;
		BinaryTree tree = new BinaryTree();
		String data;
		do {

			System.out.println("\n\t\t\t1. Lisää avain.");
			System.out.println("\t\t\t2. Etsi avaimella.");
			System.out.println("\t\t\t3. Käy puu läpi esijärjestyksessä.");
			System.out.println("\t\t\t4. Poisto ");
			System.out.println("\t\t\t5. Korkeus ");
			System.out.println("\t\t\t6. Generointi teht18 ");
			System.out.println("\t\t\t7. lopetus ");
			System.out.print("\n\n"); // tehdään tyhjiä rivejä
			select = Lue.merkki();
			switch (select) {
			case '1':
				System.out.println("Anna uusi avain (merkkijono)");
				data = new String(Lue.rivi());
				tree.insert(data);
				System.out.println("Korkeus: " + tree.heightCalc(tree.getRoot()));
				break;
			case '2':
				System.out.println("Anna etsittävä avain (merkkijono)");
				data = Lue.rivi();
				if (tree.find(data) != null) {
					System.out.println("Avain löytyi.");
				} else
					System.out.println("Avainta ei löytynyt.");

				break;
			case '3':
				tree.preOrder();
				char h = Lue.merkki(); // pysäytetään kontrolli
				break;

			case '4':
				System.out.println("Anna poistettava avain (merkkijono)");
				data = Lue.rivi();
				tree.delete(data);
				tree.preOrder();
				System.out.println("Korkeus: " + tree.heightCalc(tree.getRoot()));
				break;
			case '5':
				System.out.println("Korkeusilmaisin: Anna etsittävä avain (merkkijono)");
				data = Lue.rivi();
				try {
					BinaryTree bt = tree.find(data);
					System.out.println("Korkeus: " + tree.heightCalc(bt.getRoot()));
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case '6':
				BinaryTree tree2 = new BinaryTree();
				Random r = new Random();
				String b;
				int i = 0;
				long startTime = System.currentTimeMillis();
				while (i < 100000) {
					b = String.valueOf(r.nextInt(100000));
					if(tree2.find(String.valueOf(b)) == null) {
						i++;
						tree2.insert(String.valueOf(b));
					}
					
				}
				tree2.inOrder();
				long EndTime = System.currentTimeMillis();
				System.out.println("Aika millisekunteissa: " + (EndTime-startTime) + " Aika sekunteissa: " +  ((EndTime-startTime)/1000));
				break;
			case '7':
				break;
			}
		} while (select != '7');
	}
//printMenu loppuu ----------------------------------------------------------------
}
