package LasPilas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		int tam,opc;
		String dato;
		Scanner tec=new Scanner(System.in);
		System.out.println("elija el tamano de de la pila");
		tam=tec.nextInt();
		pila p=new pila (tam);
		do {
			System.out.println("1.-agrega comida");
			System.out.println("2.-elimina comida");
			System.out.println("3.-muestra la comida");
			System.out.println("4.-busca una comida");
			System.out.println("5.-salir");
			System.out.println("elija una opcion: ");
			opc=tec.nextInt();
			switch (opc)
			{
			case 1:
				System.out.println("cual comida agregara?: ");
				dato=tec.next();
				p.agr(dato);
				break;
			case 2:
				p.eli();
				break;
			case 3:
				p.mos();
				break;
			case 4:
				System.out.println("cual comida busca?: ");
				dato=tec.next();
				if(p.bus(dato))
					System.out.println("comida encontrada");
				else 
					System.out.println("comida no encontrada");
				break;
				default:
					System.out.println("elija otra opcion");
			}
		}while (opc!=5);

	}

}
