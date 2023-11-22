package ListaOrdenada;
import javax.swing.JOptionPane;
public class ListaOrd<T extends Comparable<T>> //generico
{
	private T[]l;
	private int n;
	private int max;
	//constructor
	public ListaOrd(int max) {
		l=(T[]) new Comparable [max];
		n=-1;this.max=max;
	}
	//operaciones basicas 
	//busquedas secuencial ordenada
	public int bus(T valor) {
		int pos=-1;
		for (int i=0;i<=n;i++) 
		if (l[i].compareTo(valor)>=0) {pos=i;break;}
		return pos;
	}
	public void in(T valor) {
		if(n<max)
		{
			int posaux=bus(valor);n++;
			if (posaux>=0)
			{
				for (int i=n;i>posaux;i--)
					l[i]=l[i-1];
				l[posaux]=valor;
			}else	l[n]=valor;
			}else JOptionPane.showMessageDialog(null, "no existe espacios disponibles");
		}
	public void eli(T valor)
	{
	if (n>=0)
	{
		int posaux=bus(valor);
		if(posaux>=0&&l[posaux].equals(valor))
		{
			for (int i=posaux;i<n;i++)
				l[i]=l[i+1];
			n=n-1;
		}else JOptionPane.showMessageDialog(null, "objeto no existente en la lista");
	}else JOptionPane.showMessageDialog(null, "la lista esta vacia");
	}
	public T con(T valor)
	{
		T aux=null;
		if (n>=0)
		{
			int posaux=bus(valor);
			if (posaux>=0 && l[posaux].equals(valor)) aux=l[posaux];
			else JOptionPane.showMessageDialog(null, "objeto no existente");
		}else JOptionPane.showMessageDialog(null, "la lista esta vacia");
	return aux;
	}
	public String lr()
	{
		String sal="";
		for (int i=0;i<=n;i++)
			sal=sal+l[i]+"\n";
		return sal;
	}
}
