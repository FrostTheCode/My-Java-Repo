import java.util.PriorityQueue;
import java.util.Queue;

public class appQueue {

	public static void main(String[] args) {
		Queue<String> c=new PriorityQueue<>();
		c.offer("1.-MitoCode");
		c.offer("2.-code");
		c.offer("3.-mito");
		c.offer("4.-jaime");
		
		while (!c.isEmpty())
			System.out.println("Atendiendo a "+c.poll());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
