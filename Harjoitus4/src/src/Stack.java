/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author kamaj
 */
public class Stack {

	ListItem top; // top näkyy oletuspakkaukseen
	private int size;
	
	int max = 10;
	
	private ListItem[] list = new ListItem[max];

	public Stack() {
		top = null;
		size = 0;
	}

	// palautetaan pino-iteraattori
	public StackIterator iterator() {
		return new StackIterator(this);
	}

	// muodostetaan uusi alkio ja viedään se huipulle
	public void push(String aData) {
		
		if(size < max) {
			ListItem l = new ListItem();
			l.setData(aData);
			list[size] = l;
			l.setLink(top);
			top = l;
			size++;
		}
	}

	// poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
	public ListItem pop() {
		if (0 < size) {
			top = top.getLink();
			size--;
			ListItem l = list[size];
			list[size] = null;
			return l;
		} else {
			return null;
		}
	}

	// palautetaan pinottujen alkioiden lukumäärä
	public int getSize() {
		return size;
	}

	// listataan sisältö
	public void printItems() {
		StackIterator i = iterator();
		while(i.hasNext()) {
			System.out.print(i.next().getData() + ", ");
		}

	}
}
