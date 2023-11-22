package ArbolesBinarios;

public class ArbolBin {
	nodoA raiz;
	public ArbolBin()
	{
		raiz=null;
	}
	public void agNodo(int d)
	{
		nodoA nu=new nodoA (d);
		if(raiz==null)
			raiz=nu;
		else
		{
			nodoA aux=raiz;
			nodoA padre;
			while (true)
			{
				padre=aux;
				if(d<aux.dat) {
					aux=aux.hiji;
				if(aux==null) {
					padre.hiji=nu;
				return;
				}
				}else{
					aux=aux.hijd;
					if(aux==null)
					{
						padre.hijd=nu;
						return;
					}
				}
			}
			
		}
			
	}
	public boolean esVacio()
	{
		return raiz==null;
	}
	public void inOrden(nodoA r)
	{
		if (r!=null)
		{
			inOrden(r.hiji);
			System.out.print(r.dat+", ");
			inOrden(r.hijd);
		}
	}
	public void preOrden(nodoA r)
	{
		if(r!=null)
		{
			System.out.print(r.dat+", ");
			preOrden(r.hiji);
			preOrden(r.hijd);
		}
	}
	public void postOrden(nodoA r)
	{
		if(r!=null)
		{
			postOrden(r.hiji);
			postOrden(r.hijd);
			System.out.print(r.dat+", ");
		}
	}
	
	int alturamax(nodoA nodo){
        int izqP;
        int derP;
        if(nodo == null){
            return 0;
        }else{
            izqP=alturamax(nodo.hiji);
            derP=alturamax(nodo.hijd);
        }
        if (izqP > derP)
        {
          return izqP+1;  
        }else{
            return derP+1;
        }
       
    }
	
	public nodoA busNodo(int d)
	{
		nodoA aux=raiz;
		while(aux.dat!=d)
		{
			if (d<aux.dat)
				aux=aux.hiji;
			else
				aux=aux.hijd;
			if(aux==null)
				return null;
		}//fin de while
		return aux;
	}
	

    public boolean eliminar(int d){
        nodoA aux=raiz;
        nodoA padre=raiz;
        boolean esHijoIzq=true;
        while(aux.dat!=d){
            padre=aux;
            if(d<aux.dat){
                esHijoIzq=true;
                aux=aux.hiji;
            }else{
                esHijoIzq=false;
                aux=aux.hijd;
            }
            if(aux==null){
                return false;
            }
        }//fin del while
        if(aux.hiji==null && aux.hijd==null){
            if(aux==raiz){
                raiz=null;
            }else if(esHijoIzq){
                padre.hiji=null;
            }else{
                padre.hijd=null;
            }
        }else if(aux.hijd==null){
          if(aux==raiz){
                raiz=aux.hiji;
            }else if(esHijoIzq){
                padre.hiji=aux.hiji;
            }else{
                padre.hijd=aux.hiji;
            }  
        }else if(aux.hiji==null){
            if(aux==raiz){
                raiz=aux.hijd;
            }else if(esHijoIzq){
                padre.hiji=aux.hijd;
            }else{
                padre.hijd=aux.hijd;
            }
        }else{
            nodoA remp=obtenerNodoReemplazo(aux);
            if(aux==raiz){
                raiz=remp;
            }else if(esHijoIzq){
                padre.hiji=remp;
            }else{
                padre.hijd=remp;
            }
            remp.hiji=aux.hiji;
        }
        return true;
    }
        
    //metodo para devolver el nodo remplazo
    public nodoA obtenerNodoReemplazo(nodoA nodoR){
        nodoA reemplazarPadre=nodoR;
        nodoA reemplazo=nodoR;
        nodoA aux=nodoR.hijd;
        while(aux!=null){
            reemplazarPadre=reemplazo;
            reemplazo=aux;
            aux=aux.hiji;
        }
        if(reemplazo!=nodoR.hijd){
            reemplazarPadre.hiji=reemplazo.hijd;
            reemplazo.hijd=nodoR.hijd;
        }
        System.out.println("El nodo Reemplazo es "+reemplazo);
        return reemplazo;
    }
	
}
