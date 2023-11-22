package ListaCirculares;

import javax.swing.JOptionPane;

public class listaC {
	nodoC ul;
	public listaC()
	{
		ul=null;
	}
	public boolean esVacio()
	{
		return ul==null;
	}
	public listaC in(int el)
	{
		nodoC nu=new nodoC(el);
		if(ul!=null)
		{
			nu.sig=ul.sig;
			ul.sig=nu;
		}
		ul=nu;
		return this;
	}
	public void mosLis()
	{
		nodoC aux=ul.sig;
		String ca="";
		do {
		ca=ca+"["+aux.sig+"]->";
		aux=aux.sig;
		}while(aux!=ul.sig);
		JOptionPane.showMessageDialog(null, ca ,"Mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
	}
	public boolean elimi(int el)
	{
		nodoC ac;
		boolean enc=false;
		ac=ul;
		while (ac.sig!=ul&&!enc)
		{
			enc=(ac.sig.dat==el);
		if (!enc)
		ac=ac.sig;
		}	
		enc=(ac.sig.dat==el);
		if(enc)
		{
			nodoC aux=ac.sig;
			if(ul==ul.sig)
			ul=null;
			else
			{
				if(aux==ul)
					ul=ac;
				ac.sig=aux.sig;
			}
			aux=null;
		}
		return enc==true;
	}

}
