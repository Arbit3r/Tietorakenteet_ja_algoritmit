package src;

public class Menu {
	//main alkaa-----------------------------------------------------------------------------
	        public static void main(String[] args) {

	                        printMenu();

	        }
	//main loppuu --------------------------------------------------------------------------
	//printMenu alkaa------------------------------------------------------------------
	        private static void printMenu() {
	                char select;
	                String data; // Pinon data-kentt�
	                do {

	                        System.out.println("\n\t\t\t1. Alkion lis��minen.");
	                        System.out.println("\t\t\t2. Alkion poistaminen.");
	                        System.out.println("\t\t\t3. Lopetus");;
	                        System.out.print("\n\n"); // tehd��n tyhji� rivej�
	                        select = Lue.merkki();
	                        switch (select) {
	                        case '1':
	                            break;
	                        case '2':
	                            break;
	                        case '3':
	                            break;
	                        }
	                }
	                while (select != '5');
	        }
	//printMenu loppuu ----------------------------------------------------------------
	}