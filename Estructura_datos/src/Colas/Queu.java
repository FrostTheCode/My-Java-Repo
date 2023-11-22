package Colas;
import java.util.LinkedList;
import java.util.Queue;
public class Queu {

	public static void main(String[] args) {
		Queue<Integer> c=new LinkedList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		System.out.println("El inicio de la cola es "+c.peek());
		int ta=c.size();
		System.out.println("Vaciando la cola");
		c.clear();
		while (!c.isEmpty())
		{
			System.out.println("Despachando al elemento "+c.remove());
		}

	}

}
