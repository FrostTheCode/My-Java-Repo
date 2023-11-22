package backtracking;

public class TorreHanoi {

	public static void main(String[] args) {
		TorreHanoi th=new TorreHanoi();
		th.torre(64, 1, 2, 3);
		System.out.println("game over");
	}
	public static void torre(int dis,int tor1,int tor2, int tor3)
	{
		if(dis==1)
		{
			System.out.println("mover disco de torre "+tor1+" a torre "+tor3);
		}
		else {
			torre(dis-1,tor1,tor2,tor3);
		System.out.println("mover el disco de torre "+tor1+" a torre "+tor2);
		torre(dis-1,tor2,tor1,tor3);
		}

	}
	

}
