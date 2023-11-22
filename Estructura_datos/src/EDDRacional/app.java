package EDDRacional;

public class app {

	public static void main(String[] args) {
		 Racional r=new Racional();
		 System.out.println("racional 1: "+r);
		 Racional r2=new Racional(4,3, 7, 5);
		 System.out.println("racional 2: "+r2);
		  r.setNum(5);
		  r.setDen(3);
		  System.out.println("racional 1: "+r);
		  Racional r3=new Racional();
		  r3.suma(r, r2);
			 System.out.println("suma: "+r3);
			 r3.resta(r, r2);
			 System.out.println("resta: "+r3);
			 r3.multi(r, r2);
			 System.out.println("multiplicacion: "+r3);
			 r3.divi(r, r2);
			 System.out.println("Divicion: "+r3);
			 simp s=new simp();
			 
	}
}

