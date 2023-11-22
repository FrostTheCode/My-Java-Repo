package lista;

public class Simpl {
	protected Nodo in,fin;
	public Simpl()
	{
		in=null;
		fin=null;
	}
	public void agIn(int elemento)
	{
		in=new Nodo(elemento,in);
		if(fin==null)
		fin=in;
	}
	public void moslis()
	{
		Nodo rec=in;
		while (rec!=null)
		{
			System.out.println("["+rec.dat+"]---->");
			rec=rec.si;
		}
	}
	public int borrIn()
	{
		int ele=in.dat;
		if(in==fin) {
			in=null;
		fin=null;}
		else
			in=in.si;
		return ele;
	}
	public int borrFin()
	{
		int ele=fin.dat;
		if (in==fin)
			in=fin=null;
		else 
		{Nodo temporal=in;
		while (temporal.si!=fin) {
			temporal=temporal.si;
		}
			fin=temporal;
			fin.si=null;
		}
		return ele;
		}
	public void eliminar(int elem)
	{
		if(!estaVacia())
		{
			if(in==fin&&elem==in.dat)
				in=fin=null;
		}else if(elem==in.dat)
			in=in.si;
		else
		{
			Nodo anterior,temporal;
			anterior=in;
			temporal=in.si;
			while(temporal!=null&&temporal.dat!=elem)
			{
				anterior=anterior.si;
				temporal=temporal.si;
			}
			if(temporal!=null){
				anterior.si=temporal;
			if(temporal==fin)	
				fin=anterior;
			}	
		}
	}
	
	
	
	
	private boolean estaVacia() {
		// TODO Auto-generated method stub
		return false;
	}
	
	}


