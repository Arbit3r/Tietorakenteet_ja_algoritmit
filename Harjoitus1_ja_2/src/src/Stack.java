package src;

import java.util.Iterator;

/*
 * Jono harjoitus
 */
public class Stack {

	private ListItem mTop; // Viite pinojen huipulle
	private int mSize; // pinon lkm

	public Stack() {

		mTop = null;
		mSize = 0;

	}

	/*
	 * muodosta uusi lista-alkio, vie se pinon huipulle
	 */
	public void push(String data) {

		ListItem temp = null;
		
		if (mTop != null) {
			temp = mTop;
		}
		
		mTop = new ListItem();
		mTop.setData(data);
		
		if (temp != null) {
			mTop.setNext(temp);
		}
		

		mSize++;

	}

	/*
	 * Poista alkio pinon lopusta,jos pino on tyhj� > palauta null
	 */
	public ListItem pop() {
		
		ListItem temp;
		temp = mTop;
		for (int i = 0; i < mSize; i++) {
			System.out.println(i + " Tämänhetkinen");
			if(temp.getNext().getNext() == null) {
				ListItem t = temp.getNext();
				temp.setNext(null);
				mSize--;
				return t;
			}
			temp = temp.getNext();
		}
		return null;

	}
	/*
	 * Tulosta pinon sis�lt�
	 */

	public void printItems() {
		ListItem temp = mTop;
		System.out.println(temp.getData());
		while (temp.getNext() != null) {
			temp = temp.getNext();
			System.out.println(temp.getData());

		}

	}

	public int Amount() {
		return mSize;
	}

	public ListItem getmTop() {
		return mTop;
	}

	public void setmTop(ListItem mTop) {
		this.mTop = mTop;
	}

	public int getmSize() {
		return mSize;
	}

	public void setmSize(int mSize) {
		this.mSize = mSize;
	}

}
