/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.util.Iterator;
import java.util.Random;
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
			System.out.println("\t\t\t3. InOrder ");
			System.out.println("\t\t\t4. Generoi 100k numeroita ");
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
				System.out.println("Descending order: ");
				Iterator<Integer> i = ts.descendingIterator();
				while (i.hasNext()) {
					System.out.println(i.next() + ", ");
					
				}			
				break;
			case '4':
				Random r = new Random();
				int b = 0;
				long startTime = System.currentTimeMillis();
				while (ts.size() < 100000) {
					b = r.nextInt(100000);
					if(!ts.contains(b)) {
						ts.add(b);
					}
					
				}
				System.out.println("Descending order: ");
				Iterator<Integer> i2 = ts.descendingIterator();
				while (i2.hasNext()) {
					System.out.println(i2.next() + ", ");
					
				}
				long EndTime = System.currentTimeMillis();
				System.out.println("Aika millisekunteissa: " + (EndTime-startTime) + " Aika sekunteissa: " +  ((EndTime-startTime)/1000));
				break;
			}
		} while (select != '6');
	}
//printMenu loppuu ----------------------------------------------------------------
}
