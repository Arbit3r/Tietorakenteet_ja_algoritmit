/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.util.TreeSet;

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
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int data;
		do {

			System.out.println("\n\t\t\t1. Lisää avain.");
			System.out.println("\t\t\t2. Etsi avaimella.");
			System.out.println("\t\t\t3. Poisto ");
			System.out.print("\n\n"); // tehdään tyhjiä rivejä
			select = Lue.merkki();
			switch (select) {
			case '1':
				System.out.println("Anna uusi avain (merkkijono)");
				data = Integer.parseInt(Lue.rivi());
				ts.add(data);
				break;
			case '2':
				System.out.println("Anna etsittävä avain (merkkijono)");
				data = Integer.parseInt(Lue.rivi());
				ts.contains(data);
				break;
			case '3':
				break;
			}
		} while (select != '6');
	}
//printMenu loppuu ----------------------------------------------------------------
}
