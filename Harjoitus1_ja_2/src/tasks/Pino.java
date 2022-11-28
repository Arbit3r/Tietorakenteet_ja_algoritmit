package tasks;

import src.ListItem;

public class Pino {

	private ListItem mTop; // Viite pinojen huipulle
	private int mSize; // pinon lkm

	public Pino() {

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
	 * Poista alkio pinon huipulta,jos pino on tyhj� > palauta null
	 */
	public ListItem pop() {

		if (mTop.getNext() == null) {
			return null;
		} else if (mTop.getNext() != null) {
			mTop = mTop.getNext();
			mSize--;
			return mTop;
		}
		return mTop;

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
