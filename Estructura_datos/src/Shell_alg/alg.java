package Shell_alg;

public class alg {
	int i,j,temp,pas;
	
	public alg()
	{
		this.i=0;
		this.j=0;
		this.temp=0;
	}
	
	public void burbu(int[] ar)
	{
		pas=0;
		for (i=0;1<ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if (ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				pas++;
			}
		}//fin del for
		System.out.println("termino en "+pas+" pasadas ");
	}//fin de burbu
	
	public void burbu2(int[] ar)
	{
		pas=0;
		for (i=1; i<ar.length;i++)
		{
			for (j=0; j<ar.length-1;j++)
			{
				if (ar[j]>ar[i])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
				pas++;
			}
		}//fin del for
		System.out.println("termino en "+pas+" pasadas ");
	}//fin burbu
	
	public void radi (int[] ar)
	{
		int x,i,j;
		for (x=Integer.SIZE-1;x>=0;x--)
		{
			int aux[]=new int [ar.length];
			j=0;
			for (i=0;i<ar.length;i++)
			{
				boolean mo=ar[i] <<x>=0;
				if (x==0? !mo:mo)
				{
					aux[j]=ar[i];
					j++;
				}else {
					ar[i-j]=ar[i];
				}
				
			}
			for (i=j;i<aux.length;i++) {
			aux[i]=ar[i-j];
			}
			ar=aux;
		}
		System.out.println("El arreglo ordenado con radix es: ");
		mosAr(ar);
	}//fin del radix
	
	public void quick(int []ar, int pri,int ult)
	{
		int i,j,piv,aux;
		i=pri;
		j=ult;
		piv=ar[(pri+ult)/2];
		System.out.println("El pivote es: "+piv);
		do {
			while (ar[i]<piv)
			{
				i++;
			}
			while (ar[j]>piv)
			{
				j--;
			}
			if(i<=j)
			{
				aux=ar[i];
				ar[i]=ar[j];
				ar[j]=aux;
				i++;
				j--;
			}
		}while (i<=j);
		if(pri<j)
		{
			quick(ar,pri,j);
		}
		if(i<ult)
		{
			quick(ar,i,ult);
		}
		mosAr(ar);
	}
	
	public void ins(int[] ar,int n)
	{
		int i,j,aux;
		for(i=1;i<n;i++)
		{
			aux=ar[i];
			j=i-1;
			while (j>=0&&ar[j]>aux)
			{
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=aux;
		}
		System.out.println("Arreglo Ordenado por Insercion");
		mosAr(ar);
	}
	
	public void shell(int[] ar)
	{
		int sal,i,j,k,aux;
		sal=ar.length/2;
		while (sal>0)
		{
			for(i=sal;i<ar.length;i++)
			{
				j=i-sal;
				while(j>=0)
				{
					k=j+sal;
					if(ar[j]<=ar[k])
					{
						j=-1;
					}else {
						aux=ar[j];
						ar[j]=ar[k];
						ar[k]=aux;
						j-=sal;
					}
				}
			}
			sal=sal/2;
		}
		System.out.println("Arreglo Ordenado con Shell");
		mosAr(ar);
	}
	public void quic (int [] ar,int pi,int ul){
	{
		int i,j,piv,aux;
		i=pi;
		j=ul;
		piv=ar[(pi+ul)/2];
		do{
			while(ar[i]<piv){
				i++;
			}
			while(ar[j]>piv) {
				j--;
			}
			if(i<=j) {
				aux=ar[i];
				ar[i]=ar[j];
				ar[j]=aux;
				i++;
				j--;
			}
			
		}while(i<=j);
		if(pi<j)
			quick(ar,pi,j);
		if(i<ul)
			quick(ar,i,ul);
		mosAr(ar);
	}
	}
	
	public void insercion(int [] ar,int n)
	{
		int i,j,aux;
		for (i=1;i<n;i++)
		{
			aux=ar[i];
			j=i-1;
			while (j>=0 && ar[j]>aux)
			{
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=aux;
		}
		System.out.println("arreglo ordenado por insercion");
		mosAr(ar);
	}
	public void intercalacion(int[] ar1,int[] ar2)
	{
		int i,j,k;
		int ar3[] = new int [ar1.length+ar2.length];
		for (i=j=k=0;i<ar1.length && j<ar2.length;k++)
		{
			if (ar1[i]<ar2[j])
			{
				ar3[k]=ar1[i];
				i++;
			}else {
				ar3[k]=ar2[j];
				j++;
			}
		}
		for (;i<ar1.length;i++,k++)
		{
			ar3[k]=ar1[i];
		}
		for (;j<ar2.length;j++,k++)
		{
			ar3[k]=ar2[j];
		}
		mosAr(ar3);
	}
	
	public int[] mezclad(int[]ar)
	{
		int i,j,k;
		if(ar.length>1)
		{
			int nei = ar.length/2;
			int ned = ar.length-nei;
			int ari[] = new int [nei];
			int ard[] = new int [ned];
			//copiar los elementos de parte primera al arreglo izq
			for(i=0;i<nei;i++)
				ari[i]= ar[i];
			//copiando los elementos de parte segunda al arreglo derecho
			for(i=nei;i<nei+ned;i++)
				ard[i-nei]=ar[i];
			//recursividad
			ari=mezclad(ari);
			ard=mezclad(ard);
			i=0;
			j=0;
			k=0;
			while (ari.length!=j&&ard.length!=k);
			{
				if(ari[j]<ard[k])
				{
					ar[i]=ari[j];
					i++;
					j++;
				}else {
					ar[i]=ard[k];
					i++;
					k++;
				}
			}
			//arreglo final 
			while (ari.length!=j)
			{
				ar[i]=ari[j];
				i++;
				j++;
			}
			while (ard.length!=k)
			{
				ar[i]=ard[k];
				i++;
				k++;
			}
		}
		return ar;
	}
	
	public void mezclan(int ar[])
	{
		int iz=0, izq=0, de= ar.length-1, der=de;
		boolean or=false;
		do {
			or=true;
			iz=0;
			while (iz<de) {
				izq=iz;
			while (iz<de && ar[izq]<=ar[izq+1]) {
				izq++;
			}
			der=izq+1;
			while (der==de-1 || der<de && ar[der]<=ar[der+1]);{
			der++;
			}
			if(der<=de)
			{
				mezclan(ar);
				or=false;
			}
			iz=izq;
			}
		}while (!or);
	}
	
	public int bussec (int ar[], int el)
	{
		int i;
		boolean enc=false;
		for (i=0;i<ar.length && enc == false;i++)
		{
			if (el == ar[i]) {
				enc=true;
				return i;
			}
		}
		return -1;
	}
	
	public int BusBin(int ar[],int el) {
		int ce,pri,ult,vc;
		pri=0;
		ult=ar.length-1;
		while (pri<=ult) {
			ce=(pri+ult)/2;
			vc=ar[ce];
			System.out.println("Comparando a "+el+" con "+ar[ce]);
			if (el==vc)
				return ce;
			else if (el<vc)
				ult=ce-1;
			else
				pri=ce+1;
		}
		return -1;
	}
	
	public void mosAr(int[] ar)
	{
		int k;
		for(k=0;k<ar.length;k++)
		{
			System.out.print("["+ar[k]+"]");
		}
		System.out.println();
	}
}