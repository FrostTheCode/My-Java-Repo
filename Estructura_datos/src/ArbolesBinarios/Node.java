package ArbolesBinarios;

public class Node {
	
	 char data;
	    Node left, right;
	 
	    Node(char data)
	    {
	        this.data = data;
	        this.left = this.right = null;
	    }
	 
	    Node(char data, Node left, Node right)
	    {
	        this.data = data;
	        this.left = left;
	        this.right = right;
	    }

}
