package BiCola;

public class Bicolas <T>{
	private int fre,fin;
	private int max;
	public boolean errorx;
	public String mser;
	private T[] ar;
	
	public Bicolas(int max)
	{
		ar=(T[]) new Object[max];
		this.max=max-1;
		fre=-1;fin=-1;//indica que la cola esta vacia
	}
	
	public void inFin(T objins)
	{
		errorx=false;
		if(((fin==max)&&(fre==0))||(fin+1==fre))
			{errorx=true;mser="cola llena";}
			else 
			{
				if(fin==max) fin=0;
				else fin++;
				ar[fin]=objins;
				if(fre==-1) fre=0;
		}		
	}
	public void inFre(T objins)
	{
		errorx=false;
		if (((fin==max)&&(fre==0))||(fin+1==fre))
		{errorx=true;mser="cola llena";}
		else
		{
			if (fre==0) fre=max;
			else if (fre==0) fre=max;
			else fre--;
			ar[fre]=objins;
		}	
	}
	public T eliFre()
	{
		errorx=false;
		T aux;
		if (fre>=0)
		{
			aux=ar[fre];
			ar[fre]=null;
		
		if (fre==fin)
		{fre=-1;fin=-1;}
		else if (fre==max) fre=0;
		else fre++;
		return aux;
		}
		else {errorx=true;mser="cola vacia";return null;}
	}
	public T eliFin()
	{
		errorx=false;
		T aux;
		if (fre>=0)
		{
			aux=ar[fin];
			ar[fin]=null;
		
		if (fre==fin)
		{fre=-1;fin=-1;}
		else if (fre==max) fin=max;
		else fin--;
		return aux;
		}
		else {errorx=true;mser="cola vacia";return null;}
	}
	public void mosCola()
	{
		int i;
		if (fin<fre)
		{
			for (i=fre;i<=max;i++)
			System.out.println(ar[i]+"\n");
			for (i=0;i<=fin;i++)
				System.out.println(ar[i]+"\n");
		}
		else 
			for (i=fre;i<=fin;i++)
				System.out.println(ar[i]+"\n");
	}
	public void verEst()
	{
		int i;
		for (i=0;i<=max;i++)
			if (ar[i]==null) System.out.println("vacio");
			else System.out.println(ar[i]);
		System.out.println("frente"+fre+", final="+fin);
	}
}