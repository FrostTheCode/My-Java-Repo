package ArbolesBinarios;

import java.util.Stack;

public class ayuda {
	public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }
 
    // Imprime la expresi�n de sufijo para un �rbol de expresi�n
    public static void postorder(Node root)
    {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
 
    // Imprime la expresi�n infija para un �rbol de expresi�n
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }
 
        // si el token actual es un operador, imprime un par�ntesis abierto
        if (isOperator(root.data)) {
            System.out.print("(");
        }
 
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
 
        // si el token actual es un operador, imprime cerrar par�ntesis
        if (isOperator(root.data)) {
            System.out.print(")");
        }
    }
 
    // Funci�n para construir un �rbol de expresi�n a partir de la expresi�n sufijo dada
    public static Node construct(String postfix)
    {
        // caso base
        if (postfix == null || postfix.length() == 0) {
            return null;
        }
 
        // crea una stack vac�a para almacenar punteros de �rbol
        Stack<Node> s = new Stack<>();
 
        // recorrer la expresi�n de sufijo
        for (char c: postfix.toCharArray())
        {
            // si el token actual es un operador
            if (isOperator(c))
            {
                // extrae dos nodos `x` e `y` de la stack
                Node x = s.pop();
                Node y = s.pop();
 
                // construye un nuevo �rbol binario cuya ra�z es el operador y cuyo
                // los ni�os izquierdo y derecho apuntan a `y` y `x`, respectivamente
                Node node = new Node(c, y, x);
 
                // inserta el nodo actual en la stack
                s.add(node);
            }
            // si el token actual es un operando, crea un nuevo nodo de �rbol binario
            // cuya ra�z es el operando y lo empuja a la stack
            else {
                s.add(new Node(c));
            }
        }
 
        // un puntero a la ra�z del �rbol de expresi�n permanece en la stack
        return s.peek();
    }
}
