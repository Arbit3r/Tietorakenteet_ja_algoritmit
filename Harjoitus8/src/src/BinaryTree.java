/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

	private Node root;

	public BinaryTree(String rootValue) {
		root = new Node(rootValue);
	}

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(String rootValue, BinaryTree left, BinaryTree right) {
		root = new Node(rootValue, left, right);
	}

	public void insert(String aData) {
		int d = Integer.parseInt(aData);

		if (root == null) {
			root = new Node(aData);
		}

		if (d < Integer.parseInt(root.getData())) {

			if (root.left() == null) {
				setLeft(new BinaryTree(aData));
			} else {
				root.left().insert(aData);
			}

		} else if (d > Integer.parseInt(root.getData())) {

			if (root.right() == null) {
				setRight(new BinaryTree(aData));
			} else {
				root.right().insert(aData);
			}

		}

	}

	public void delete(String aData) {
		int d = Integer.parseInt(aData);
		System.out.println(root.getData() + " " + aData);

		/*
		 * Oikean tarkistus
		 */

		int R = 0;
		if (root.right() != null) {
			R = Integer.parseInt(root.right().root.getData());
			System.out.println("oikea: " + R + " Haettava: " + d);
		}

		if (R == d) {

			System.out.println("oikea 1");

			/*
			 * Tapaus 1 ei alipuita
			 */
			if (root.right().root.left() == null && root.right().root.right() == null) {
				setRight(null);

				/*
				 * Tapaus 3 Kaksi alipuuta
				 */
			} else if (root.right().root.left() != null && root.right().root.right() != null) {
				System.out.println("oikea 2" + root.right().root.right().root.getData());
				if (root.right().root.left().root.right() == null) {
					System.out.println("Oikea3");
					BinaryTree n = root.right().root.right();
					root.right().root = root.right().root.left().root;
					setRight(n);
				} else {
					System.out.println("Oikea3.2");
					String s = root.right().root.left().deleteFind();
					System.out.println(s);
					root.right().root.setData(s);
				}
				
				
				/*
				 * Tapaus 2: yksialipuu
				 */
			} else if (root.right().root.left() != null && root.right().root.right() == null) {
				setRight(root.right().root.left());

			} else if (root.right().root.right() != null && root.right().root.left() == null) {
				setRight(root.right().root.right());

			}

		}

		/*
		 * Vasemman tarkistus
		 */
		int L = 0;
		if (root.left() != null) {
			L = Integer.parseInt(root.left().root.getData());
			System.out.println("vasen: " + L + " Haettava: " + d);
		}

		if (L == d) {

			System.out.println("vasen 1" + root.left().root.getData());

			/*
			 * Tapaus 1 ei alipuita
			 */
			if (root.left().root.left() == null && root.left().root.right() == null) {
				setLeft(null);
			}
			/*
			 * Tapaus 3 Kaksi alipuuta
			 */
			else if (root.left().root.left() != null && root.left().root.right() != null) {
				System.out.println("vasen 2");
				if (root.left().root.left().root.right() == null) {
					System.out.println("Vasen3");
					BinaryTree n = root.left().root.right();
					root.left().root = root.left().root.left().root;
					root.setLeft(n);
				} else {
					System.out.println("Vasen 3.2");
					String s = root.left().root.left().deleteFind();
					System.out.println(s);
					root.left().root.setData(s);
				}
				
				/*
				 * Tapaus 2: yksialipuu
				 */
			} else if (root.left().root.left() != null && root.left().root.right() == null) {
				setLeft(root.left().root.left());

			} else if (root.left().root.right() != null && root.left().root.left() == null) {
				setLeft(root.left().root.right());
			}

		}
		if (L == d || R == d) {
			System.out.println("Löytyi!!!");
		} else {
			if (d < Integer.parseInt(root.getData())) {
				root.left().delete(aData);
			} else if (d > Integer.parseInt(root.getData())) {
				root.right().delete(aData);
			}

		}

	}
	
	/*
	 * Palauttaa uuden solmun nimen ja poistaa linkit
	 * 
	 */
	public String deleteFind() {
		System.out.println(root.getData() + " nykyinen oikee");
		String s = "";
		if (root.right().root.right() == null) {
			s = root.right().root.getData();
			if (root.right().root.left() != null) {
				root.right().root = root.right().root.left().root;
			} else {
				setRight(null);
			}
			System.out.println(s + " Palautettava");
			return s;
		} else {
			return root.right().deleteFind();
		}

	}

	public BinaryTree find(String aData) {
		int d = Integer.parseInt(aData);
		System.out.println(root.getData() + " " + aData);
		if (Integer.parseInt(root.getData()) == d) {
			return this;
		}

		if (d < Integer.parseInt(root.getData())) {
			return root.left().find(aData);
		} else if (d > Integer.parseInt(root.getData())) {
			return root.right().find(aData);
		}
		return null;
	}

	public void preOrder() {
		if (root != null) {
			System.out.println(root.getData() + ',');
			if (root.left() != null) // pääseeekö vasemmalle?
				root.left().preOrder();
			if (root.right() != null) // pääseekö oikealle?
				root.right().preOrder();
		}

	}

	public void setLeft(BinaryTree tree) {
		root.setLeft(tree);
	}

	public void setRight(BinaryTree tree) {
		root.setRight(tree);
	}
}
