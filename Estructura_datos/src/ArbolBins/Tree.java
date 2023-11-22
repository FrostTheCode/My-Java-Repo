package ArbolBins;

public class Tree {
	private nodoB raiz;
	public Tree()
	{
		raiz=null;
	}
	public nodoB bus(int d, nodoB r)
	{
		if (raiz==null)
		{
			return null;
		}
		else if (r.dato==d)
		{
			return r;
		}
		else if(r.dato<d)
		{
			return bus(d,r.hd);
		}
		else return bus(d,r.hi);
	}
	public int obt(nodoB x)
	{
		if(x==null)
		return -1;
		else
			return x.fe;
	}
	
	public nodoB rotiz(nodoB c)
	{
		nodoB aux=c.hi;
		c.hi=aux.hd;
		aux.hd=c;
		c.fe=Math.max(obt(c.hi), obt(c.hd))+1;
		aux.fe=Math.max(obt(aux.hi), obt(aux.hd))+1;
		return aux;
	}
	
	public nodoB rotde(nodoB c)
	{
		nodoB aux=c.hd;
		c.hd=aux.hi;
		aux.hi=c;
		c.fe=Math.max(obt(c.hi), obt(c.hd))+1;
		aux.fe=Math.max(obt(aux.hi), obt(aux.hd))+1;
		return aux;
	}
	
	public nodoB rotdobiz(nodoB c)
	{
		nodoB tem;
		c.hi=rotde(c.hi);
		tem=rotiz(c);
		return tem;
	}
	
	public nodoB rotdobde(nodoB c)
	{
		nodoB tem;
		c.hd=rotiz(c.hd);
		tem=rotde(c);
		return tem;
	}
	
	public nodoB ins(nodoB niu, nodoB subar)
	{
		nodoB niuP=subar;
		if(niu.dato<subar.dato)
		{
			if(subar.hi==null)
			subar.hi=niu;
		}
		else 
		{
			subar.hi=ins(niu,subar.hi);
			if(obt(subar.hi)-obt(subar.hd)==2)
			{
				if(niu.dato<subar.hi.dato)
					niuP=rotdobiz(subar);
				else 
					niuP=rotdobiz(subar);
			}
			else if (niu.dato>subar.dato)
			{
				if(subar.hd==null)
					subar.hd=niu;
				else 
					subar.hd=ins(niu,subar.hd);
				if (obt(subar.hd)-obt(subar.hi)==2)
				{
					if(niu.dato>subar.hd.dato)
						niuP=rotde(subar);
					else 
						niuP=rotdobde(subar);
				}
			}
			else 
				System.out.println("nodo duplicado");
			if((subar.hi==null)&&(subar.hd!=null))
			subar.fe=subar.hd.fe+1;
			else if((subar.hd==null)&&(subar.hi!=null))
				subar.fe=subar.hi.fe+1;
			else
				subar.fe=Math.max(obt(subar.hi),obt(subar.hd))+1;
           
		} 
		return niuP;
	}
	
	public void inse(int d)
	{
		nodoB niu=new nodoB (d);
		if(raiz==null)
			raiz=niu;
		else 
			raiz=ins(niu,raiz);
	}
	
	public void preor(nodoB r)
	{
		if (r!=null)
		{
			System.out.println(r.dato+" , ");
			preor(r.hi);
			preor(r.hd);
		}
	}
	public nodoB obtra()
	{
		return raiz;
	}
}
