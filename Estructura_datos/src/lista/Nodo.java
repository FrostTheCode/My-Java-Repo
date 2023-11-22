package lista;

public class Nodo {
	public int dat;
	public Nodo si;
	public Nodo(int d)
	{
		this.dat=d;
	}
	public Nodo (int d,Nodo n)
	{
		dat=d;
		si=n;
	}

}
