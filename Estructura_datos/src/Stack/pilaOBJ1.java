package Stack;

public class pilaOBJ1 {
	private String name;
	private int cod,sto;
	
	public pilaOBJ1 (String n,int co,int s)
	{
		name=n;
		cod=co;
		sto=s;
	}
	public int getStock()
	{
		return sto;
	}
	public void mos()
	{
		System.out.println("Nombre: "+name+"\nCodigo: "+cod+"\nStock: "+sto);
	}
	
	

}
