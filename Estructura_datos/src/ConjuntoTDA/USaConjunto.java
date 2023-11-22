package ConjuntoTDA;

public class USaConjunto {

	public static void main(String[] args) {
		TDAConjunto a,b,c,d,e,f,j;
		a=new TDAConjunto(2,4,6,8,10);
		b=new TDAConjunto(8,3,1,6);
		System.out.println("A="+a);
		System.out.println("B="+b);
		c=a.union(a, b);
		d=a.inter(a, b);
	    e=a.diferencia(a, b);
	    f=a.DifSim(a, b);
		System.out.println("AUB "+c);
		System.out.println("AinterB "+d);
		System.out.println("AdB "+e);
		System.out.println("ADSB "+f);
		

	}

}
