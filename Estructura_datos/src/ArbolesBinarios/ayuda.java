package ArbolesBinarios;

import java.util.Stack;

public class ayuda {
	public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }
 
    // Imprime la expresión de sufijo para un árbol de expresión
    public static void postorder(Node root)
    {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
 
    // Imprime la expresión infija para un árbol de expresión
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }
 
        // si el token actual es un operador, imprime un paréntesis abierto
        if (isOperator(root.data)) {
            System.out.print("(");
        }
 
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
 
        // si el token actual es un operador, imprime cerrar paréntesis
        if (isOperator(root.data)) {
            System.out.print(")");
        }
    }
 
    // Función para construir un árbol de expresión a partir de la expresión sufijo dada
    public static Node construct(String postfix)
    {
        // caso base
        if (postfix == null || postfix.length() == 0) {
            return null;
        }
 
        // crea una stack vacía para almacenar punteros de árbol
        Stack<Node> s = new Stack<>();
 
        // recorrer la expresión de sufijo
        for (char c: postfix.toCharArray())
        {
            // si el token actual es un operador
            if (isOperator(c))
            {
                // extrae dos nodos `x` e `y` de la stack
                Node x = s.pop();
                Node y = s.pop();
 
                // construye un nuevo árbol binario cuya raíz es el operador y cuyo
                // los niños izquierdo y derecho apuntan a `y` y `x`, respectivamente
                Node node = new Node(c, y, x);
 
                // inserta el nodo actual en la stack
                s.add(node);
            }
            // si el token actual es un operando, crea un nuevo nodo de árbol binario
            // cuya raíz es el operando y lo empuja a la stack
            else {
                s.add(new Node(c));
            }
        }
 
        // un puntero a la raíz del árbol de expresión permanece en la stack
        return s.peek();
    }
}
