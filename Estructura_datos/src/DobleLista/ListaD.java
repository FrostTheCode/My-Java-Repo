package DobleLista;

import javax.swing.JOptionPane;

public class ListaD {
	private nodoD in,fi;
	public ListaD()
	{
		in=fi=null;
	}
	public boolean estaVacia()
	{
		return in==null;
	}
	public void agFin(int el)
	{
		if (!estaVacia())
		{
			fi=new nodoD(el,null,fi);
			fi.ant.sig=fi;
		}
		else
			in=fi=new nodoD(el, null, null);
	}
	public void agInicio(int el)
	{
		if(!estaVacia())
		{
			in=new nodoD(el,in,null);
			in.sig.ant=in;
		}
		in=fi=new nodoD(el,null,null);
	}
	public void MostLisInFin()
	{
		if(!estaVacia())
		{
			String dat="<=>";
			nodoD aux=in;
			while(aux!=null)
			{
				dat=dat+"["+aux.dato+"]<=>";
				aux=aux.sig;
			}
			JOptionPane.showMessageDialog(null, "mostrar lista de inicio al fin","",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public void MostLisFinIn()
	{
		if(!estaVacia())
		{
			String dat="<=>";
			nodoD aux=fi;
			while(aux!=null)
			{
				dat=dat+"["+aux.dato+"]<=>";
				aux=aux.sig;
			}
			JOptionPane.showMessageDialog(null, "mostrar lista de fin al inicio","",JOptionPane.INFORMATION_MESSAGE);
		}

	}
	
	public int EliIn()
	{
		int el=fi.dato;
		if(in==fi)
			in=fi=null;
		else
		{
			in=in.sig;
			in.ant=null;
		}
		return el;
	}
	public int EliFin()
	{
		int el=fi.dato;
		if(in==fi)
			in=fi=null;
		else {
			fi=fi.ant;
			fi.sig=null;}
		return el;
	}
	
}