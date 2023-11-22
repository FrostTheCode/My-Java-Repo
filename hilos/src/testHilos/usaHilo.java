package testHilos;

public class usaHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hilo h1=new hilo();
		Thread t1=new Thread(h1,"marco");
		t1.start();
		System.out.println("");
	}

}
