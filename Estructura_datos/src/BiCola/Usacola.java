package BiCola;
import java.util.Scanner;
public class Usacola {

	public static void main(String[] args) {
		Bicolas<Pac> colaH=new Bicolas<Pac>(10);
		int opc;
		Scanner in=new Scanner(System.in);
		Pac pacx;
		do 
		{
			System.out.println("1.-Inserta por final ");
			System.out.println("2.-Inserta por frente ");
			System.out.println("3.-elimina por frente ");
			System.out.println("4.-elimina por final ");
			System.out.println("5.-Mostrar cola ");
			System.out.println("6.-Ver Estructura del Arreglo ");
			System.out.println("7.-salir ");
			System.out.println("Teclea la opcion deseada ");opc=in.nextInt();
			
			switch (opc)
			{
			case 1: pacx=new Pac();
					pacx.pDat();
					colaH.inFin(pacx);
					if(colaH.errorx) System.out.println(colaH.mser);break;
			case 2: pacx=new Pac();
					pacx.pDat();
					colaH.inFre(pacx);
					if(colaH.errorx) System.out.println(colaH.mser);
			case 3: pacx=colaH.eliFre();
					if (colaH.errorx) System.out.println(colaH.mser);
					else System.out.println("Se atendio a: "+pacx);
					break;
			case 4:	pacx=colaH.eliFin();
					if (colaH.errorx) System.out.println(colaH.mser);
					else System.out.println("Se atendio a: "+pacx);
					break;
			case 5: colaH.mosCola();break;
			case 6: colaH.verEst();break;
			case 7: System.exit(0);break;
			default: System.out.println("opcion no valida");break;
			
					
			}
			
		}while (opc!=7);

	}

}
