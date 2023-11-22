package ConjuntoTDA;

public class TDAConjunto {
	//TDA conjunto

	//estructura de datos
	private int lista[];//arreglo pa los datos
	private int nele;// variable para indicar el numero de elementos
	//constructor
	public TDAConjunto() {
		//inicializa las estructuras de datos en sus valores por defecto
		lista=new int[50];
		nele=0;//creando el conjunto vacio
	}
	//constructor sobrecargado
	public TDAConjunto(int ... elementos) //parametros variables
	{
		this();//invocar al constructor
		//agregar los elementos al conjunto
		for(int valor:elementos)
		{
			agregar(this,valor);
		}
	}
	//metodos segun especificado
	public TDAConjunto conjvac()
	{
		return new TDAConjunto();
	}
	//clase auxiliar para verificar o buscar si el elemento ya existe en el conjunto
	//regresa -1 si no lo encuentra o la posicion donde debe ir
	private int buscar(TDAConjunto c,int valor)
	{
		int pos=-1;//asume q no existe
		for (int i=0;i<nele;i++)
		{
			if(lista[i]>=valor)
			{pos=i;break;}
			}
		return pos;	
	}
	//agregar o insertar en el arreglo el valor de forma ordenada asendente
	public TDAConjunto agregar(TDAConjunto c,int valox)
	{
		int pos=buscar(c,valox);
		if(pos==-1)//el elemento va al final del arreglo
		{
			c.nele++;
			c.lista[nele-1]=valox;
		}
		else if(c.lista[pos]!=valox)//elemento no existe
		{
			c.nele++;
			//recorrer una posicion dentro del arreglo unidimencional a la derecha, los valores para dejar libre la casilla para el valor
			for(int i=c.nele-1;i>pos;i--)
			{
				c.lista[i]=c.lista[i-1];
				c.lista[pos]=valox;
			}
			
		}
	return c;
	}
//borrar un elemento del conjunto
	public TDAConjunto borrar(TDAConjunto c,int valox)
	{
		int pos=buscar(c,valox);
				if (pos>=0)//verificar si encontro el valor
				{
					if (c.lista[pos]==valox)//verifica si el valor existe
						//recorrer los elementos despues de la posicion hacia la izquierda
						for (int i=0;i<=nele;i++)
							c.lista[i]=c.lista[i+1];
						
						c.nele--;//se reduce el numero de elementos del conjunto
				}
					return c;
	}
	//sources, overrwright to string
	@Override
	public String toString() {
		String ex="{";
		for (int i=0;i<nele;i++)
		{
			ex=ex+lista[i]+",";
		}
		ex=ex+"}";
		return ex;
	}
	
	public boolean esvacio(TDAConjunto c)
	{
		if(c.nele==0) return true;
		else return false;
	}
	
	public boolean pertenece(TDAConjunto c, int valoz)
	{
		boolean exi=false;
		for (int i=0;i<=c.nele;i++)
		if (c.lista[i]==valoz)
			{exi=true;break;}
		return exi;	
	}
	public boolean igual(TDAConjunto a,TDAConjunto b)
	{
		boolean same=false;
		int m=0;
		for (int i=0;i<=a.nele;i++) {
			if (a.lista[i]==b.lista[i])
				m++;}
		if (m==a.lista.length)
			same=true;
		return same;
	}
	public boolean incluido(TDAConjunto a,TDAConjunto b)
	{
		boolean sip=false;
		int k=a.lista.length+b.lista.length;
		if (a.lista.length==k)
			sip=true;
		return sip;
	}
	public int Cardinal(TDAConjunto c)
	{
		int k=0;
		for (int i=0;i<=c.nele;i++)
			k++;
		return k;
	}
	//operacion de union
	public TDAConjunto union (TDAConjunto a,TDAConjunto b)
	{
		TDAConjunto c= new TDAConjunto();//conjunto vacio
		for (int i=0;i<=a.nele;i++)
			c.agregar(c, a.lista[i]);
		for (int i=0;i<=b.nele;i++)
			c.agregar(c, b.lista[i]);
		return c;
	}
	//operacion de interseccion
	public TDAConjunto inter(TDAConjunto a,TDAConjunto b)
	{
		TDAConjunto c= new TDAConjunto();//conjunto vacio
		for (int i=0;i<=a.nele;i++)
			if (b.pertenece(b, a.lista[i]))c.agregar(c, a.lista[i]);
		return c;
			
	}
	public TDAConjunto diferencia(TDAConjunto a,TDAConjunto b)
	{
		TDAConjunto c= new TDAConjunto();//conjunto vacio
		for (int i=0;i<=a.nele;i++)
		if (b.lista[i]!=a.lista[i])
			c.agregar(c, b.lista[i]);
		for (int i=0;i<=b.nele;i++)
			if (a.lista[i]!=b.lista[i])
				c.agregar(c, a.lista[i]);
		return c;
	}
	public TDAConjunto DifSim(TDAConjunto a,TDAConjunto b)
	{
		TDAConjunto c= new TDAConjunto();//conjunto vacio
		for (int i=0;i<=a.nele;i++)
			if (b.lista[i]!=a.lista[i])
				c.agregar(c, b.lista[i]);
			for (int i=0;i<=b.nele;i++)
				if (a.lista[i]!=b.lista[i])
					c.agregar(c, a.lista[i]);
			for (int i=0;i<=b.nele;i++)
				if (a.lista[i]!=c.lista[i])
					c.agregar(c, c.lista[i]);
			
			return c;
	}
}
