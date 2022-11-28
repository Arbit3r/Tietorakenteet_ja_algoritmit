/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Iterator;

/**
 *
 * @author kamaj
 */


public class StackIterator implements Iterator<Object> {
	private ListItem current;
	private Stack container; // container on tietorakenne, jota iteroidaan

	StackIterator(Stack c) { // konstruktori on "package visible"
		container = c;
		current = container.top;
	}

	// palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
	// hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai
	// ei.
	@Override
	public boolean hasNext() {
		return current != null;
	}

	// palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä
	// eteenpäin
	@Override
	public ListItem next() {
		ListItem oldCurrent = current;
		current = current.getLink();
		return oldCurrent;
	}
}
