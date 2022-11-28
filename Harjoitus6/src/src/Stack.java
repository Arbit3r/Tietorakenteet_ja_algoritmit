package src;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Jono harjoitus
 */
public class Stack {

	private LinkedList<String> list;

	public Stack() {

		list = new LinkedList<String>();

	}

	/*
	 * muodosta uusi lista-alkio, vie se pinon huipulle
	 */
	public void push(String data) {

		list.push(data);

	}

	/*
	 * Poista alkio pinon lopusta,jos pino on tyhj� > palauta null
	 */
	public String pop() {
		
		if(!list.isEmpty()) {
			return list.pop();
		}
		
		return null;
		
	}
	/*
	 * Tulosta pinon sis�lt�
	 */

	public void printItems() {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next() + ", ");
		}

	}

	public String Amount() {
		// TODO Auto-generated method stub
		return Integer.toString(list.size());
	}

}
