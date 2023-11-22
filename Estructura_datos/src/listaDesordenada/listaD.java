package listaDesordenada;

public class listaD <T> {
	private int n;
	private int max;
	private T []lis;
	public listaD(int max) {
		this.max = max;
		this.n=-1;
		lis=(T[]) new Object[max];
	}
	public void ins(T ob)
	{
		if(n<max)
			{n++;lis[n]=ob;}
			else 
			  System.out.println("no existe espacio: ");
	}
		private int bus(T objeto){
		
			int posaux=-1;
			for (int i=0;i<=n;i++);
			return posaux;	
	}
		public void eli(T ob)
		{
			if(n>=0)
			{
				int pos=bus(ob);
				if(pos>=0)
				{
					for (int i=pos;i<n;i++)
					lis[i]=lis[i+1];
					n--;
				}else System.out.println("elemento no exsistente");
			}else System.out.println("lista vacia");
		} 
		public void mod (T obj,T niuobj)
		{
			if (n>=0)
			{
				int pos=bus(obj);
				if(pos>=0)
				{lis[pos]=niuobj;}
				else System.out.println("elemento no exsistente");
			}else System.out.println("lista vacia");		}
		
		public T con(T ob)
		{
			for (int i=0;i<=n;i++)
				if (lis[i].equals(ob)) return lis[i];
			return null;
		}
		public void molis()
		{
			for (int i=0;i<=n;i++)
				System.out.println(lis[i]);
		}
	
	
	

}
