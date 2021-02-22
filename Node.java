
public class Node {

	private int a;		
	private int b;			
	private Node left;		
	private Node right;		

	// Constructors.
	public Node(int _a, int _b) {
		a = _a;
		b = _b;
		left = null;
		right = null;
	}


	// Accessors.
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}

	// Mutators.
	public void setA(int _a) {
		a = _a;
	}
	public void setB(int _b) {
		b = _b;
	}
	public void setLeft(Node _left) {
		left = _left;
	}
	public void setRight(Node _right) {
		right = _right;
	}


}
