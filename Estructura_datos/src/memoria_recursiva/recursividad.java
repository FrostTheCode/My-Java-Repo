package memoria_recursiva;

public class recursividad {
	public void imp(int x)
	{
		if(x<=5)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(x+" ");
			imp(x+1);
		}
}
}
