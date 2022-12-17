package src;

import java.util.Random;

public class Pikalajittelu {
	
	static int laskuri = 0;
	
	public static void quickSortLoop(int MAX) {
        int taulukko[] = new int[MAX];
        Random r = new Random();
        
        for (int i = 0; i < MAX; i++) {
            taulukko[i] = r.nextInt(1000);
            System.out.print(taulukko[i] + " ");
            if (i > 0 && i % 40 == 0) {// rivinvaihto
                System.out.println();
            }
        }
        //System.out.println("\nJärjestellään käyttämällä Quicksorttia, paina Enter");
        //Lue.merkki();
        qs(taulukko, MAX);
        System.out.println("Valmis");
        System.err.println("Vertailujen lukumäärä: " + laskuri);
    }

    public static void quickSort(int table[], int lo0, int hi0) {
        int lo = lo0;
        int hi = hi0;
        int mid, swap;
        mid = table[ (lo0 + hi0) / 2];
        laskuri++;
        while (lo <= hi) {
        	laskuri++;
            while (table[lo] < mid) {
            	laskuri++;
                ++lo;
            }
            laskuri++;
            while (table[hi] > mid) {
            	laskuri++;
                --hi;
            }
            laskuri++;
            if (lo <= hi) {
                swap = table[lo];
                table[lo] = table[hi];
                ++lo;
                table[hi] = swap;
                --hi;
            }
            laskuri++;
        }
        laskuri++;
        if (lo0 < hi) {
            quickSort(table, lo0, hi);
        }
        laskuri++;
        if (lo < hi0) {
            quickSort(table, lo, hi0);
        }
    }

    public static void qs(int table[], int values) {
        quickSort(table, 0, values - 1);

        System.out.println("\nJärjestetty aineisto:\n");
        for (int i = 0; i < values; i++) {
            System.out.print(table[i] + " ");
            if (i > 0 && i % 40 == 0) { // rivinvaihto
                System.out.println();
            }
        }
    }

}